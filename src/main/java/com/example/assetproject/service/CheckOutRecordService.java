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
	public CheckOutRecordService(CheckOutRecordRepo checkOutRecordRepo, AssetRepo assetRepo, ProfileRepo profileRepo) {
		this.checkOutRecordRepo = checkOutRecordRepo;
		this.assetRepo = assetRepo;
		this.profileRepo = profileRepo;
	}
	@Autowired


	public CheckOutRecord createCheckOutRecord(String assetCode, String profileEmail, Date checkOutDate, Date returnDate, Status finalAssetStatus) {
		Asset asset = assetRepo.findByCode(assetCode).orElseThrow(() -> {
			new RuntimeException("Asser does not exist: " + assetCode);
		});

		Profile profile = profileRepo.findByEmail(profileEmail).orElseThrow(() -> {
			new RuntimeException("Profile does not exist: " + profileEmail);
		});

		return checkOutRecordRepo.save(new CheckOutRecord(asset, profile));
	}
}
