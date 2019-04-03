package com.wipro.hmel.login.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
@Repository
public class QueryHandlerDaoImpl implements QueryHandlerDao
{
	@Autowired
	private  SessionFactory sessionFactory;
	
	Query q = null; int i=0;
	List<Object[]>  ar= null;
		public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
		
	
	//@Override
		public int updateIncident(String query)
		{
			Session s1 = sessionFactory.openSession();
			System.out.println("In Query Handler");
			System.out.println(query);
			q = s1.createSQLQuery(query);
			i=  (int) q.list().get(0);
			System.out.println("QueryValue :"+ i);
			s1.close();
			return i;
			
		}

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List selectIncident(String query) 
	{
		Session s1 = sessionFactory.openSession();
		ar = s1.createSQLQuery(query).list();
		s1.close();
		return ar;
	}
	
	
	
}
