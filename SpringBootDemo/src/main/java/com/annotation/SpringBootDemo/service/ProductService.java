package com.annotation.SpringBootDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.annotation.SpringBootDemo.dao.ProductDao;

@Component
public class ProductService {

	public ProductService() {
		System.out.println("ProductService Constructor");
	}

	// Autowire by Field
	// @Autowired
	 ProductDao pDao;

	// Autowire by Setter Injection

	// @Autowired public void setpDao(ProductDao pDao) { this.pDao = pDao; }

	// Autowire by Constructor Injection //@Autowired public
	ProductService(ProductDao pDao) {
		super();
		this.pDao = pDao;
	}

	public void getProduct() {

		String name = pDao.getProductByName("Shampoo");
		System.out.println(name);

	}
}
