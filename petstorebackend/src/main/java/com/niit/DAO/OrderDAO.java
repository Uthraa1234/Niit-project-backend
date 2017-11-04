package com.niit.DAO;

import java.util.List;

import com.niit.model.Cart;
import com.niit.model.CustomerOrder;

public interface OrderDAO {

	public CustomerOrder list(String username);
	public void saveOrder(CustomerOrder order);
	void removeallorderitem(String username);
	
}
