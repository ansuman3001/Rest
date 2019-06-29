package com.lti.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDAO {
	public static int register (User u) {
		int cnt=0;
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");

		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();

		//Transaction t=session.beginTransaction();
		//t.begin();
		cnt=(Integer)session.save(u);
		session.getTransaction().commit();
		//t.commit();
		session.close();
		return cnt;
		
	}
}
