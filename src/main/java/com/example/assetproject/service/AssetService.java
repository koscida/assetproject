package com.example.assetproject.service;
import com.example.assetproject.domain.Asset;
import com.example.assetproject.domain.Make;
import com.example.assetproject.domain.Model;
import com.example.assetproject.domain.Status;
import com.example.assetproject.repo.AssetRepo;
import com.example.assetproject.repo.MakeRepo;
import com.example.assetproject.repo.ModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AssetService {
	private AssetRepo assetRepo;
	private MakeRepo makeRepo;
	private ModelRepo modelRepo;

	// constructor

	@Autowired
	public AssetService(AssetRepo assetRepo, MakeRepo makeRepo, ModelRepo modelRepo) {
		this.assetRepo = assetRepo;
		this.makeRepo = makeRepo;
		this.modelRepo = modelRepo;
	}
	/**
	 * Creates a new Asset object and adds it to the database
	 *
	 * @param status
	 * @param code
	 *
	 * @return Asset entity
	 */
	public Asset createAsset(Status status, String code) {

		// create and save
		return assetRepo.findByCode(code)
				.orElse(assetRepo.save(new Asset(status, code)));
	}

	/**
	 * Calculate the total number of assets in the database
	 *
	 * @return numerical total
	 */
	public long total() { return assetRepo.count(); }


}
