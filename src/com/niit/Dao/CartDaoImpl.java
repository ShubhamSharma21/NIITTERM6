package com.niit.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.niit.Model.Cart;
import com.niit.Model.CartItem;
import com.niit.Util.HibernateUtil;

public class CartDaoImpl implements CartDAO {

	@Override
	public boolean addcustomer(int customerId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session;
		try{ session= sessionFactory.getCurrentSession();
		}
		catch(Exception e)
		{session=sessionFactory.openSession();}
		Cart cart = new Cart();
		Transaction tt = session.beginTransaction();
		cart.setCustomerId(customerId);
		session.save(cart);
		session.flush();
		tt.commit();
		return false;
	}



	@Override
	public boolean delcart(int customerId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session;
		try {session = sessionFactory.getCurrentSession();}
		catch(Exception e)
		{session=sessionFactory.openSession();}
		Transaction tt = session.beginTransaction();
		Query qq = session.createQuery("from Cart where customerId="+customerId);
		List<Cart> cartList = (List<Cart>)qq.list();
		Cart ct = cartList.get(0);
		session.delete(ct);
		session.flush();
		tt.commit();
		return false;
	}

	@Override
	public Cart getCart(int customerId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session;
		try{session= sessionFactory.getCurrentSession();}
		catch(Exception e)
		{session=sessionFactory.openSession();}
		Transaction tt = session.beginTransaction();
		Query qq = session.createQuery("from Cart where customerId="+customerId);
		List<Cart> cartList = (List<Cart>)qq.list();
		session.flush();
		tt.commit();
		Cart ct = cartList.get(0);
		
		return ct;
	}

	@Override
	public int getCartId(int customerId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session;
		try{session= sessionFactory.getCurrentSession();}
		catch(Exception e)
		{session=sessionFactory.openSession();}
		Transaction tt = session.beginTransaction();
		Query qq = session.createQuery("from Cart where customerId="+customerId);
		List<Cart> cartList = (List<Cart>)qq.list();
		session.flush();
		tt.commit();
		Cart ct = cartList.get(0);
		
		return ct.getCartId();
	}

	//cartitem___
	
	
	@Override
	public boolean addproduct(int productId, int customerId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session;
		try{session= sessionFactory.getCurrentSession();}
		catch(Exception e)
		{session=sessionFactory.openSession();}
		CartItem cart = new CartItem();
		Transaction tt = session.beginTransaction();
		cart.setProductId(productId);
		cart.setCartId(this.getCartId(customerId));
		session.save(cart);
		session.flush();
		tt.commit();
		return false;
	}

	@Override
	public boolean removeproduct(int productId, int customerId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session;
		try{session= sessionFactory.getCurrentSession();}
		catch(Exception e)
		{session=sessionFactory.openSession();}
		Transaction tt = session.beginTransaction();
		int cartId=this.getCartId(customerId);
		Query qq = session.createQuery("from CartItem where productId="+productId+"and cartId="+cartId);
		List<CartItem> cartList = (List<CartItem>)qq.list();
		CartItem ct = cartList.get(0);
		session.delete(ct);
		session.flush();
		tt.commit();
		return false;
	}

	@Override
	public boolean updatequantity(int productId, int qty, int customerId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session;
		try{session= sessionFactory.getCurrentSession();}
		catch(Exception e)
		{session=sessionFactory.openSession();}
		Transaction tt = session.beginTransaction();
		int cartId=this.getCartId(customerId);
		Query qq = session.createQuery("from CartItem where productId="+productId+"and cartId="+cartId);
		List<CartItem> cartList = (List<CartItem>)qq.list();
		CartItem ct = cartList.get(0);
		ct.setQuantity(qty);
		session.update(ct);
		session.flush();
		tt.commit();
		return false;
	}

	@Override
	public List<CartItem> getItemList(int cartId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session;
		try{session= sessionFactory.getCurrentSession();}
		catch(Exception e)
		{session=sessionFactory.openSession();}
		Transaction tt = session.beginTransaction();
		Query qq = session.createQuery("from CartItem where cartId="+cartId);
		List<CartItem> cartList = (List<CartItem>)qq.list();
		return cartList;
	}
	
	

}
