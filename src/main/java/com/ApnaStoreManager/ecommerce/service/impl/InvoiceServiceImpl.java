package com.ApnaStoreManager.ecommerce.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ApnaStoreManager.ecommerce.model.Invoice;

import com.ApnaStoreManager.ecommerce.repository.InvoiceRepository;
import com.ApnaStoreManager.ecommerce.service.InvoiceService;
import com.ApnaStoreManager.ecommerce.exception.*;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	private InvoiceRepository billrepo;
	
	public InvoiceServiceImpl(InvoiceRepository billrepo) {
		super();
		this.billrepo = billrepo;
	}
	
	@Override
	public Invoice saveShop(Invoice shop) {
		// TODO Auto-generated method stub
		return billrepo.save(shop);
	}
	
	@Override
	public Invoice findShop(long id) {
		
//		return billrepo.findShop(id);
		Optional<Invoice> bill = billrepo.findById(id);
		if(bill.isPresent()) {
			return bill.get();
		}
		else
		{
			throw new ResourceNotFoundException("Invoice","Id",id);
		}
		
	}

}
