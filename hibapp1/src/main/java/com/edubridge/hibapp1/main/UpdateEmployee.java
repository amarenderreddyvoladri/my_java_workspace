package com.edubridge.hibapp1.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.edubridge.hibapp1.model.Employee;

// To Update the Table row using session.update().

public class UpdateEmployee {
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
		Employee emp = session.get(Employee.class, 2);
		emp.setEmployeeSalary(75000.0);
		
		Transaction tx = session.beginTransaction();
		
		try {
			session.update(emp); //to perform INSERT Operation.
			tx.commit();
			System.out.println("Success!");
		}catch(Exception e) {
			tx.rollback();
			System.out.println("Somethning went Wrong!!");
			System.out.println(e);
		}
		
		//Closing the Resources.
		session.close();
		factory.close();				
	}
}
