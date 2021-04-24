package com.niit.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.niit.Model.Category;
import com.niit.Model.CustomerDetails;
import com.niit.Util.HibernateUtil;

public class CategoryDaoimpl implements CategoryDao {
	
	
	
	public List<Category> getAllCategory(){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tt = session.beginTransaction();
		Query qq = session.createQuery("from Category");
		List<Category> categoryList = (List<Category>)qq.list();
		session.flush();
		tt.commit();
		
		return categoryList;
		
	}
	
	@Override
	public Category getCategoryById(int catid){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tt = session.beginTransaction();
		Category category=(Category) session.get(Category.class,catid);
		session.flush();
		tt.commit();
		session.close();
		return category;
		
	}
	@Override
	public boolean deleteCategory(int catid) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session =sf.openSession();
		Transaction tt = session.beginTransaction();
		session.delete(getCategoryById(catid));
		session.flush();
		tt.commit();
		session.close();
	  
		return true;
		
	}

	@Override
	public boolean addCategory(Category category) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tt = session.beginTransaction();
		session.save(category);
		
		tt.commit();
		session.flush();
		
		return true;
	}


	
	@Override
	public boolean updateCategory(Category category) {
		boolean result=false;
		try {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tt = session.beginTransaction();
		session.update(category);
		tt.commit();
		session.flush();
		result=true;
		}catch(Exception e) {
			System.out.println("hii"+e);
		}
		
		return result;
	}


}
