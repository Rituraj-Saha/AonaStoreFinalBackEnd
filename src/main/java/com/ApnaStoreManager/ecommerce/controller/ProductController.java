package com.ApnaStoreManager.ecommerce.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ApnaStoreManager.ecommerce.model.ModelForCheckQnty;
import com.ApnaStoreManager.ecommerce.model.Product;
import com.ApnaStoreManager.ecommerce.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	
//	@PostMapping("/save-product")
//	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
//		
////		 HttpHeaders headers = new HttpHeaders();
////	        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "no-cache");
//	        
//		//return new ResponseEntity<>(productService.saveProduct(product),HttpStatus.CREATED,HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN);
//	
//	        return new ResponseEntity<>(productService.saveProduct(product),HttpStatus.CREATED);
//	}
	@CrossOrigin(origins = "http://127.0.0.1:5500/AddProduct.html/")
	@PostMapping("/save-product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		
//		 HttpHeaders headers = new HttpHeaders();
//	        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN,"http://localhost/InVoiceAnadInventoryPODFinalProjet/AddProduct.html");
//	        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS,"GET, POST, PATCH, PUT, DELETE, OPTIONS");	
//	        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS,"Origin, Content-Type, X-Auth-Token");	
		//return new ResponseEntity<>(productService.saveProduct(product),HttpStatus.CREATED,HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN);
	
//		 return new ResponseEntity<>(productService.saveProduct(product), headers, HttpStatus.OK);
		 return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.OK);
	   
	        
	}
	
	@GetMapping("/get-product")
	public ResponseEntity<List<Product>> getProduct(){
		
//		 HttpHeaders headers = new HttpHeaders();
//	        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN,"http://localhost/InVoiceAnadInventoryPODFinalProjet/AddProduct.html");
//	        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS,"GET, POST, PATCH, PUT, DELETE, OPTIONS");	
//	        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS,"Origin, Content-Type, X-Auth-Token");	
		//return new ResponseEntity<>(productService.saveProduct(product),HttpStatus.CREATED,HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN);
	
//		 return new ResponseEntity<>(productService.saveProduct(product), headers, HttpStatus.OK);
		 return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
	   
	        
	}
	
	@GetMapping("/get-productbyId")
	public ResponseEntity<Product> getProduct(long id){
		
		 return new ResponseEntity<>(productService.findById(id), HttpStatus.OK);
	   
	        
	}
	@GetMapping("/get-productbyName")
	public ResponseEntity<List<Product>> getProductByName(@RequestParam("pname") String pname){
		
		 return new ResponseEntity<>(productService.searhByName(pname), HttpStatus.OK);
	   
	        
	}
	
	@PostMapping("/bill-forproduct")
	public ResponseEntity<String> billForProduct(@RequestBody ModelForCheckQnty m){
		
//		 HttpHeaders headers = new HttpHeaders();
//	        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN,"http://localhost/InVoiceAnadInventoryPODFinalProjet/AddProduct.html");
//	        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS,"GET, POST, PATCH, PUT, DELETE, OPTIONS");	
//	        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS,"Origin, Content-Type, X-Auth-Token");	
		//return new ResponseEntity<>(productService.saveProduct(product),HttpStatus.CREATED,HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN);
	
//		 return new ResponseEntity<>(productService.saveProduct(product), headers, HttpStatus.OK);
		 return new ResponseEntity<>(productService.getAndUpdateQnty(m.getQnty(),m.getId()), HttpStatus.OK);
	   
	        
	}
	
}
