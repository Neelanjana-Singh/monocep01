package com.techlabs.array;
public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[];
		array=new int[6];
		array[1]=40;
	    array[5]=50;
	    array[2]=70;
	    array[3]=20;
	   int Maximum=array[0];
	   for(int i=0;i<array.length;i++)
		   
	   {
		   System.out.println(array[i]);
		   
		   if(array[i]>Maximum)
		   {
			   Maximum=array[i];
		   }
	   }
	  System.out.println("Maximum of elements:"+Maximum);
	}
	}


