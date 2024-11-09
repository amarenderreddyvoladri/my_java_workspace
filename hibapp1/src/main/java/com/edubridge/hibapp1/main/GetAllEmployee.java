package com.edubridge.hibapp1.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.edubridge.hibapp1.model.Employee;

public class GetAllEmployee {
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
		String hql = "from Employee"; //  'E' must be capital case where it is a model class name.
		Query q = session.createQuery(hql);
		List<Employee> employees = q.list();
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		//Closing the Resources.
		session.close();
		factory.close();				
	}
}
