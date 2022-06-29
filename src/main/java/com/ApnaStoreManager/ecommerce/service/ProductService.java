package com.ApnaStoreManager.ecommerce.service;

import java.util.List;
import java.util.Optional;


import com.ApnaStoreManager.ecommerce.model.Product;

public interface ProductService {

	Product saveProduct(Product product);
	List<Product> getProducts();
	Product findById(long id);
	
	List<Product>searhByName(String s);
	
	String getAndUpdateQnty(String qnty,Long id);
}
