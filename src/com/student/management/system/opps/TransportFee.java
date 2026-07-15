package com.student.management.system.opps;

public class TransportFee implements Payable{
	
	private double baseFee;
	private int paymentMonths;
	private double siblingDiscount;
	private double finalTransportFee;
	
	public TransportFee(double baseFee, int paymentMonths, double siblingDiscount) {
		super();
		this.baseFee = baseFee;
		this.paymentMonths = paymentMonths;
		this.siblingDiscount = siblingDiscount;
	}

	@Override
	public double calculatePayment() {
		finalTransportFee = (baseFee*paymentMonths)-siblingDiscount;
		return finalTransportFee;
	}


	@Override
	public void generateReciept() {
		System.out.println("***************GENERATING TRANSPORT FEES RECEIPT***************");
		System.out.println("BASE FEES: "+baseFee);
		System.out.println("PAYMENT MONTH: "+paymentMonths);
		System.out.println("SIBLING DISCOUNT: "+siblingDiscount);
		System.out.println("TOTAL TRANSPORT FEES TO PAID: "+finalTransportFee);
		System.out.println("***************Thank you!!!***************");
		
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return siblingDiscount;
	}
	

}
