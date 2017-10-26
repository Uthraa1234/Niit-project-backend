package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDAO categoryDao;
	public void saveCategory(Category category) {
		
		categoryDao.saveCategory(category);
	}
	public void delete(int categoryId) {
		// TODO Auto-generated method stub
		categoryDao.delete(categoryId);
	}
	public Category getById(int categoryId) {
		// TODO Auto-generated method stub
		
		return categoryDao.getById(categoryId);
	}
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categoryDao.list();
	}

}
