package com.farmtech.farmtech.services;

import com.farmtech.farmtech.dao.AgriDataDao;
import com.farmtech.farmtech.dao.UserDataDao;
import com.farmtech.farmtech.entities.UserData;
import org.springframework.stereotype.Service;

@Service
public class UserDataService_Impl implements UserDataService{
    private final AgriDataDao agriDataDao;
    private final UserDataDao userDataDao;

    public UserDataService_Impl(AgriDataDao agriDataDao,
                                UserDataDao userDataDao) {
        this.agriDataDao = agriDataDao;
        this.userDataDao = userDataDao;
    }

    @Override
    public UserData getUserData(long id) {
        return userDataDao.getById(id);
    }

    @Override
    public String addUserData(UserData userData) {
        if (!userDataDao.getUserDataByAdhaarIdContains(userData.getAdhaarId()).isEmpty()) {
            return "User already exists!";
        } else {
            try{
                userDataDao.save(userData);
                return "User data successfully created!";
            } catch(Exception e) {
                return "Error uploading/creating user data!";
            }
        }
    }

    @Override
    public String updateUserData(UserData userData) {
        if (userDataDao.getUserDataByAdhaarIdContains(userData.getAdhaarId()).isEmpty()) {
            try{
                userDataDao.save(userData);
                return "User Data Does not exist. New User data created!";
            } catch(Exception e) {
                return "User Data does not exist. Error updating/creating user data!";
            }
        } else {
            try{
                userDataDao.save(userData);
                return "User data successfully updated!";
            } catch(Exception e) {
                return "Error updating user data!";
            }
        }
    }
}
