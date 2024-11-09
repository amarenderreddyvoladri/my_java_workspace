package com.edubridge.hibapp1.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.edubridge.hibapp1.model.Employee;

public class DeleteEmployee {
	public static void main(String[] args) {
		
		String configFile = "/com/edubridge/hibapp1/cfgs/hibernate.cfg.xml";
		
		//Steps ::: 
		// 1. bootstrap the hibernate.
		Configuration cfg = new Configuration();
		cfg.configure(configFile);
		
		// 2. Build SessionFactory Object.
		SessionFactory factory = cfg.buildSessionFactory();
		
		// 3. Create Sesssion with database.
		Session session =  factory.openSession();
		
		// 4. Perform persistant Operation.
		int id = 103;
		Employee emp = new Employee();
		emp.setEmployeeId(103);
		
		Transaction tx = session.beginTransaction();
		
		session.delete(emp);
		tx.commit();
		System.out.println("Successfully deleted!");
		
		
		//Closing the Resources.
		session.close();
		factory.close();	
		
	}
}
