package com.farmtech.farmtech.controller;

import com.farmtech.farmtech.entities.AgriData;
import com.farmtech.farmtech.entities.CropRecommendation;
import com.farmtech.farmtech.services.CropRecommendationService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CropRecommendationController {

    @Autowired
    private CropRecommendationService cropRecommendationService;

    //adding agriData
    @PostMapping(path = "/cropRecommendation", consumes = "application/json")
    public CropRecommendation addAndProcessCropRecommendation(@RequestBody String adhaarId) throws JSONException {
        return this.cropRecommendationService.addCropRecommendation(adhaarId);
    }
}
