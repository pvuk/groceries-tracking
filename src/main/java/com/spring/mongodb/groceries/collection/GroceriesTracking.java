/**
 * 
 */
package com.spring.mongodb.groceries.collection;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Ref: {"PURCHASED_ON" : "02-Sep-2020 09:00",
		"LOCATION" : "JayaNagar Vegitable Market, Bhagyanagar Colony, Hyderabad",
		"GOOGLE_MAP_LOCATION" : "",
		"VEGITABLES" : [
				{"NAME": "Birakay", "WEIGHT": "500gm", "RATE": "₹60", "AVAILABLE_TYPE" : "Organic", "COMMENT": ""}, 
				{"NAME": "TOMATO", "WEIGHT": "1kg", "RATE": "₹50", "AVAILABLE_TYPE" : "Organic", "COMMENT": ""}
			],
		"BRANCH_NAME" : "Old Shop",
		"RATING" : null,
		"TOTAL_STAFF" : "6 Members",
		"HOME_DELIVERY" : "No",
		"PAYMENT_ALLOWED": {
			"BHIM_UPI": "Yes",
			"SWIPING_MACHINE_AVAILABLE": "Yes",
			"CASH": "Yes",
			"Comment": ""
		}
	}
	
 * @author P.V. UdayKiran
 * @version 1, created on Wed 02-Sep-2020 22:06
 */
@Document(collection = "GROCERIES_TRACKING")
public class GroceriesTracking {
	
	@Id
	@Field(value = "_id")
	private String groceriesTrackingId;
	
	@Field(value = "PURCHASED_ON")
	private Date purchasedOn;
	
	@Field(value = "LOCATION")
	private String location;
	
	@Field(value = "VEGITABLES")
	private List<Vegitable> vegitableList;
	
	@Field(value = "BRANCH_NAME")
	private String branchName;
	
	@Field(value = "RATING")
	private Long RATING;
	
	@Field(value = "TOTAL_STAFF")
	private String totalStaff;
	
	@Field(value = "HOME_DELIVERY")
	private Boolean homeDelivery;
	
	@Field(value = "PAYMENT_ALLOWED")
	private PaymentAllowed paymentAllowed;

	public String getGroceriesTrackingId() {
		return groceriesTrackingId;
	}

	public void setGroceriesTrackingId(String groceriesTrackingId) {
		this.groceriesTrackingId = groceriesTrackingId;
	}

	public Date getPurchasedOn() {
		return purchasedOn;
	}

	public void setPurchasedOn(Date purchasedOn) {
		this.purchasedOn = purchasedOn;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Vegitable> getVegitableList() {
		return vegitableList;
	}

	public void setVegitableList(List<Vegitable> vegitableList) {
		this.vegitableList = vegitableList;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Long getRATING() {
		return RATING;
	}

	public void setRATING(Long rATING) {
		RATING = rATING;
	}

	public String getTotalStaff() {
		return totalStaff;
	}

	public void setTotalStaff(String totalStaff) {
		this.totalStaff = totalStaff;
	}

	public Boolean getHomeDelivery() {
		return homeDelivery;
	}

	public void setHomeDelivery(Boolean homeDelivery) {
		this.homeDelivery = homeDelivery;
	}

	public PaymentAllowed getPaymentAllowed() {
		return paymentAllowed;
	}

	public void setPaymentAllowed(PaymentAllowed paymentAllowed) {
		this.paymentAllowed = paymentAllowed;
	}
	
}
