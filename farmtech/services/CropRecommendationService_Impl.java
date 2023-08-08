package com.farmtech.farmtech.services;

import com.farmtech.farmtech.dao.AgriDataDao;
import com.farmtech.farmtech.entities.AgriData;
import com.farmtech.farmtech.entities.CropRecommendation;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CropRecommendationService_Impl implements CropRecommendationService {
    @Autowired
    private AgriDataDao agriDataDao;

    @Override
    public CropRecommendation addCropRecommendation(String adhaarId) throws JSONException {
        JSONObject object = createJSONObjectAgriData(agriDataDao.findAgriDataByAdhaarId(adhaarId));
        CropRecommendation cropRecommendation = process(object, agriDataDao.findAgriDataByAdhaarId(adhaarId));
        return cropRecommendation;
    }

    private CropRecommendation process(JSONObject object, AgriData agriData) {
        String result = "";
        result = callPythonAndGetResult(object);
        return new CropRecommendation(agriData.getId(), agriData.getAdhaarId(), result);
    }

    private String callPythonAndGetResult(JSONObject object) {
        /** IMPLEMENT THIS*/
        return "Rice!!";
    }

    public static JSONObject createJSONObjectAgriData(AgriData agriData) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", agriData.getId());
        jsonObject.put("name", agriData.getName());
        jsonObject.put("adhaarId", agriData.getAdhaarId());
        jsonObject.put("country", agriData.getCountry());
        jsonObject.put("nitrogen", agriData.getNitrogen());
        jsonObject.put("potassium", agriData.getPotassium());
        jsonObject.put("phosphorus", agriData.getPhosphorus());
        jsonObject.put("temperature", agriData.getTemperature());
        jsonObject.put("rainfall", agriData.getRainfall());
        jsonObject.put("humidity", agriData.getHumidity());
        jsonObject.put("pH", agriData.getpH());
        return jsonObject;
    }
}
