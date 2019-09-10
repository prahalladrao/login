package com.stocksonline.login.repositorytest;

import static org.junit.Assert.assertEquals;

import com.stocksonline.login.dao.LoginRepoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginRepo {
    @Mock
    LoginRepo loginRepo;
    @InjectMocks
    LoginRepoImpl  loginImpl;
    @Test
    public void checkfindByEmail_ReturnNull()
    {
        assertEquals(loginImpl.findByEmail(null),null);
    }
}
