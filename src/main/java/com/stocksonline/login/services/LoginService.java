package com.stocksonline.login.services;

import com.stocksonline.login.dao.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    public boolean loginValidate(String userName,String password);
}
