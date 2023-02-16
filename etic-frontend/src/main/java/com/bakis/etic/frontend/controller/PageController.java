package com.bakis.etic.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bakis.etic.backend.dao.CategoryDao;
import com.bakis.etic.backend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDao categoryDao;

	@RequestMapping(value = { "", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickedHome", true);
		mv.addObject("categories", categoryDao.list());
		return mv;
	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About");
		mv.addObject("userClickedAbout", true);
		return mv;
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		mv.addObject("userClickedContact", true);

		return mv;
	}

	@RequestMapping(value = "/products")
	public ModelAndView services() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Products");
		mv.addObject("products", categoryDao.list());
		mv.addObject("userClickedProducts", true);
		return mv;
	}

	@RequestMapping(value = "/category/{id}/products")
	public ModelAndView getCategory(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("categories", categoryDao.list());
		Category cat = categoryDao.get(id);
		
		//System.out.println("cat.id = " + cat.getId() + "cat.name = " + cat.getName());
		//if (cat != null) {
		mv.addObject("title", cat.getName());
		mv.addObject("category", cat);
		//}
		mv.addObject("userClickedCategory", true);
		return mv;
	}

}
