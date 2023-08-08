package com.farmtech.farmtech.services;

import com.farmtech.farmtech.entities.AgriData;

public interface AgriDataService {
    AgriData getAgriData(long id);
    AgriData addAgriData(AgriData agriData);
}
