package com.stocksonline.login.services;
import com.stocksonline.login.dao.LoginRepo;
import com.stocksonline.login.models.UnauthorizedException;
import com.stocksonline.login.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;




@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepo loginRepo;
  

    private static Logger logger= LoggerFactory.getLogger(LoginService.class);

    public boolean loginValidate(String userName, String password)
    {
        //System.out.println("service "+userName);
        User user= loginRepo.findByEmail(userName);
        if(user!=null)
        {
            //System.out.println(bCryptPasswordEncoder.matches(password,bCryptPasswordEncoder.encode(password)));
            if(user.getPassword().equals(passowrd))
                return true;
            logger.info("Incorrect password: {}",RuntimeException.class );
            return false;
        }
        //System.out.println(user);
        logger.info("User Not found: {}",RuntimeException.class );
        return false;
    }


}
