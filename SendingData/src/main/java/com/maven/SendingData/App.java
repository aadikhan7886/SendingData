package com.maven.SendingData;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws Exception {
		SessionFactory sf1 = new Configuration().configure().buildSessionFactory();
		SessionFactory sf2 = new Configuration().configure("hibernateForOracle.cfg.xml").buildSessionFactory();

		Session s1 = sf1.openSession();
		Session s2 = sf2.openSession();

		Transaction tr = s1.beginTransaction();
		Transaction tr1 = s2.beginTransaction();
		Employee emp1 = new Employee(1, "Dominic", 55000.00, "London", 8308003323L);
		Employee emp2 = new Employee(2, "sohail", 85000.00, "Aurangabad", 8668556328L);
		Employee emp3 = new Employee(3, "Aadi", 75000.00, "Nanded", 9876543210L);
		Employee emp4 = new Employee(4, "Kaustubh", 62000.00, "Pune", 9638527410L);
		Employee emp5 = new Employee(5, "Upendra", 55000.00, "Mumbai", 7896541230L);
		Employee emp6 = new Employee(6, "Mudy", 55000.00, "Hydrabad", 8796541230L);
		s1.save(emp1);
		s1.save(emp2);
		s1.save(emp3);
		s1.save(emp4);
		s1.save(emp5);
		s1.save(emp6);

		/*
		 * s2.save(emp1); s2.save(emp2); s2.save(emp3); s2.save(emp4); s2.save(emp5);
		 * s2.save(emp6);
		 */

		tr.commit();
		System.out.println("data saved in MYSQL");
		// System.out.println("data saved in ORACLE");
		s1.clear();
		s2.clear();
		System.out.println("\n***************************************************************");
		System.out.println("Retrieving data from MySql");
		Employee e1 = (Employee) s1.get(Employee.class, 4);
		System.out.println(e1);

		System.out.println("\n***************************************************************");
		System.out.println("Retrieved data from MqSql e1 saved in Oracle");
		s2.save(e1);
		tr1.commit();

		System.out.println("\n***************************************************************");
		System.out.println("Retrieving data from ORACLE");
		Employee e2 = (Employee) s2.get(Employee.class, 4);
		System.out.println(e2);
	}
}
