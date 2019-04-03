package com.wipro.hmel.login.dao;

import java.util.List;

public interface QueryHandlerDao {	
public int updateIncident(String query);
@SuppressWarnings("rawtypes")
public List selectIncident(String query);

}


