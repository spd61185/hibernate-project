package com.satish.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab4A {
	public static void main(String[] args) {
		Transaction tx= null;
		try {
			SessionFactory sf = CHibernateUtil.getSessionFacotry();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			System.out.println("Record inserted...");
			
			String[] courses = {"Java","JDBC","JSP"};
			List<String> emails = new ArrayList<String>();
			emails.add("satish@gmail.com");
			emails.add("ms@gmail.com");
			emails.add("kl@gmail.com");
			
			List<Integer> marks = new ArrayList<Integer>();
			marks.add(new Integer(200));
			marks.add(new Integer(300));
			marks.add(new Integer(400));
			
			Set<Long> phns = new HashSet<Long>();
			phns.add(new Long(111));
			phns.add(new Long(222));
			phns.add(new Long(333));
			
			Map<String, Long> refs = new HashMap<String, Long>();
			refs.put("satish", new Long(111));
			refs.put("MS", new Long(222));
			refs.put("kl", new Long(333));
			
			Student stud = new Student("Kaushik", "10-10-10", "B.Sc", courses, emails, marks, phns, refs);
			
			session.save(stud);
			
			tx.commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			if(tx != null)
				tx.rollback();
		}
	}
}
