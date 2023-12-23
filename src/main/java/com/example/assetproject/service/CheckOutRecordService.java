package com.example.assetproject.service;
import com.example.assetproject.domain.Asset;
import com.example.assetproject.domain.CheckOutRecord;
import com.example.assetproject.domain.Profile;
import com.example.assetproject.domain.Status;
import com.example.assetproject.repo.AssetRepo;
import com.example.assetproject.repo.CheckOutRecordRepo;
import com.example.assetproject.repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class CheckOutRecordService {
	private CheckOutRecordRepo checkOutRecordRepo;
	private AssetRepo assetRepo;
	private ProfileRepo profileRepo;

	@Autowired
	public CheckOutRecordService(CheckOutRecordRepo checkOutRecordRepo, AssetRepo assetRepo, ProfileRepo profileRepo) {
		this.checkOutRecordRepo = checkOutRecordRepo;
		this.assetRepo = assetRepo;
		this.profileRepo = profileRepo;
	}

	/**
	 * Creates a new CheckOutRecord object and saves it to database
	 *
	 * @param assetStatus
	 * @param assetCode
	 * @param profileEmail
	 *
	 * @return the new CheckOutRecord object that was saved to the database
	 */
	public CheckOutRecord createCheckOutRecord(Status assetStatus, String assetCode, String profileEmail) {
		// check if incoming asset name exists
		Asset asset = assetRepo.findByCode(assetCode).orElseThrow(() ->
			new RuntimeException("Asset does not exist: " + assetCode)
		);
		// check if incoming profile email exists
		Profile profile = profileRepo.findByEmail(profileEmail).orElseThrow(() ->
			new RuntimeException("Profile does not exist: " + profileEmail)
		);

		// create and save
		return checkOutRecordRepo.save(new CheckOutRecord(assetStatus, asset, profile));
	}
}
