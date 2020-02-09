package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.AddressBean;
import com.bean.EmployeeBean;

public class EmpClient {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	EmployeeBean employeeBean = new EmployeeBean();
	employeeBean.setEid(101);
	employeeBean.setFirstName("M");
	employeeBean.setLastName("Venkat");
	employeeBean.setAddress("HYD");
	employeeBean.setAge(30);
	employeeBean.setPhoneNum(814);
	employeeBean.setEid(102);
	employeeBean.setFirstName("G");
	employeeBean.setLastName("Krishna");
	employeeBean.setAddress("US");
	employeeBean.setAge(30);
	employeeBean.setPhoneNum(25);
	Session session1 = factory.openSession();
	AddressBean add = new AddressBean();
	add.setAid(101);
	add.setpAdd("RCL");
	add.setcAdd("HYD");
	session.save(add);
	session.save(employeeBean);
	tx.commit();
	session1.close();
	session.close();
	
}
}
