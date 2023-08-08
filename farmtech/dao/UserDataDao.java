package com.farmtech.farmtech.dao;

import com.farmtech.farmtech.entities.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDataDao extends JpaRepository<UserData, Long> {
    List<UserData> getUserDataByAdhaarIdContains(String adhaarId);
}
