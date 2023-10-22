package com.kn.Arrays3d;

import java.util.Scanner;

public class Array3d {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of floors");
		String arr[][][] = new String[scan.nextInt()][][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number of Rooms in floor " + (i + 1));
			arr[i] = new String[scan.nextInt()][];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter number of Students in Room " + (j + 1) + " of floor " + (i + 1));
				arr[i][j] = new String[scan.nextInt()];
			}
		}
		scan.nextLine();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
				 	System.out.println("Enter name of the Student in Room " + (j + 1) + " of floor " + (i + 1));
					arr[i][j][k] = scan.nextLine();
				}
			}
		}
		System.out.println("===================================================================================");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Floor "+(i+1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Room no."+(j+1)+" --> ");
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Student."+(k+1)+" : "+arr[i][j][k]);
				}System.out.println("--------------------------------------");
			}System.out.println("===================================================================================");
		}
	}

}
