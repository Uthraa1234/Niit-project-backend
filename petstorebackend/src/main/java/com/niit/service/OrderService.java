package com.niit.service;
import com.niit.model.CustomerOrder;
public interface OrderService {
	public CustomerOrder list(String username);
	public void saveOrder(CustomerOrder order);
	void removeallorderitem(String username);
}
