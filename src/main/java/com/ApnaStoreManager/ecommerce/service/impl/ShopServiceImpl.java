package com.ApnaStoreManager.ecommerce.service.impl;

import org.springframework.stereotype.Service;

import com.ApnaStoreManager.ecommerce.model.Shop;
import com.ApnaStoreManager.ecommerce.repository.ShopRepository;
import com.ApnaStoreManager.ecommerce.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {

	private ShopRepository shoprepo;
	
	public ShopServiceImpl(ShopRepository shoprepo) {
		super();
		this.shoprepo = shoprepo;
	}
	
	@Override
	public Shop saveShop(Shop shop) {
		// TODO Auto-generated method stub
		return shoprepo.save(shop);
	}
	
	@Override
	public Shop findShop(long id) {
		// TODO Auto-generated method stub
		return shoprepo.findShop(id);
	}

}
