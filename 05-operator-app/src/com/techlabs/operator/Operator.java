package com.techlabs.operator;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int number1=scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int number2=scanner.nextInt();
        
        
        System.out.println("Unary operator:");
        System.out.println("number1++ :"+number1++);
        System.out.println("++number1 :"+number1);
        System.out.println("number1-- :"+number1--);  
        System.out.println("--number1 :"+ --number1); 
        System.out.println();
        
        
        System.out.println("Arithmetic operator:");
        System.out.println("number1+number2 :"+number1+number2);  
        System.out.println("number1-number2 :"+(number1-number2)); 
        System.out.println("number1*number2 :"+number1*number2);  
        System.out.println("number1/number2 :"+number1/number2); 
        System.out.println("number1%number2 :"+number1%number2);
        System.out.println();
        
        
        System.out.println("Shift operator:");
        System.out.println("number1<<2 :"+(number1<<2));
        System.out.println("number2>>2 :"+(number2>>2));
        System.out.println();
        
        
        System.out.println("Bitwise  operator:");
        System.out.println("number1&number2 :"+(number1&number2));  
        System.out.println("number1|number2 :"+(number1|number2)); 
        System.out.println("number1^number2 :"+(number1^number2)); 
        System.out.println();
        
       
        System.out.println("Logical operator:");
        System.out.println("number1 && number2 : " + ((number1 != 0) && (number2 != 0)));
        System.out.println("number1 || number2 : " + ((number1 != 0) || (number2 != 0)));
        System.out.println();
        
        System.out.println("Ternary operator:");
        System.out.println("(number1<number2)?number1:number2-> "+((number1<number2)?number1:number2));
        System.out.println();
        
        System.out.println("Assignment operator:");
        System.out.println("number1+=number2 :"+(number1+=number2));  
        System.out.println("number1-=number2 :"+(number1-=number2)); 
        System.out.println("number1*=number2 :"+(number1*=number2));  
        System.out.println("number1/=number2 :"+(number1/=number2)); 
        System.out.println();
        
        System.out.println("Relational operator:");
        System.out.println("number1>number2 :"+(number1>number2));  
        System.out.println("number1<number2 :"+(number1<number2)); 
        System.out.println("number1==number2 :"+(number1==number2));  
        System.out.println("number1!=number2 :"+(number1!=number2)); 
        System.out.println("number1>=number2 :"+(number1>=number2));  
        System.out.println("number1<=number2 :"+(number1<=number2));
        scanner.close();
        
        
        
	}

}
