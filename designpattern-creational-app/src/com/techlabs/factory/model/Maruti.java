package com.techlabs.factory.model;

public class Maruti implements ICar{

	@Override
	public void start() {
		
		 System.out.println("Maruti car starting.");
	}

	@Override
	public void stop() {
		
		 System.out.println("Maruti car stopping.");
	}

}
