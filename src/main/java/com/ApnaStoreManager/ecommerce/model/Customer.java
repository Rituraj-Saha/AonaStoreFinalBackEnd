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
@Table(name="customer")
public class Customer {
	@Id
	private long cid;//product id
	
	@Column(name="cname", nullable=false)
	private String cname;
	
	
	@Column(name="phn", nullable=false)
	private String phn;
	
	@Column(name="address", nullable=false)
	private String address;
	
}
