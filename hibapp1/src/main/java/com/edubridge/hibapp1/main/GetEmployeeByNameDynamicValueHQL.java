package com.edubridge.hibapp1.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.edubridge.hibapp1.model.Employee;

public class GetEmployeeByNameDynamicValueHQL {
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
		System.out.println("Enter name of the employee to get details : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String hql = "from Employee where employeeName=?";
		
		// if we use ? we get exception like legacy error use ?1 .
		//  'E' must be capital case where it is a model class name.
		Query q = session.createQuery(hql);
		q.setParameter(1, name);
		List<Employee> employees = q.list();
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		//Closing the Resources.
		session.close();
		factory.close();
		sc.close();
	}
}
