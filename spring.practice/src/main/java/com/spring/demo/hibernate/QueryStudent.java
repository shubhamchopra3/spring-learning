package com.spring.demo.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			

			session.beginTransaction();
			
			//read from database
			List<Student> students = session.createQuery("from Student s where s.lastName='chopra'").getResultList();
			
			//bulk update			
			session.createQuery("update Student s set email='cdivya@gmail' where s.firstName='divya'").executeUpdate();
					
			//delete 
			session.createQuery("delete from Student where id='2'").executeUpdate();
						
			session.getTransaction().commit();

			
		} finally {

			factory.close();

		}

	}

}
