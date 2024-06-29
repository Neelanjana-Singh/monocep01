package com.techlabs.test;

import com.techlabs.model.Complex;


public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Complex complexNumber1 = new Complex(10, 5);
	        Complex complexNumber2 = new Complex(5, 7);
	        
	        Complex result = addition(complexNumber1, complexNumber2);
	        		
	        System.out.println("Addition: " + result.getReal() + "+" + result.getImaginary() + "i");
	    }
	    
	    private static Complex addition(Complex complexNumber1, Complex complexNumber2) {
	        Complex result = new Complex();
	        result.setReal(complexNumber1.getReal() + complexNumber2.getReal());
	        result.setImaginary(complexNumber1.getImaginary() + complexNumber2.getImaginary());
	        return result;

	  }

}
