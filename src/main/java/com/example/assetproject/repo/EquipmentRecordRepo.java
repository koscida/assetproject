package com.example.assetproject.repo;
import com.example.assetproject.domain.EquipmentRecord;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EquipmentRecordRepo extends JpaRepository<EquipmentRecord, Long> {
}
