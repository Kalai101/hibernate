package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		Configuration c = new Configuration().configure();
		SessionFactory sessionFactory = c.buildSessionFactory();
		
		return sessionFactory;
	}
	
	
}






