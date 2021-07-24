package com.xworkz.aptitude.arrayMatrix;

public class PlusMatrix {

	public static void main(String[] args) {
		int[][] array = new int[5][5];

		for (int i = 1; i <= array.length; i++) {
			if (i == 3) {
				for (int j = 1; j <= array.length; j++)
					System.out.print(i + "" + j + " ");
			} else {
				System.out.print("      ");
				System.out.print(i + "" + 3 + " ");
			}
			System.out.println();
		}
	}
}
