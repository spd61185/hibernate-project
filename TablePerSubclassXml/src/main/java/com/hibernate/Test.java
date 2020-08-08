package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {    
	       
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    Session session = sessionFactory.openSession(); // hession = hibernate session
	    Transaction t = session.beginTransaction();
	    
  
	        
	    Employee e1=new Employee();    
	    e1.setName("Gaurav Chawla");    
	        
	    RegularEmployee e2=new RegularEmployee();    
	    e2.setName("Vivek Kumar");    
	    e2.setSalary(50000);    
	    e2.setBonus(5);    
	        
	    ContractEmployee e3=new ContractEmployee();    
	    e3.setName("Arjun Kumar");    
	    e3.setPay_per_hour(1000);    
	    e3.setContract_duration("15 hours");    
	        
	    session.persist(e1);    
	    session.persist(e2);    
	    session.persist(e3);    
	        
	    t.commit();    
	    session.close();    
	    System.out.println("success");    
	} 
}
