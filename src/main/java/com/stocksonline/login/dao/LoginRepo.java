package com.stocksonline.login.dao;

import com.stocksonline.login.models.User;

public interface LoginRepo {
    User findByEmail(String userName);
}
