package com.ApnaStoreManager.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ApnaStoreManager.ecommerce.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
	@Query(value = "SELECT * FROM customer WHERE id = ?1", nativeQuery = true)
	Customer findCustomer(long id);
}
