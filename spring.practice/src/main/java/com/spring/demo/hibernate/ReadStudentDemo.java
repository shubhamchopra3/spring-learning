package com.spring.demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			Student student = new Student("divya", "chintarpalli", "s@gmail.com");

			session.beginTransaction();

			System.out.println("saving student");
			session.save(student);

			session.getTransaction().commit();
			
			System.out.println("generated primiary key is "+ student.getId());
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			Student myStudent = session.get(Student.class, student.getId());

			System.out.println(myStudent);
		} finally {

			factory.close();

		}

	}

}
