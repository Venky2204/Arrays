package com.kn.Arrays2D;

import java.util.Scanner;

public class SumofElements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2D array length");
		int arr[][] = new int[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println(addElements(arr));
		scan.close();
		
	}

	  static int addElements(int[][] arr) {
		  int sum = 0;
		  for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		  return sum;
	}
}
