package com.techlabs.array;

import java.util.Scanner;

public class PickElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int result[] = new int[n];
        

        for (int i = 0; i < n; i++) {
            if (i == 0 && array[i] >array[i + 1]) {
                result[i] = array[i];
            }
            else if (i == n - 1 && array[i] >array[i - 1]) {
                result[i] = array[i];
            }

            else if (i > 0 && i < n - 1 && array[i] > array[i - 1] && array[i] >array[i + 1]) {
                result[i] = array[i];
            }

            
        }
        System.out.print("Peak elements: ");
        for (int i = 0; i < n; i++) {
            if (result[i] != 0) {
                System.out.print(result[i] + " ");
            }
        }
        System.out.println();
        scanner.close();

    }

}
