package com.ApnaStoreManager.ecommerce.service.impl;

import org.springframework.stereotype.Service;

import com.ApnaStoreManager.ecommerce.model.Product;
import com.ApnaStoreManager.ecommerce.repository.ProductRepository;
import com.ApnaStoreManager.ecommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

}
