package com.ApnaStoreManager.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ApnaStoreManager.ecommerce.model.Customer;
import com.ApnaStoreManager.ecommerce.model.Invoice;
import com.ApnaStoreManager.ecommerce.service.CustomerService;


@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/save-customer")
	public ResponseEntity<Customer> saveProduct(@RequestBody Customer customer){
		
		 return new ResponseEntity<>(customerService.saveCustomer(customer), HttpStatus.OK);
	   
	        
	}
	
	@GetMapping("/get-customer")
	public ResponseEntity<Customer> saveShop(@RequestParam long id){
		
		 return new ResponseEntity<>(customerService.findCustomer(id), HttpStatus.OK);
	        
	}
}
