package com.ApnaStoreManager.ecommerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ApnaStoreManager.ecommerce.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	@Query(value = "SELECT * FROM product WHERE id = ?1", nativeQuery = true)
	Optional<Product> find(long id);
	
	@Query(value = "SELECT * FROM products WHERE pname like ?1%", nativeQuery = true)
	List<Product> searhByName(String s);
	
	//
	@Query(value = "SELECT qnty FROM products WHERE pid = ?1", nativeQuery = true)
	String getProductQnty(Long id);
	
//	UPDATE products SET qnty = 102 WHERE pid = 11;
	@Modifying
	@Transactional
	@Query(value = "UPDATE products SET qnty = ?1 WHERE pid = ?2", nativeQuery = true)
	void updateProductQnty(String qnty,Long id);
}
