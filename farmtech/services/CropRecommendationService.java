package com.farmtech.farmtech.services;

import com.farmtech.farmtech.entities.AgriData;
import com.farmtech.farmtech.entities.CropRecommendation;
import org.json.JSONException;

public interface CropRecommendationService {
    CropRecommendation addCropRecommendation(String adhaarId) throws JSONException;
}
