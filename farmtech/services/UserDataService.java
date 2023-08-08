package com.farmtech.farmtech.services;

import com.farmtech.farmtech.entities.UserData;

public interface UserDataService {
    UserData getUserData(long id);
    String  addUserData(UserData userData);

    String updateUserData(UserData userData);
}
