package com.stocksonline.login.controllerstest;

import com.stocksonline.login.controllers.LoginController;
import com.stocksonline.login.models.UnauthorizedException;
import com.stocksonline.login.services.LoginService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class LoginControllerTest {
    @Autowired
     private LoginService loginService;
    @Autowired
    private LoginController loginController;
     @Test(expected = NullPointerException.class)
     public void checkNullInput()
     {
         loginController.login(null);
     }
}
