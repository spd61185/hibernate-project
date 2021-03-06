package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Test1 {
	public static void main(String[] args) {
		Transaction tx= null;
		try {
			SessionFactory sf = CHibernateUtil.getSessionFacotry();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			Employee emp = session.load(Employee.class, 1);
			System.out.println(emp.getId()+"\t"+emp.getName());
			
			
			//Customer cust = session.load(Customer.class, 1);
			//System.out.println(cust.getCid()+"\t"+cust.getCname()+"\t"+cust.getEmail()+"\t"+cust.getPhone()+"\t"+cust.getBal()+"\t"+cust.getCity());
			//session.save(cust);
			
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
