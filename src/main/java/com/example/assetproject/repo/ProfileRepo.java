package com.example.assetproject.repo;
import com.example.assetproject.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProfileRepo extends JpaRepository<Profile, Long> {
	public Profile findByEmail(String email);
}
