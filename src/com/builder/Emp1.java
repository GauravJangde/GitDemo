package com.builder;

public class Emp1 {
	private final String name;
	private final int rollNo;
	private final double percent;
	
	public Emp1(String name,int rollNo,double percent) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.percent = percent;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public double getPercent() {
		return percent;
	}

	@Override
	public String toString() {
		return "Emp1 [name=" + name + ", rollNo=" + rollNo + ", percent=" + percent + "]";
	}




	public static class Builder1{
		private String name;
		private int rollNo;
		private double percent;
		
		public Builder1 name(String name) {
			this.name = name;
			return this;
		}
	
		public Builder1 rollNo(int rollNo) {
			this.rollNo = rollNo;
			return this;
		}
		
		public Builder1 percent(double percent) {
			this.percent = percent;
			return this;
		}
		
		public Emp1 build() {
			Emp1 emp = new Emp1(name,rollNo,percent);
			return emp;
		}
		
	}
}
