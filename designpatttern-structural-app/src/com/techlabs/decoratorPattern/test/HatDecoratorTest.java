package com.techlabs.decoratorPattern.test;

import com.techlabs.decoratorPattern.model.GoldenHat;
import com.techlabs.decoratorPattern.model.PremiumHat;
import com.techlabs.decoratorPattern.model.RibonedHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		
	PremiumHat premiumHat = new PremiumHat();
	System.out.println(premiumHat.getName());
	System.out.println(premiumHat.getPrice());
	System.out.println(premiumHat.getDescription());
	System.out.println();
	
	GoldenHat goldenStandardHat=new GoldenHat(premiumHat);
	System.out.println(goldenStandardHat.getName());
	System.out.println(goldenStandardHat.getPrice());
	System.out.println(goldenStandardHat.getDescription());
	System.out.println();
	
	RibonedHat ribonedGoldenStandard=new RibonedHat(goldenStandardHat);
	System.out.println(ribonedGoldenStandard.getName());
	System.out.println(ribonedGoldenStandard.getPrice());
	System.out.println(ribonedGoldenStandard.getDescription());
	System.out.println();

	}

}
