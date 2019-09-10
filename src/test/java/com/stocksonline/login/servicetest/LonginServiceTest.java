package com.stocksonline.login.servicetest;

import com.stocksonline.login.dao.LoginRepo;
import com.stocksonline.login.dao.LoginRepoImpl;
import com.stocksonline.login.services.LoginService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
@RunWith(MockitoJUnitRunner.class)
public class LonginServiceTest {
    @Mock
    private LoginService loginService;
//    @Inject  Mocks
//    private LoginRepoImpl loginRepo;
    @Before
    public  void config()
    {
        doReturn(true).when(loginService).loginValidate("prahalladrao@gmail.com","praha123");
        doReturn(false).when(loginService).loginValidate("prahalladrao@gmail.com","wrongpassword");
        doReturn( false).when(loginService).loginValidate("wrongusername","praha123");
//        doReturn(false).when(loginRepo).findByEmail("prahalladrao@gmail.com");
//        doReturn(false).when(loginRepo).findByEmail("wrongusername");
    }
    @Test
    public void loginValidateSuccessful()
    {

       Assert.assertTrue(loginService.loginValidate("prahalladrao@gmail.com","praha123"));
    }
    @Test
    public void  loginValidateUserNameIncorrect()
    {
        Assert.assertFalse(loginService.loginValidate("wrongusername","praha123"));
    }
    @Test
    public void  loginValidatePasswordIncorrect()
    {
        Assert.assertFalse(loginService.loginValidate("prahalladrao@gmail.com","wrongpassword"));
    }
}
