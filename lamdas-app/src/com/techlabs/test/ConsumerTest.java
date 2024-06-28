package com.techlabs.test;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
  
	public static void main(String[] args) {
		Consumer<Integer> consumer=(arg)->System.out.println(arg);
		consumer.accept(50);
		
		BiConsumer<Integer,Integer> biConsumer=(number1,number2)->
		System.out.println("Addition is:"+(number1+number2)) ;
		biConsumer.accept(20,30);
		
		 BiConsumer<Integer, Integer> biConsumerSwap = (number1, number2) -> {
	            System.out.println("Before Swap: number1 = " + number1 + ", number2 = " + number2);
	            int temp = number1;
	            number1 = number2;
	            number2 = temp;
	            System.out.println("After Swap: number1 = " + number1 + ", number2 = " + number2);
	        };
             biConsumerSwap.accept(30, 40); 

	}

}
