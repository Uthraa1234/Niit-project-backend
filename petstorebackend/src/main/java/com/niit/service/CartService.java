package com.niit.service;

import java.util.List;

import com.niit.model.Cart;

public interface CartService {
	public void saveCart(Cart cart);

	public List<Cart> getCartbyusername(String username);
	void removecartitem(int cartitemid);
	void removeallcartitem(String username);
	void aftercheckout(String username);

}
