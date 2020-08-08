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
			Customer cust = session.get(Customer.class, 1);
			session.getTransaction().commit();
			session.close();
			
			//System.out.println(cust.getCid()+"\t"+cust.getCname()+"\t"+cust.getEmail()+"\t"+cust.getCity()+"\t"+cust.getPhone()+"\t"+cust.getBal());
			
			Session session2 = sf.openSession();
			session2.beginTransaction();
			Customer cust1 = session2.get(Customer.class, 1);
			session2.getTransaction().commit();
				
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			if(tx != null)
				tx.rollback();
		}
	}
}
