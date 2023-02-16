package com.bakis.etic.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bakis.etic.backend.dao.CategoryDao;
import com.bakis.etic.backend.dto.Category;


@Repository("categoryDao")
public class CategoriesDaoImpl implements CategoryDao {
	
	private static List<Category> categories = new ArrayList<Category>();
	static {
		Category cat = new Category();
		cat.setId(1);
		cat.setName("Category-1");
		cat.setDescription("Some description for category-1");
		cat.setImage("cat-1.png");
		categories.add(cat);
		
		cat = new Category();
		cat.setId(2);
		cat.setName("Category-2");
		cat.setDescription("Some description for category-2");
		cat.setImage("cat-2.png");
		categories.add(cat);
		
		cat = new Category();
		cat.setId(3);
		cat.setName("Category-3");
		cat.setDescription("Some description for category-3");
		cat.setImage("cat-3.png");
		categories.add(cat);
	}
	
	@Autowired
	private SessionFactory sf;
	
	
	public List<Category> list(){
		return categories;
	}
	
	public Category get(int id){
		//return (Category)categories.stream().filter((cat) -> cat.getId() == id);
		for(Category cat: categories)
			if(cat.getId()==id)
				return cat;
		return null;
	}
	
	
	@Override
	public boolean add(Category cat) {
		try {

			sf.getCurrentSession().persist(cat);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean update(Category cat) {

		try {
			sf.getCurrentSession().update(cat);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean delete(Category cat) {
		try {
			sf.getCurrentSession().delete(cat);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
}
