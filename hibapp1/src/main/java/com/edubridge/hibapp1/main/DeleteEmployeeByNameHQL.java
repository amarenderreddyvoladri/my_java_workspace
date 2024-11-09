package com.edubridge.hibapp1.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class DeleteEmployeeByNameHQL {
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
		String name = "Wills";
		String hql = "delete from Employee where employeeName= ?1"; //  'E' must be capital case where it is a model class name.
		
		Query q = session.createQuery(hql);
		q.setParameter(1, name);
		
		Transaction tx = session.beginTransaction();
		
		int status  = q.executeUpdate();
		
		if(status >= 1) {
			System.out.println("Successfully Deletdd!");
			tx.commit();
		}
		else {
			System.out.println("Something went Wrong!!");
		}	
		
		
		//5. Closing the Resources.
		session.close();
		factory.close();
	}
}
