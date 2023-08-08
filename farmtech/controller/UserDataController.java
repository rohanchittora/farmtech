package com.farmtech.farmtech.controller;

import com.farmtech.farmtech.entities.UserData;
import com.farmtech.farmtech.services.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


public class UserDataController {

    @Autowired
    private UserDataService userDataService;

    @GetMapping("/userData/{id}")
    public UserData getUserData(@PathVariable String id) {
        return this.userDataService.getUserData(Long.parseLong(id));
    }

    @PostMapping(path = "/userData", consumes = "application/json")
    public String addUserData(@RequestBody UserData userData) {
        return this.userDataService.addUserData(userData);
    }

    @PatchMapping(path = "/userData", consumes = "application/json")
    public String updateUserData(@RequestBody UserData userData) {
        return this.userDataService.updateUserData(userData);
    }
}
