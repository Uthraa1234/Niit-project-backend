package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.ShippingAddressDAO;
import com.niit.model.ShippingAddress;


@Service
@Transactional
public class ShippingAddressServiceImpl implements ShippingAddressService {
	@Autowired
	private ShippingAddressDAO shippingAddressDao;
	public void saveShippingAddress(ShippingAddress shippingAddress) {
		
		
		shippingAddressDao.saveShippingAddress(shippingAddress);
	}
	public void delete(int shippingAddressId) {
		// TODO Auto-generated method stub
		shippingAddressDao.delete(shippingAddressId);
	}
	public ShippingAddress getById(int shippingAddressId) {
		// TODO Auto-generated method stub
		
		return shippingAddressDao.getById(shippingAddressId);
	}
	public List<ShippingAddress> list(String username) {
		// TODO Auto-generated method stub
		return shippingAddressDao.list(username);
	}

}
