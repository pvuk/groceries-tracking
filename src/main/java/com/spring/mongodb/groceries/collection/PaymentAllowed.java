/**
 * 
 */
package com.spring.mongodb.groceries.collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Ref: "PAYMENT_ALLOWED": {
			"BHIM_UPI": "Yes",
			"SWIPING_MACHINE_AVAILABLE": "Yes",
			"CASH": "Yes",
			"QR_CODE_SCANAND_PAY": "Yes",
			"Comment": ""
		}
 * @author P.V. UdayKiran
 * @version 1, created on Wed 02-Sep-2020 22:13
 */
@Document(collection = "PAYMENT_ALLOWED")
public class PaymentAllowed {
	
	@Id
	private String paymentAllowedId;
	
	@Field(value = "BHIM_UPI")
	private Boolean bhimUPI;
	
	@Field(value = "SWIPING_MACHINE_AVAILABLE")
	private Boolean swipingMachineAvailable;
	
	@Field(value = "CASH")
	private Boolean cash;
	
	@Field(value = "QR_CODE_SCANAND_PAY")
	private Boolean qrCodeScanAndPay;
	
	@Field(value = "WALLET_PAYMENT")
	private Boolean walletPayment;
	
	@Field(value = "NET_BANKING")
	private Boolean netBanking;
	
	@Field(value = "COMMENT")
	private String comment;

	public String getPaymentAllowedId() {
		return paymentAllowedId;
	}

	public void setPaymentAllowedId(String paymentAllowedId) {
		this.paymentAllowedId = paymentAllowedId;
	}

	public Boolean getBhimUPI() {
		return bhimUPI;
	}

	public void setBhimUPI(Boolean bhimUPI) {
		this.bhimUPI = bhimUPI;
	}

	public Boolean getSwipingMachineAvailable() {
		return swipingMachineAvailable;
	}

	public void setSwipingMachineAvailable(Boolean swipingMachineAvailable) {
		this.swipingMachineAvailable = swipingMachineAvailable;
	}

	public Boolean getCash() {
		return cash;
	}

	public void setCash(Boolean cash) {
		this.cash = cash;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
