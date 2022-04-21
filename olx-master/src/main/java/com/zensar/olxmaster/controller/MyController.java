package com.zensar.olxmaster.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.zensar.olxmaster.entity.Category;
import com.zensar.olxmaster.entity.Status;


@RestController
public class MyController {
	
	static List<Category> categories= new ArrayList<Category>();
	static List<Status> status=new ArrayList<Status>();
	
	static {
		categories.add(new Category(1L, "Furniture"));
		categories.add(new Category(2L, "Cars"));
		categories.add(new Category(3L, "Mobiles"));
		categories.add(new Category(4L, "Real Estate"));
		categories.add(new Category(5L, "Sports"));
	}
	
	static {
		status.add(new Status(1L, "OPEN"));
		status.add(new Status(2L, "CLOSED"));
	}
	
	@GetMapping("/advertise/category")
	public List<Category> getAllAdvertisementCategories() {
		return categories;
	}
	
	@GetMapping("/advertise/status")
	public List<Status> getAllAdvertisementStatus(){
		return status;
	}
	

}
