package com.ApnaStoreManager.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ApnaStoreManager.ecommerce.model.Shop;

public interface ShopRepository  extends JpaRepository<Shop, Long> {
	@Query(value = "SELECT * FROM shop WHERE id = ?1", nativeQuery = true)
	Shop findShop(long id);
}
