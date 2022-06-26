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
	
	@Column(name="sid", nullable=false)
	private long sid;//store id
	
	@Column(name="cid", nullable=false)
	private long cid;
	
	@Column(name="scid", nullable=false)
	private long scid;
	
	@Column(name="price", nullable=false)
	private String price;
	
	@Column(name="img", nullable=false)
	private String img;
	
	@Column(name="Description", nullable=false)
	private String Description;
	
	@Column(name="Qnty", nullable=false)
	private String Qnty;
}
