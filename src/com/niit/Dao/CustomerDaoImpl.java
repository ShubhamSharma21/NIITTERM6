package com.niit.Dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.niit.Model.CustomerDetails;
import com.niit.Util.HibernateUtil;


public class CustomerDaoImpl implements CustomerDao {
	 
	public boolean addcustomerDetails(CustomerDetails cd) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tt = session.beginTransaction();
		session.save(cd);
		session.flush();
		tt.commit();
		System.out.println("__________________________________\n"+cd.getId());
		
		CartDaoImpl cdi = new CartDaoImpl();
		cdi.addcustomer(cd.getId());
		return true;
	}
	
	public List<CustomerDetails> getAllUser(){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tt = session.beginTransaction();
		Query qq = session.createQuery("from CustomerDetails");
		List<CustomerDetails> cdList = (List<CustomerDetails>)qq.list();
		tt.commit();
		session.flush();
		return cdList;
		
	
	}
	
	
	@Override
	public List<CustomerDetails> getcustomerByusername(String username) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tt = session.beginTransaction();
		Query query = session.createQuery("from CustomerDetails where username = '"+username+"'");
		List<CustomerDetails> cdList = (List<CustomerDetails>)query.list();
		tt.commit();
		session.flush();
	
		return cdList;
	}
	

	@Override
	
	public boolean deletecustomerDetails(CustomerDetails customerusername) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session;
		try {session = sessionFactory.getCurrentSession();}
		catch(Exception e)
		{session=sessionFactory.openSession();}
		Transaction tt = session.beginTransaction();
		
		CartDaoImpl cdi = new CartDaoImpl();
		cdi.delcart(customerusername.getId());
		System.out.print(customerusername);
		session.delete(customerusername);
		tt.commit();
		session.flush();
		return true;
		
	}
	
	@Override
	public CustomerDetails validate(String email, String password) {
		
		try {
			
			SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
			Session session=sessionFactory.openSession();
			Transaction tt= session.beginTransaction();
			Query query=session.createQuery("from CustomerDetails where email=:email and password=:password");
			query.setParameter("email", email);
			query.setParameter("password", password);
			CustomerDetails c=(CustomerDetails)query.uniqueResult();
			tt.commit();
			if(c!=null) {
				System.out.println("dataget");
				return c;
			}
			else {
				System.out.println("Password & ID Miss Match");
				return null;
			}
		}
		catch (HibernateException ex) {
			
		
		
	}
		return null;
	
	}
	@Override
	public boolean updateCustomerDetail(CustomerDetails customer) {
		boolean result=false;
		try {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tt = session.beginTransaction();
		session.update(customer);
		tt.commit();
		session.flush();
		result=true;
		}catch(Exception e) {
			System.out.println("hii"+e);
		}
		
		return result;
	}
	@Override
	public CustomerDetails getCustomerById(int dataid) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tt = session.beginTransaction();
		CustomerDetails cd =(CustomerDetails) session.get(CustomerDetails.class, dataid );
		tt.commit();
		session.flush();
		
		
		return cd;
	}
	
	
	
	}
	
	