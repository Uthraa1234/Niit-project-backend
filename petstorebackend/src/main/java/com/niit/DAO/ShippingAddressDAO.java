package com.niit.DAO;

import java.util.List;

import com.niit.model.ShippingAddress;


public interface ShippingAddressDAO {
	public void saveShippingAddress(ShippingAddress shippingAddress);
	public void delete(int shippingAddressId);
	
	public ShippingAddress getById(int shippingAddressId);
	
	public List<ShippingAddress> list(String username);
}
