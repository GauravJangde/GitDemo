package com.student.management.system.opps;

public class LibraryFee implements Payable{
	private double basicSubscription;
	private double additionalBookCharges;
	private double lateReturnPenalty;
	private double finalLibraryFees;
	
	

	public LibraryFee(double basicSubscription, double additionalBookCharges, double lateReturnPenalty) {
		super();
		this.basicSubscription = basicSubscription;
		this.additionalBookCharges = additionalBookCharges;
		this.lateReturnPenalty = lateReturnPenalty;
	}

	@Override
	public double calculatePayment() {
		finalLibraryFees = (basicSubscription+additionalBookCharges+lateReturnPenalty);
		return finalLibraryFees;
	}

	public boolean processPayment(String paymentMode) {
		if(paymentMode.equalsIgnoreCase("Check")) {
			System.out.println("Payment done through Check");
			return true;
		}
		return false;
	}

	@Override
	public void generateReciept() {
		System.out.println("***************GENERATING TRANSPORT FEES RECEIPT***************");
		System.out.println("BASIC SUBSCRIPTION: "+basicSubscription);
		System.out.println("ADDITIONAL BOOK CHARGES: "+additionalBookCharges);
		System.out.println("LATE RETURN PENALTY: "+lateReturnPenalty);
		System.out.println("FINAL LIBRARY FEES: "+finalLibraryFees);
		System.out.println("***************Thank you!!!***************");
		
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
