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
@Table(name="invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;//bill id
	
	@Column(name="customer_id", nullable=false)
	private String customer_id;
	
	
	@Column(name="date", nullable=false)
	private String date;
	
	@Column(name="details", nullable=false)
	private String details;
}
