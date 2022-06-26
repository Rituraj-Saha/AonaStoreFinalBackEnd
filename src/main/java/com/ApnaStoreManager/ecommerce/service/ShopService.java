package com.ApnaStoreManager.ecommerce.service;

import com.ApnaStoreManager.ecommerce.model.Shop;

public interface ShopService {

	Shop saveShop(Shop shop);
	Shop findShop(long id);
}
