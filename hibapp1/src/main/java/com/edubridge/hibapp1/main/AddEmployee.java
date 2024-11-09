package com.edubridge.hibapp1.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.edubridge.hibapp1.model.Employee;

public class AddEmployee {
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
		Employee emp = session.get(Employee.class, id);
		
		if(emp != null) {
			System.out.println(emp);
		}
		else {
			System.out.println("No Employee Details Found!!");
		}
		
		
		//Closing the Resources.
		session.close();
		factory.close();
		
		
	}
}


