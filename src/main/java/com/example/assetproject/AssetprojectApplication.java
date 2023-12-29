package com.example.assetproject;

import com.example.assetproject.service.AssetService;
import com.example.assetproject.service.EquipmentRecordService;
import com.example.assetproject.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
@SpringBootApplication
public class AssetprojectApplication implements CommandLineRunner {

	@Autowired
	private AssetService assetService;

	@Autowired
	private EquipmentRecordService equipmentRecordService;

	@Autowired
	private ProfileService profileService;

	public static void main(String[] args) {
		SpringApplication.run(AssetprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		loadAtStartup();
	}

	private void loadAtStartup() throws IOException {

	}

}
