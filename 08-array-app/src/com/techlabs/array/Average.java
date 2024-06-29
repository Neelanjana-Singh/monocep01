package com.techlabs.array;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Rows:");
		int n=scanner.nextInt();
		System.out.println("Enter Columns:");
		int m=scanner.nextInt();
		int array[][];
		array=new int[n][m];
		int sum=0;
		boolean pair=false;
		double average;
		 if (n <= 1 && m <=1) 
		 {
	            System.out.println("Provide valid input");
	     }
		 else
		 {
		System.out.println("Enter  array elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				array[i][j]=scanner.nextInt();
				sum+=array[i][j];
			}
		}
	  average=(double)sum/(n*m);
	  for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              for (int k = 0; k < n; k++) {
                  for (int l = j+1; l <m; l++) {
                       double pairSum = array[i][j] + array[k][l];
                          if (pairSum == average) {
                        	  pair=true;
                        	 }
                          
                      }
                  }
              }
          }
		 
   
	    if(pair)
	     System.out.println("true");
	    else
	    System.out.println("false");
		 }
		 
	    scanner.close();
	  
	 
			}
	
	}
	  


