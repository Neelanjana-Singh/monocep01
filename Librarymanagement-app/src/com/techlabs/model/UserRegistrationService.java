package com.techlabs.model;

public class UserRegistrationService {
    private User user;

    public UserRegistrationService(User user) {
        this.user = user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void registerUser() {
        System.out.println("User Registered");
        System.out.println("User Name: " + user.getUserName() + " User Id: " + user.getUserId());
    }
}
