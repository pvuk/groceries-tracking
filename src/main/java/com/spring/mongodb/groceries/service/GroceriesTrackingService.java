package com.spring.mongodb.groceries.service;

import com.spring.mongodb.groceries.collection.GroceriesTracking;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Wed 16-Sep-2020 21:45
 */
public interface GroceriesTrackingService {
	
	public String saveGroceries(GroceriesTracking groceriesTracking);
}
