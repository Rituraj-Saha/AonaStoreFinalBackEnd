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
@Table(name="shop")
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;//product id
	
	@Column(name="shop_name", nullable=false)
	private String shop_name;
	
	
	@Column(name="shop_img", nullable=false)
	private String shop_img;
	
	@Column(name="shop_type", nullable=false)
	private String shop_type;
	
	@Column(name="contact_no", nullable=false)
	private String contact_no;
	
	@Column(name="shop_address", nullable=false)
	private String shop_address;
	
	@Column(name="gst_no", nullable=false)
	private String gst_no;
	
	@Column(name="owner_name", nullable=false)
	private String owner_name;

}
