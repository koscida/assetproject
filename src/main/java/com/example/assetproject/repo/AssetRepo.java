package com.example.assetproject.repo;
import com.example.assetproject.domain.Asset;
import org.springframework.data.repository.CrudRepository;
public interface AssetRepo extends CrudRepository<Asset, Long> {

	public Asset findByCode(String code);
}
