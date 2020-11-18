package com.spring.demo2.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InstructorDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Instructor.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
		
			session.beginTransaction();

			
		

			session.getTransaction().commit();

			
		} finally {

			factory.close();

		}

	}

}
