/**
 * 
 */
package com.spring.mongodb.groceries.collection;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Ref: {"NAME": "Birakay", "WEIGHT": "500gm", "RATE": "₹60", "AVAILABLE_TYPE" : "Organic", "COMMENT": ""}
 * 
 * @author P.V. UdayKiran
 * @version 1, created on Wed 02-Sep-2020 22:09
 */
@Document(collection = "VEGITABLE")
public class Vegitable {

	@Id
	private String vegitableId;
	
	@Field(value = "NAME")
	private String name;
	
	@Field(value = "WEIGHT")
	private String weight;
	
	@Field(value = "RATE")
	private BigDecimal rate;
	
	@Field(value = "AVAILABLE_TYPE")
	private String availableType;
	
	@Field(value = "COMMENT")
	private String comment;

	public String getVegitableId() {
		return vegitableId;
	}

	public void setVegitableId(String vegitableId) {
		this.vegitableId = vegitableId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getAvailableType() {
		return availableType;
	}

	public void setAvailableType(String availableType) {
		this.availableType = availableType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
}
