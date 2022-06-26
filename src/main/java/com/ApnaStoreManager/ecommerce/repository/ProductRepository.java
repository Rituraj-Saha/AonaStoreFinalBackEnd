package com.ApnaStoreManager.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApnaStoreManager.ecommerce.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
