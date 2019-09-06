package com.stocksonline.login.controllers;
import com.stocksonline.login.models.LoginRequest;
import com.stocksonline.login.models.LoginResponse;
import com.stocksonline.login.models.UnauthorizedException;
import com.stocksonline.login.services.LoginService;
import com.stocksonline.login.token.TokenHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/login")
public class LoginController {
	private Logger logger= LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private LoginService loginService;
	private TokenHandler tokenHandler;
	@Autowired
    private LoginResponse loginResponse;
	@PostMapping
	public LoginResponse login(@RequestBody LoginRequest login)
	{

	    System.out.println("controller "+login.getUserName());
		if(loginService.loginValidate(login.getUserName(),login.getPassword()))
		{
			try
			{
                tokenHandler=new TokenHandler(login.getUserName());
				loginResponse.setToken( tokenHandler.createToken());
				return loginResponse;
			}
			catch(Exception e)
			{
				logger.info("Exception occured: {}",UnauthorizedException.class);
                 throw new UnauthorizedException();
			}
		}
		logger.info("Exception occured: {}",UnauthorizedException.class);
		throw new UnauthorizedException();
				
	}
	

}
