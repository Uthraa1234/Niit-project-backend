package com.niit.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Supplier;
@Repository
public class SupplierDAOImpl implements SupplierDAO{
	@Autowired
	private SessionFactory sessionFactory;
	public void saveSupplier(Supplier supplier) {
		Session session= sessionFactory.getCurrentSession();
		session.saveOrUpdate(supplier);
	}

}
