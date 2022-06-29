package com.ApnaStoreManager.ecommerce.service;

import com.ApnaStoreManager.ecommerce.model.Customer;
import com.ApnaStoreManager.ecommerce.model.Product;

public interface CustomerService {
	Customer saveCustomer(Customer customer);
	Customer findCustomer(long id);
}
