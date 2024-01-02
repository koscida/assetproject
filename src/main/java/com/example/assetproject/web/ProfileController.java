package com.example.assetproject.web;

import com.example.assetproject.domain.Profile;
import com.example.assetproject.service.ProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/profiles")
public class ProfileController {

	private ProfileService profileService;

	public ProfileController(ProfileService profileService) {
		this.profileService = profileService;
	}

	//

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createProfile(@RequestBody @Validated ProfileDTO profileDTO) {
		this.profileService.createProfile(profileDTO.getFirstName(), profileDTO.getFirstName(), profileDTO.getEmail());
	}

	@PutMapping(value = "/{profileId}")
	@ResponseStatus(HttpStatus.OK)
	public void editProfile(@PathVariable Long profileId, @RequestBody @Validated ProfileDTO profileDTO) {
		this.profileService.updateProfile(profileId, profileDTO);
	}

}
