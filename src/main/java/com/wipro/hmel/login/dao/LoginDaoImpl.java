package com.wipro.hmel.login.dao;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.hmel.login.entity.LoginConfig;

@Repository
public class LoginDaoImpl implements LoginDao
{
	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(LoginDaoImpl.class);	
	@Autowired
	QueryHandlerDao queryHandler;
	String query,md5 = null;
	String content,contentencode,password = null;
	String msg= null;
	List<Object[]> arr = null;
	int i,k;
	Date date = new Date();  
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Override
	public String registerUser(LoginConfig se) {
		content = se.getData();
		query="SELECT * FROM insertdata('"+se.getData()+"')";
		queryHandler.updateIncident(query);
		return "{\"Message\""+":"+"\"Success\"}";
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String showData() {
		List data = new ArrayList();
		query="select * from showgender";
		arr=queryHandler.selectIncident(query);
		System.out.println("Result:"+arr);
		return "{\"Message\""+":"+"\""+arr.toString()+"\"}";
	}
	
	
	
}
