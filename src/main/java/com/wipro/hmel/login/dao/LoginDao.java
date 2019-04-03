package com.wipro.hmel.login.dao;

import java.util.List;

import com.wipro.hmel.login.entity.LoginConfig;

public interface LoginDao 
{	
	public String registerUser(LoginConfig se);

	public String showData();
}
