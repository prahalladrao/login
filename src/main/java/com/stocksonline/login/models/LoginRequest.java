package com.stocksonline.login.models;

import org.springframework.stereotype.Component;


import java.io.Serializable;
@Component
public class LoginRequest implements Serializable {
    private String userName;
    private String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
