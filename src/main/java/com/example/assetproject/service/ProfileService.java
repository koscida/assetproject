package com.example.assetproject.service;
import com.example.assetproject.domain.Profile;
import com.example.assetproject.repo.ProfileRepo;
import com.example.assetproject.web.ProfileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProfileService {
	private ProfileRepo profileRepo;
	private EquipmentRecordService equipmentRecordService;


	@Autowired
	public ProfileService(ProfileRepo profileRepo, EquipmentRecordService equipmentRecordService) {
		this.profileRepo = profileRepo;
		this.equipmentRecordService = equipmentRecordService;
	}

	/**
	 * Will create a new Profile object and save it to the database
	 *
	 * @param firstName
	 * @param lastName
	 * @param email
	 *
	 * @return The new Profile object that was created
	 */
	public Profile createProfile(String firstName, String lastName, String email) {
		// return profile if exists, or create and save
		return this.profileRepo.findByEmail(email)
				.orElse(this.profileRepo.save(new Profile(firstName, lastName, email)));
	}

	public Profile getProfile(Long profileId) {
		return this.profileRepo.findById(profileId)
				.orElseThrow(() -> new RuntimeException("Profile does not exist: " + profileId));
	}

	public Profile updateProfile(Long profileId, ProfileDTO profileDTO) {
		// get the profile
		Profile profileUpdates = getProfile(profileId);
		// update profile values
//		if(!profileDTO.getEmail().isEmpty())  profileUpdates.setEmail(profileDTO.getEmail());
//		if(!profileDTO.getFirstName().isBlank())  profileUpdates.setFirstName(profileDTO.getFirstName());
//		if(!profileDTO.getLastName().isEmpty())  profileUpdates.setLastName(profileDTO.getLastName());
		// save the profile
		return this.profileRepo.save(profileUpdates);
	}
}
