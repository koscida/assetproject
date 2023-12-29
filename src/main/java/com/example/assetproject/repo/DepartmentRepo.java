package com.example.assetproject.repo;
import com.example.assetproject.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

	public Optional<Department> findByCode(String code);
}
