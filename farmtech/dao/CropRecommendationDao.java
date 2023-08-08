package com.farmtech.farmtech.dao;

import com.farmtech.farmtech.entities.CropRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropRecommendationDao extends JpaRepository<CropRecommendation, Long> {
}
