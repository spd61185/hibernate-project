package com.satish.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10B {
	public static void main(String[] args) {
		Transaction tx= null;
		try {
			SessionFactory sf = CHibernateUtil.getSessionFacotry();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
		Customer cust = session.load(Customer.class, 1);
		System.out.println(cust.getCid()+"\t"+cust.getFirstname()+"\t"+cust.getLasttname()+"\t"+cust.getEmail()+"\t"+cust.getPhone());
		
		Address addr = cust.getAddress();
		System.out.println(addr.getAid()+"\t"+addr.getStreet()+"\t"+addr.getCity()+"\t"+addr.getState());
		
		
			
			tx.commit();
			session.close();
			//System.out.println("Record inserted");
		}catch (Exception e) {
			e.printStackTrace();
			if(tx != null)
				tx.rollback();
		}
	}
}
