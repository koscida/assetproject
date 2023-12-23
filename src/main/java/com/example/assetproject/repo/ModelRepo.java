package com.example.assetproject.repo;
import com.example.assetproject.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface ModelRepo extends JpaRepository<Model, Long> {
	public Optional<Model> findByName(String name);
}
