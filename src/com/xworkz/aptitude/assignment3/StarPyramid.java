package com.xworkz.aptitude.assignment3;

public class StarPyramid {

	public static void main(String[] args) {
		int rows = 3;

		for (int i = 1; i <= rows; i++) {
		
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();

		}


	}

}
