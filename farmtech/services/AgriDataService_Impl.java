package com.farmtech.farmtech.services;

import com.farmtech.farmtech.dao.AgriDataDao;
import com.farmtech.farmtech.entities.AgriData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgriDataService_Impl implements AgriDataService{

    @Autowired
    private AgriDataDao agriDataDao;

    @Override
    public AgriData getAgriData(long id) {
        List<AgriData> list = agriDataDao.findAll();
        AgriData agriData = null;
        for (AgriData a : list) {
            if (a.getId() == id) {
                agriData = a;
                break;
            }
        }
        return agriData;
    }

    @Override
    public AgriData addAgriData(AgriData agriData) {
        return agriDataDao.save(agriData);
    }
}
