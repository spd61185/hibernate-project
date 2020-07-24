package com.satish.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab5B {
	public static void main(String[] args) {
		Transaction tx= null;
		try {
			SessionFactory sf = CHibernateUtil.getSessionFacotry();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			System.out.println("Record Fetched...");
			
			Student stud = session.load(Student.class, 1);
			System.out.println(stud);
			
			tx.commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			if(tx != null)
				tx.rollback();
		}
	}
}
