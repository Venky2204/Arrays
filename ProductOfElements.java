package com.kn.Arrays2D;

import java.util.Scanner;

public class ProductOfElements {
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
		System.out.println(elementsProduct(arr));
		scan.close();
		
	}

	  static int elementsProduct(int[][] arr) {
		  int product = 1;
		  for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				product *= arr[i][j];
			}
		}
		  return product;
	}
}
