package com.ApnaStoreManager.ecommerce.service;

import com.ApnaStoreManager.ecommerce.model.Invoice;


public interface InvoiceService {

	Invoice saveShop(Invoice bill);
	Invoice findShop(long id);
}
