package com.techlabs.array2d;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Rows:");
		int n=scanner.nextInt();
		System.out.println("Enter Columns:");
		int m=scanner.nextInt();
		int array1[][];
		array1=new int[n][m];
		int array2[][];
		array2=new int[n][m];
		System.out.println("Enter first array elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				array1[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Enter second array elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				array2[i][j]=scanner.nextInt();
			}
		}
		int sum[][];
		sum=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				sum[i][j]=array1[i][j]+array2[i][j];
			}
		}
		System.out.println("sum of arrays:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
		
	}

}
