package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.AddressBean;

public class AddessMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		AddressBean add = new AddressBean();
		add.setAid(101);
		add.setpAdd("RCL");
		add.setcAdd("HYD");
		session.save(add);
		tx.commit();
		session.close();

	}

}
