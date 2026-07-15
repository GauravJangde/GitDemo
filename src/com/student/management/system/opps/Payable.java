package com.student.management.system.opps;

public interface Payable {

	public abstract double calculatePayment();
	
	/*
	 * public default boolean processPayment(String paymentMode) {
	 * if(paymentMode.equalsIgnoreCase("CASH") ||
	 * paymentMode.equalsIgnoreCase("UPI")|| paymentMode.equalsIgnoreCase("CARD")) {
	 * System.out.println("Processing Payment....");
	 * System.out.println("Payment Successful"); return true; } else {
	 * System.err.println("Something went wrong"); return false; } }
	 */
	
	public default boolean processPayment(PaymentMode paymentMode) {
		if(paymentMode==paymentMode.CARD || paymentMode==paymentMode.CASH|| paymentMode==paymentMode.UPI) {
			System.out.println("Processing Payment....");
			System.out.println("Payment Successful using "+paymentMode);
			return true;
		}
		else {
			System.err.println("Something went wrong");
			return false;
		}
	}
	public abstract void generateReciept();
	
	public abstract double getDiscount();
	
}
