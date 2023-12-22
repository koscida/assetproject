package com.example.assetproject.service;
import com.example.assetproject.domain.Asset;
import com.example.assetproject.domain.Make;
import com.example.assetproject.domain.Model;
import com.example.assetproject.domain.Status;
import com.example.assetproject.repo.AssetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AssetService {
	private AssetRepo assetRepo;

	@Autowired
	public AssetService(AssetRepo assetRepo) {
		this.assetRepo = assetRepo;
	}

	public Asset createAsset(Status status, Make make, Model model, String serialNumber, String macAddress, String code) {
		return assetRepo.findByCode(code)
				.orElse(assetRepo.save(new Asset(status, make, model, serialNumber, macAddress, code)));
	}

	public long total() { return assetRepo.count(); }


}
