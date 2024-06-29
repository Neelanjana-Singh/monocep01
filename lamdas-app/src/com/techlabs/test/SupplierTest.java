package com.techlabs.test;

import java.util.Calendar;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<Integer> supplier=()->
		{
			Random random=new Random();
			return random.nextInt();
		};
		System.out.println("random number generated:"+supplier.get());
		
		  Supplier<String> supplierDate = () -> {
	            Calendar calendar = Calendar.getInstance();
	            int year = calendar.get(Calendar.YEAR);
	            int month = calendar.get(Calendar.MONTH) + 1;
	            int day = calendar.get(Calendar.DAY_OF_MONTH);
	            return year + "-" + (month < 10 ? "0" + month : month) + "-" + (day < 10 ? "0" + day : day);
	        };
	        System.out.println( supplierDate.get());
		

	}

}
