package com.student.management.system.opps;

public enum PaymentMode {
	CARD("Payment through Card"),UPI("Payment through UPI"),CASH("Payment through Cash");
	private String description;

	private PaymentMode(String description) {
		// TODO Auto-generated constructor stub
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
