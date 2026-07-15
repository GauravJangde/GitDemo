package com.student.management.system.opps;

public class TutionFee implements Payable {
	private final double baseFees;
	private final double scholarshipDeduction;
	private final double earlyPaymentDiscount;
	private double finalFeesAmount;
	
	
	
	public TutionFee(double baseFees, double scholarshipDeduction, double earlyPaymentDiscount) {
		super();
		this.baseFees = baseFees;
		this.scholarshipDeduction = scholarshipDeduction;
		this.earlyPaymentDiscount = earlyPaymentDiscount;
	}

	@Override
	public double calculatePayment() {
		finalFeesAmount = baseFees - scholarshipDeduction - earlyPaymentDiscount;
		return finalFeesAmount;
	}


	@Override
	public void generateReciept() {
		System.out.println("***************GENERATING FEES RECEIPT***************");
		System.out.println("BASE FEES: "+baseFees);
		System.out.println("DEDUCTION OFFERED: -"+scholarshipDeduction);
		System.out.println("EARLY DISCOUNT: -"+earlyPaymentDiscount);
		System.out.println("TOTAL FEES TO PAID: "+finalFeesAmount);
		System.out.println("***************Thank you!!!***************");
	}

	@Override
	public double getDiscount() {
		return (scholarshipDeduction+earlyPaymentDiscount);
	}

}
