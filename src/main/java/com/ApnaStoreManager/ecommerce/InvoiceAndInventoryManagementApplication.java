package com.ApnaStoreManager.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class InvoiceAndInventoryManagementApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(InvoiceAndInventoryManagementApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(InvoiceAndInventoryManagementApplication.class, args);
	}

}
