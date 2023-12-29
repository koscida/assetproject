package com.example.assetproject.repo;
import com.example.assetproject.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectRepo extends JpaRepository<Project, Long> {

	public Optional<Project> findByCode(String code);
}
