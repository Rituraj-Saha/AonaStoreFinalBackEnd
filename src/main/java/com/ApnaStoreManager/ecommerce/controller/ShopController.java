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
import com.ApnaStoreManager.ecommerce.model.Shop;
import com.ApnaStoreManager.ecommerce.service.ShopService;

@RestController
@RequestMapping("/api/shop")
public class ShopController {
	
	ShopService shopService;

	public ShopController(ShopService shopService) {
		super();
		this.shopService = shopService;
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/save-shop")
	public ResponseEntity<Shop> saveShop(@RequestBody Shop shop){
		
		 return new ResponseEntity<>(shopService.saveShop(shop), HttpStatus.OK);
	        
	}
	@GetMapping("/get-shop")
	public ResponseEntity<Shop> saveShop(@RequestParam long id){
		
		 return new ResponseEntity<>(shopService.findShop(id), HttpStatus.OK);
	        
	}


}
