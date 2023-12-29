package com.example.assetproject.web;
import com.example.assetproject.domain.Profile;
import com.example.assetproject.service.EquipmentRecordService;
import com.example.assetproject.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/profiles/{profileId}/equipmentRecords")
public class EquipmentRecordController {

	private EquipmentRecordService equipmentRecordService;

	private ProfileService profileService;

	@Autowired
	public EquipmentRecordController(EquipmentRecordService equipmentRecordService, ProfileService profileService) {
		this.equipmentRecordService = equipmentRecordService;
		this.profileService = profileService;
	}

	protected EquipmentRecordController(){}



	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createEquipmentRecord(@PathVariable (value="profileId") Long profileId, @RequestBody @Validated RecordDTO recordDTO){
		Profile profile = this.profileService.getProfile(profileId);
		equipmentRecordService.createNewRecord(profile, recordDTO);
	}




}
