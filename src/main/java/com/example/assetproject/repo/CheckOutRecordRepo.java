package com.example.assetproject.repo;
import com.example.assetproject.domain.CheckOutRecord;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CheckOutRecordRepo extends JpaRepository<CheckOutRecord, Long> {
}
