package com.niit.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Cart;
@Repository
public class CartDAOImpl implements CartDAO{
	@Autowired
	private SessionFactory sessionFactory;
	public void saveCart(Cart cart) {
		Session session= sessionFactory.getCurrentSession();
		session.saveOrUpdate(cart);
	}

}
