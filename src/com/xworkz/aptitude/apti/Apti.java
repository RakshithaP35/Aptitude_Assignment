package com.xworkz.aptitude.apti;

public class Apti {

	public static void main(String[] args) {
		Apti apti = new Apti();
		int ij = 5;
	    Apti.printMatrix(ij);
	}

	static void printMatrix(int ij) {
		for (int j = 1; j <= ij; j++) {
			for (int i = 1; i <= ij; i++) {
				if ((i == 3) || (j==3)) {
					System.out.print(j + "" + i + " ");
				}  else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
