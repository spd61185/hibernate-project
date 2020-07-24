package com.satish.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab2B {
	public static void main(String[] args) {
		Transaction tx= null;
		try {
			SessionFactory sf = CHibernateUtil.getSessionFacotry();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			System.out.println("Record Fectched...");
			Customer cust = session.load(Customer.class, 2);
			System.out.println(cust.getCid()+"\t"+cust.getCname()+"\t"+cust.getEmail()+"\t"+cust.getCity()+"\t"+cust.getPhone()+"\t"+cust.getBal());
			
			tx.commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			if(tx != null)
				tx.rollback();
		}
	}
}
