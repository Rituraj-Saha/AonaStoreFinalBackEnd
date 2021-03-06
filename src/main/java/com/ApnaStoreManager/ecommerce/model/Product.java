package com.ApnaStoreManager.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity //by this this class will be considered as jpa entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;//product id
	
	@Column(name="pname", nullable=false)
	private String pname;
	
	
	@Column(name="price", nullable=false)
	private String price;
	
	@Column(name="tax", nullable=false)
	private String tax;
	
	@Column(name="discount", nullable=false)
	private String discount;
	
	@Column(name="Qnty", nullable=false)
	private String Qnty;
}
