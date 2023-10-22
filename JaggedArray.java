package com.kn.Arrays2D;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of classes");
		String arr[][] = new String[scan.nextInt()][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number of students in class "+(i+1));
			arr[i] = new String[scan.nextInt()];
		}
		scan.nextLine();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
			    System.out.println("Enter Student "+(j+1)+" name in class "+(i+1));
				arr[i][j] = scan.nextLine();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("class "+(i+1)+" : ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println((j+1)+" . "+arr[i][j]);
			}
		}
		
	}

}
