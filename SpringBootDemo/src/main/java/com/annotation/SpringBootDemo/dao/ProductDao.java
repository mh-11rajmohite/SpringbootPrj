package com.annotation.SpringBootDemo.dao;

import org.springframework.stereotype.Component;

@Component
public class ProductDao {

	public ProductDao() {
	 
		System.out.println("ProductDao constructor");
		
	}
	
	
	public String getProductByName(String name) {
		
		if(name == "Soap")
			return "Product is Available";
		else if(name == "Shampoo")
			return "Product is Available";
		else 
			return "Product Not Found";
	}
}
