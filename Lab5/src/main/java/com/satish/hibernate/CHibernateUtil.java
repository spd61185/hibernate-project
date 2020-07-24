package com.satish.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CHibernateUtil {
	static SessionFactory sf;
	static {
		try {
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			sf = cfg.buildSessionFactory();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFacotry() {
		return sf;
	}
}
