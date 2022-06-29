package com.ApnaStoreManager.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ApnaStoreManager.ecommerce.model.Product;
import com.ApnaStoreManager.ecommerce.service.InvoiceService;
import com.ApnaStoreManager.ecommerce.model.Invoice;


@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {
	
	InvoiceService invoiceService;

	public InvoiceController(InvoiceService invoiceService) {
		super();
		this.invoiceService = invoiceService;
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/generate")
	public ResponseEntity<Invoice> saveShop(@RequestBody Invoice bill){
		
		 return new ResponseEntity<>(invoiceService.saveShop(bill), HttpStatus.OK);
	        
	}
	@GetMapping("/get-bill")
	public ResponseEntity<Invoice> saveShop(@RequestParam long id){
		
		 return new ResponseEntity<>(invoiceService.findShop(id), HttpStatus.OK);
	        
	}


}
