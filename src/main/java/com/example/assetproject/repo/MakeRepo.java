package com.example.assetproject.repo;
import com.example.assetproject.domain.Make;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface MakeRepo extends JpaRepository<Make, Long> {
	public Optional<Make> findByName(String name);
}
