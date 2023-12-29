package com.example.assetproject.service;
import com.example.assetproject.domain.*;
import com.example.assetproject.repo.*;
import com.example.assetproject.web.RecordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentRecordService {
	private EquipmentRecordRepo equipmentRecordRepo;
	private AssetRepo assetRepo;
	private ProfileRepo profileRepo;

	private DepartmentRepo departmentRepo;

	private ProjectRepo projectRepo;

	@Autowired
	public EquipmentRecordService(EquipmentRecordRepo equipmentRecordRepo, AssetRepo assetRepo, ProfileRepo profileRepo, DepartmentRepo departmentRepo, ProjectRepo projectRepo) {
		this.equipmentRecordRepo = equipmentRecordRepo;
		this.assetRepo = assetRepo;
		this.profileRepo = profileRepo;
		this.departmentRepo = departmentRepo;
		this.projectRepo = projectRepo;
	}

	/**
	 * Creates a new CheckOutRecord object and saves it to database
	 *
	 * @param profile
	 * @param recordDTO
	 *
	 * @return the new EquipmentRecord object that was saved to the database
	 */
	public EquipmentRecord createNewRecord(Profile profile, RecordDTO recordDTO){

		// create and save
		return equipmentRecordRepo.save(new EquipmentRecord(recordDTO.getStatus(), profile));
	}
}
