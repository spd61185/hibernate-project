package com.satish.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab5A {
	public static void main(String[] args) {
		Transaction tx= null;
		try {
			SessionFactory sf = CHibernateUtil.getSessionFacotry();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			//1. Adding student
			Student stud = new Student("Satish", "Bangalore", "True", 15000.0);
			Integer it = (Integer) session.save(stud);
			System.out.println(it.intValue());
			
			//2. Adding the CurrnetStudent
			CurrentStudent cstu = new CurrentStudent("Manish", "Delhi", "True", 15000.0, 2000, "7:30am", "BTM");
			it = (Integer) session.save(cstu);
			System.out.println(it.intValue());
			
			//3. Adding the old Student
			OldStudent ostu = new OldStudent("Ms", "Ranchi", "True", 15000.0, "SAP", "sa@sap", 9.0);
			it = (Integer) session.save(ostu);
			System.out.println(it.intValue());
			
			//4. Adding the Regulat Student
			WeekdayStudent wdstu = new WeekdayStudent("Virat", "Delhi", "True", 15000.0, 2000, "4pm", "CHAN", "MCA", "74", 3);
			it = (Integer) session.save(wdstu);
			System.out.println(it.intValue());
			
			WeekendStudent wstu = new WeekendStudent("Rohit", "Mumbai", "True", 15000.0, 2000, "2pm", "HSR", "Wissne", "r@ws", 9.0);
			it = (Integer) session.save(wstu);
			System.out.println(it.intValue());
			
			
			tx.commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			if(tx != null)
				tx.rollback();
		}
	}
}
