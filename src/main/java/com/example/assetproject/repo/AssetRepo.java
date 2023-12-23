package com.example.assetproject.repo;
import com.example.assetproject.domain.Asset;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
public interface AssetRepo extends CrudRepository<Asset, Long> {

	public Optional<Asset> findByCode(String code);
}
