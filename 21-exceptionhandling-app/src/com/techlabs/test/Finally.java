package com.techlabs.test;

public class Finally {

	public static void main(String[] args) {
		try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);

            double division = calculateDivision(number1, number2);
            System.out.println("Division is: " + division);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero! Change value of number2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong input. Please provide two integer values.");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Inside finally");
        }
        System.out.println("Bye");
    }

    private static double calculateDivision(int number1, int number2) {
        double division = 0;
        try {
            division = number1 / number2;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero inside calculateDivision method");
        }
        return division;
	}


	

}
