package com.techlabs.model;

public class Invoice {
	 private int id;
	    private String description;
	    private double amount;
	    private double tax;

	    
	    public Invoice(int id, String description, double amount) {
	        this.id = id;
	        this.description = description;
	        this.amount = amount;
	        this.tax = 0.0;
	    }

	    
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public double getAmount() {
	        return amount;
	    }


		public double getTax() {
			return tax;
		}


		public void setTax(double tax) {
			this.tax = tax;
		}

}
