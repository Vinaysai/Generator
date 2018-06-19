package com.generator.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.generator.bean.Generator;

public class GeneratorDb {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Generator gb = new Generator();

		// gb.setId(1);

		gb.setFname("sai");
		gb.setLname("vny");
		gb.setEmail("ksvinays@gmail.com");

		Generator gb1 = new Generator();

		// gb1.setId(2);

		gb1.setFname("Vin");
		gb1.setLname("sa");
		gb1.setEmail("ksvinay1@gmail.com");
		//Session session1 = factory.openSession();

		session.save(gb);
		// session1.save(gb1);
		session.save(gb1);

		System.out.println("In Session::");

		Transaction t = session.beginTransaction();

		t.commit();
		System.out.println("Over:::");

	}

}
