package com.techlabs.Whileloop;

import java.util.Scanner;

public class PrintTableRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        scanner.close();

        int i = start;
        while (i <= end) {
           // System.out.println(i);
            int j = 1;
            while (j <= 10) {
                System.out.print((i*j)+ " ");
              
                j++;
            }
            System.out.println();
            j++;
            break;
        }
	}

}
