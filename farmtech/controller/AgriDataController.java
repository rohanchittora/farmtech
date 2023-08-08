package com.farmtech.farmtech.controller;

import com.farmtech.farmtech.entities.AgriData;
import com.farmtech.farmtech.entities.CropRecommendation;
import com.farmtech.farmtech.services.AgriDataService;
import com.farmtech.farmtech.services.CropRecommendationService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class AgriDataController {

    @Autowired
    private AgriDataService agriDataService;

    //get agriData
    @GetMapping("/agriData/{id}")
    public AgriData getAgriData(@PathVariable String id) {
        return this.agriDataService.getAgriData(Long.parseLong(id));
    }

    //adding agriData
    @PostMapping(path = "/agriData", consumes = "application/json")
    public String addAgriData(@RequestBody AgriData agriData) throws JSONException {
        AgriData a = this.agriDataService.addAgriData(agriData);
    return "AgriData Submitted!";
    }
}
