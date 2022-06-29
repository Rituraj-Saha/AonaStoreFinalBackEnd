package com.ApnaStoreManager.ecommerce.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ApnaStoreManager.ecommerce.exception.ResourceNotFoundException;
import com.ApnaStoreManager.ecommerce.model.Customer;
import com.ApnaStoreManager.ecommerce.model.Invoice;
import com.ApnaStoreManager.ecommerce.repository.CustomerRepository;
import com.ApnaStoreManager.ecommerce.service.CustomerService;

@Service
public class CustomerServiceImpl  implements CustomerService {
	private CustomerRepository customerRepo;
	
	public CustomerServiceImpl(CustomerRepository customerRepo) {
		super();
		this.customerRepo = customerRepo;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public Customer findCustomer(long id) {
		// TODO Auto-generated method stub
		Optional<Customer> c = customerRepo.findById(id);
		if(c.isPresent()) {
			return c.get();
		}
		else
		{
			throw new ResourceNotFoundException("customer","Id",id);
		}
	}
	
}
