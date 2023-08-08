package com.farmtech.farmtech.dao;

import com.farmtech.farmtech.entities.AgriData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgriDataDao extends JpaRepository<AgriData, Long> {
    AgriData findAgriDataByAdhaarId(String adhaarId);
}
