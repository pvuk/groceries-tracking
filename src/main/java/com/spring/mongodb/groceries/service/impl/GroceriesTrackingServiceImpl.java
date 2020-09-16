package com.spring.mongodb.groceries.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mongodb.groceries.collection.GroceriesTracking;
import com.spring.mongodb.groceries.service.GroceriesTrackingService;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Wed 16-Sep-2020 21:46
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GroceriesTrackingServiceImpl implements GroceriesTrackingService {

	/**
	 * @see com.spring.mongodb.groceries.service.GroceriesTrackingService#saveGroceries(com.spring.mongodb.groceries.collection.GroceriesTracking)
	 */
	@Override
	public String saveGroceries(GroceriesTracking groceriesTracking) {
		
		return null;
	}

}
