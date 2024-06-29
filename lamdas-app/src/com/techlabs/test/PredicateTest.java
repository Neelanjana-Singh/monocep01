package com.techlabs.test;
import java.util.function.Predicate;
public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> evenPredicate=(number)->{
			if(number%2==0)
				return true;
		    return false;
		};
		if(!evenPredicate.test(10))
		{
			System.out.println("number is odd");
			System.exit(0);
		}
		System.out.println("number is even");

	}

}
