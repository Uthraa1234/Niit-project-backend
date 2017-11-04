package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.OrderDAO;
import com.niit.model.CustomerOrder;


@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDao;
	public CustomerOrder list(String username) {
		// TODO Auto-generated method stub
		return orderDao.list(username);
	}

	public void saveOrder(CustomerOrder order) {
		// TODO Auto-generated method stub
		orderDao.saveOrder(order);
	}

	public void removeallorderitem(String username) {
		// TODO Auto-generated method stub
		orderDao.removeallorderitem(username);

	}

}
