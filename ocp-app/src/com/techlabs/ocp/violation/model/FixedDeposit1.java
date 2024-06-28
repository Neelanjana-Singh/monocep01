package com.techlabs.ocp.violation.model;

public class FixedDeposit1 {
	 private int accountNumber;
	    private String name;
	    private double principal;
	    private int duration;
	    private IFestivalInterest Interest;

	    public FixedDeposit1(int accountNumber, String name, double principal, int duration, IFestivalInterest Interest) {
	        this.accountNumber = accountNumber;
	        this.name = name;
	        this.principal = principal;
	        this.duration = duration;
	        this.Interest = Interest;
	    }

	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public void setAccountNumber(int accountNumber) {
	        this.accountNumber = accountNumber;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getPrincipal() {
	        return principal;
	    }

	    public void setPrincipal(double principal) {
	        this.principal = principal;
	    }

	    public int getDuration() {
	        return duration;
	    }

	    public void setDuration(int duration) {
	        this.duration = duration;
	    }

	    public IFestivalInterest getInterest() {
	        return Interest;
	    }

	    public void setInterest(IFestivalInterest Interest) {
	        this.Interest = Interest;
	    }

	    public double calculateSimpleInterest() {
	        double interestRate = Interest.getInterestRate();
	        return (principal * interestRate * duration) / 100;

}
}