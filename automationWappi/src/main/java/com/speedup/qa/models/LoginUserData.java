package com.speedup.qa.models;

public class LoginUserData {
    private String user;
    private String password;

    public LoginUserData (String user, String password){
        this.user = user;
        this.password = password;
    }
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
