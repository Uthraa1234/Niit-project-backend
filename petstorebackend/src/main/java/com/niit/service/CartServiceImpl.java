package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.CartDAO;
import com.niit.model.Cart;
@Service
@Transactional
public class CartServiceImpl implements CartService {
	@Autowired
	private CartDAO cartDao;
	public void saveCart(Cart cart) {
		
		cartDao.saveCart(cart);
	}
	public List<Cart> getCartbyusername(String username) {
		return cartDao.getCartbyusername(username);
	}
	public void removecartitem(int cartitemid) {
		// TODO Auto-generated method stub
		cartDao.removecartitem(cartitemid);
		
	}
	public void removeallcartitem(String username) {
		// TODO Auto-generated method stub
		cartDao.removeallcartitem(username);
	}
	public void aftercheckout(String username) {
		// TODO Auto-generated method stub
		cartDao.aftercheckout(username);
	}

}
