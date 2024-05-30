package com.techlabs.array;

public class ElementSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[];
		array=new int[6];
		array[1]=40;
	    array[5]=50;
	    array[2]=70;
	    array[3]=20;
	   int sum=0;
	   for(int i=0;i<array.length;i++)
		   
	   {
		   System.out.println(array[i]);
		   sum+=array[i];
		  
	   }
	   
	   System.out.println("Sum of elements:"+sum);
	}

}
