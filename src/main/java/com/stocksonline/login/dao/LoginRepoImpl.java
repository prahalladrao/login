package com.stocksonline.login.dao;

import com.stocksonline.login.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;
@Repository
public class LoginRepoImpl implements LoginRepo{
    private static Logger logger=LoggerFactory.getLogger(LoginRepo.class);
    @Autowired
    JdbcTemplate jdbctemplate;
    @Override
    public  User findByEmail(String userName) {

        System.out.println("repo "+userName);
         try
         {
             User user = jdbctemplate.queryForObject("select * from user where email=?", new Object[]{userName}, new BeanPropertyRowMapper<User>(User.class));
             return user;
         }
         catch(Exception e)
         {
            logger.info("exception occured:{}",e.getMessage());
         }
//      if(user!=null)
//      System.out.println(user.toString());
        return null;
    }
}
