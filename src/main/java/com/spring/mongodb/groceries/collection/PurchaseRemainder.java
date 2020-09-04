package com.spring.mongodb.groceries.collection;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Fri 04-Sep-2020 21:20
 */
@Document(collection = "PURCHASE_REMAINDER")
public class PurchaseRemainder {
	
	@Id
	@Field(value = "_id")
	private String purchaseRemainderId;
	
	@Field(value = "GROCERIES_TO_BE_PURCHASE")
	private String groceriesToBePurchase;
	
	@Field(value = "LOCATION")
	private String location;
	
	@Field(value = "TO_BE_PURCHASE_ON")
	private Date toBePurchaseOn;
	
}
