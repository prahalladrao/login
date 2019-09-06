package com.stocksonline.login.models;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
@Component
@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "Unsuccesful login")
public class UnauthorizedException extends RuntimeException {

}
