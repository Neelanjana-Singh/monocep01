package com.techlabs.array2d;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Rows:");
		int n=scanner.nextInt();
		System.out.println("Enter Columns:");
		int m=scanner.nextInt();
		int array[][];
		array=new int[n][m];
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		if(n<=0 && m<=0)
		{
			System.out.println("Array Empty:");
		}
		
		else
		{
		System.out.println("Enter Array element:");
		 if (n == 1 && m == 1) {
             array[0][0] = scanner.nextInt();
             secondlargest = array[0][0];
		 }
		 else
		 {
		    for(int i=0;i<n;i++)
		     {
			      for(int j=0;j<m;j++)
			        { 
				       array[i][j]=scanner.nextInt();
				      if(array[i][j]>largest)
				       {
				        secondlargest=largest;
					    largest=array[i][j];
                       }
				     else if(array[i][j]>secondlargest &&array[i][j]<largest )
				     {
					secondlargest=array[i][j];
				    }
			     }
		     }
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("second largest number is:"+secondlargest);
		}
		
		
		
		scanner.close();
		
	}

}
