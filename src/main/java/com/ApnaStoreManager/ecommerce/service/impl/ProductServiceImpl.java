package com.ApnaStoreManager.ecommerce.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ApnaStoreManager.ecommerce.exception.ResourceNotFoundException;
import com.ApnaStoreManager.ecommerce.model.Invoice;
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
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	@Override
	public Product findById(long id) {
		// TODO Auto-generated method stub
		Optional<Product> product = productRepository.findById(id);
		if(product.isPresent()) {
			return product.get();
		}
		else
		{
			throw new ResourceNotFoundException("product","Id",id);
		}
	}
	@Override
	public List<Product> searhByName(String s) {
		// TODO Auto-generated method stub
		List<Product> lp = productRepository.searhByName(s);
		return lp;
		
	}
	@Override
	public String getAndUpdateQnty(String qnty, Long id) {
		// TODO Auto-generated method stub
		if(Integer.valueOf(qnty)<Integer.valueOf(productRepository.getProductQnty(id)))
		{
			Integer q = Integer.valueOf(productRepository.getProductQnty(id)) - Integer.valueOf(qnty);
			productRepository.updateProductQnty(String.valueOf(q), id);
			return "success";
		}
		else
		{
			return ""+id+" is not available as required";
		}
	
	}

}
