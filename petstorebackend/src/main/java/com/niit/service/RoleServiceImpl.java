package com.niit.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.RoleDAO;
import com.niit.model.Role;


@Service
@Transactional
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleDAO roleDao;
	public List<Role> list() {
	
		return roleDao.list();
	}

	public Role getByUserName(String username) {
		// TODO Auto-generated method stub
		return roleDao.getByUserName(username);
	}

	public Role getByEmailId(String emailid) {
		// TODO Auto-generated method stub
		
		return roleDao.getByEmailId(emailid);
	}

	public void saveOrUpdate(Role role) {
		// TODO Auto-generated method stub
		roleDao.saveOrUpdate(role);
		
	}

	public void delete(String username) {
		// TODO Auto-generated method stub
		roleDao.delete(username);
		
	}

}
