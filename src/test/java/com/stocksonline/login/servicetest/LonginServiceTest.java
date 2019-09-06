//package com.stocksonline.login.servicetest;
//
//import com.stocksonline.login.dao.LoginRepo;
//import com.stocksonline.login.services.LoginService;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class LonginServiceTest {
//    @Autowired
//    private LoginService loginService;
//    @Autowired
//    private LoginRepo loginRepo;
//    @Before
//    public void config()
//    {
//      loginService.setLoginRepo(loginRepo);
//    }
//    @Test
//    public void loginValidateSuccessful()
//    {
//       Assert.assertTrue(loginService.loginValidate("prahalladrao@gmail.com","praha123"));
//    }
//    @Test
//    public void  loginValidateUnSuccessful()
//    {
//        Assert.assertFalse(loginService.loginValidate("prahallad@gmail.com","praha1234"));
//    }
//}
