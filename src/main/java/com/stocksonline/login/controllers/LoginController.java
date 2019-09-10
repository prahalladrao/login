package com.stocksonline.login.controllers;
import com.stocksonline.login.models.LoginFailResponse;
import com.stocksonline.login.models.LoginRequest;
import com.stocksonline.login.models.LoginResponse;
import com.stocksonline.login.models.UnauthorizedException;
import com.stocksonline.login.services.LoginService;
import com.stocksonline.login.token.TokenHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/v1/login")
public class LoginController {
	private Logger logger= LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private LoginService loginService;
	@Autowired
	private TokenHandler tokenHandler;
	@Autowired
    private LoginResponse loginResponse;
    @Autowired
    private LoginFailResponse loginFailResponse;
//	@Autowired
//	private UnauthorizedException exception;
	//private HttpHeaders httpHeaders;
	@PostMapping
	public ResponseEntity login(@RequestBody LoginRequest login)
	{

	   // System.out.println("controller "+login.getUserName());
		loginFailResponse.setStatusCode("1003");
		loginFailResponse.setStatusMessage("incorrect username or password");
//		httpHeaders=new HttpHeaders();
//		httpHeaders.add("statusCode","1003");
//		httpHeaders.add("statusMessage","incorrect username or password");
		if(loginService.loginValidate(login.getUserName(),login.getPassword()))
		{
			try
			{
				loginResponse.setToken( tokenHandler.createToken(login.getUserName()));
				return new ResponseEntity(loginResponse.getToken(),HttpStatus.OK);
			}
			catch(Exception e)
			{
				logger.info("exception occured: {}",e.getStackTrace());

//				throw exception;
				return new ResponseEntity(loginFailResponse,HttpStatus.UNAUTHORIZED);
			}
		}
		logger.info("invalid user credentials");
		//throw exception;
		return new ResponseEntity(loginFailResponse,HttpStatus.UNAUTHORIZED);
				
	}
	

}
