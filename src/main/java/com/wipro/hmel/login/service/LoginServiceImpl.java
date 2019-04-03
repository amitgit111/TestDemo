package com.wipro.hmel.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.hmel.login.dao.LoginDao;
import com.wipro.hmel.login.entity.LoginConfig;

@Service("LoginServiceImpl")
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDao ss;

	@Override
	public String registerUser(LoginConfig se) {
		
		return ss.registerUser(se);
	}

	@Override
	public String showData() {
		return ss.showData();
	}

}
