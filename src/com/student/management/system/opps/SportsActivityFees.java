package com.student.management.system.opps;

public class SportsActivityFees implements Payable {
	
	private double equipmentCharges;
	private double tournamentFees;
	private double teamUniformCost;
	private double discountForStatePlayer;
	private double finalSportsFees;
	
	

	public SportsActivityFees(double equipmentCharges, double tournamentFees, double teamUniformCost,
			double discountForStatePlayer) {
		super();
		this.equipmentCharges = equipmentCharges;
		this.tournamentFees = tournamentFees;
		this.teamUniformCost = teamUniformCost;
		this.discountForStatePlayer = discountForStatePlayer;
	}

	@Override
	public double calculatePayment() {
		finalSportsFees = equipmentCharges + tournamentFees + teamUniformCost - discountForStatePlayer;
		return finalSportsFees;
	}


	@Override
	public void generateReciept() {
		System.out.println("***************GENERATING SPORTS FEES RECEIPT***************");
		System.out.println("EQUIPMENT CHARGES: "+equipmentCharges);
		System.out.println("TOURNAMENT FEES: "+tournamentFees);
		System.out.println("UNIFORM COST: "+teamUniformCost);
		System.out.println("STATE PLAYER DISCOUNT: "+discountForStatePlayer);
		System.out.println("TOTAL FEES TO PAID: "+finalSportsFees);
		System.out.println("***************Thank you!!!***************");
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return discountForStatePlayer;
	}

}
