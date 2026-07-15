package com.student.management.system.opps;

public class PaymentRunner {

	public static void main(String[] args) {
		Payable payable = new TutionFee(50000,10000,5000);
		payable.calculatePayment();
		payable.generateReciept();
		System.out.println(payable.getDiscount());
		
		Payable payable2 = new SportsActivityFees(5000,3000,2000,1000);
		payable2.calculatePayment();
		payable2.generateReciept();
		System.out.println(payable2.getDiscount());
		
		Payable payable3 = new TransportFee(1000,5,300);
		payable3.processPayment(PaymentMode.CARD);
		String disc = PaymentMode.CARD.getDescription();
		System.out.println(disc);
		payable3.calculatePayment();
		payable3.generateReciept();
		System.out.println(payable3.getDiscount());
		
		Payable payable4 = new LibraryFee(300,50,20);
		payable4.processPayment(PaymentMode.UPI);
		String disc1 = PaymentMode.UPI.getDescription();
		System.out.println(disc1);
		payable4.calculatePayment();
		payable4.generateReciept();
		System.out.println(payable4.getDiscount());
		
		

	}

}
