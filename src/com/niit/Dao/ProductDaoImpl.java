package com.niit.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.niit.Model.Category;
import com.niit.Model.Product;
import com.niit.Util.HibernateUtil;

public class ProductDaoImpl implements ProductDao {

	@Override
	public boolean addProduct(Product product) {
		if(product.getCatid()==0) {
			System.out.println("Category id not added");
			product.setCatid(1);
		}else {
			System.out.println("\n______________________________________"+product.getCatid());
		}
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tt = session.beginTransaction();
		session.save(product);
		session.flush();
		tt.commit();
		return true;
	}
	
	public List<Product> getAllproduct(){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tt = session.beginTransaction();
		Query qq = session.createQuery("from Product");
		List<Product> productList = (List<Product>)qq.list();
		session.flush();
		tt.commit();
		
		return productList;
		
	}

	
	@Override
	public boolean deleteProduct(int Productid) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session =sf.openSession();
		Transaction tt = session.beginTransaction();
		session.delete(getProductById(Productid));
		session.flush();
		tt.commit();
		session.close();
		return true;
		
		
	}

	@Override
	public Product getProductById(int Pid) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session =sf.openSession();
		Transaction tt = session.beginTransaction();
		Product product=(Product) session.get(Product.class,Pid);
		session.flush();
		tt.commit();
		session.close();
		return product;
		
	
	}
	
	
	@Override
	public boolean updateProduct(Product product) {
		boolean result=false;
		try {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tt = session.beginTransaction();
		session.update(product);
		tt.commit();
		session.flush();
		result=true;
		}catch(Exception e) {
			System.out.println("hii"+e);
		}
		
		return result;
	}

	@Override
	public List<Product> getCategoryimg(int getimage) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tt = session.beginTransaction();
		Query qq = session.createQuery("from Product Where catid=" +getimage);
		List<Product> productList = (List<Product>)qq.list();
		session.flush();
		tt.commit();
		
		return productList;
	}


}
