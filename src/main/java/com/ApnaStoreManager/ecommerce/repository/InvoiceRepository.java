package com.ApnaStoreManager.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ApnaStoreManager.ecommerce.model.Invoice;

public interface InvoiceRepository  extends JpaRepository<Invoice, Long> {
	@Query(value = "SELECT * FROM invoice WHERE id = ?1", nativeQuery = true)
	Invoice findShop(long id);
}
