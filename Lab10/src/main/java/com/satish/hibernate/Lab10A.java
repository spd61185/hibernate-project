package com.satish.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10A {
	public static void main(String[] args) {
		Transaction tx= null;
		try {
			SessionFactory sf = CHibernateUtil.getSessionFacotry();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			Customer cust = new Customer("Ms", "Dhoni", "ms@crc", 87654);
			session.save(cust);
			
			Address addr = new Address("Ranchi", "Mecon", "JH");
			session.save(addr);
			
			cust.setAddress(addr);
			
			tx.commit();
			session.close();
			System.out.println("Record inserted");
		}catch (Exception e) {
			e.printStackTrace();
			if(tx != null)
				tx.rollback();
		}
	}
}
