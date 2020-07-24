package com.satish.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab4B {
	public static void main(String[] args) {
		Transaction tx= null;
		try {
			SessionFactory sf = CHibernateUtil.getSessionFacotry();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			System.out.println("Record Fetched...");
			
			Student stud = session.load(Student.class, 1);
			System.out.println(stud.getSid()+"\t"+stud.getSname()+"\t"+stud.getDob());
			
			for(String cn:stud.getCourses()) {
				System.out.println(cn);
			}
			
			System.out.println(stud.getEmails());
			System.out.println(stud.getMarks());
			System.out.println(stud.getPhones());
			System.out.println(stud.getRefes());
			
			
			tx.commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			if(tx != null)
				tx.rollback();
		}
	}
}
