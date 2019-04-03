package com.wipro.hmel.login.controller;
import com.wipro.hmel.login.entity.LoginConfig;
import com.wipro.hmel.login.service.LoginService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController 
{
	
	@Autowired
	LoginService ss;

	@CrossOrigin
	@RequestMapping(value = "/getData", method = RequestMethod.POST, headers = "Accept=application/json")
	String registerUser(@RequestBody LoginConfig se){
		return ss.registerUser(se);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/showData", method = RequestMethod.GET, headers = "Accept=application/json")
	String showData(){
		return ss.showData();
	}
	
}
