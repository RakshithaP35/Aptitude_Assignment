package com.xworkz.aptitude.assignment5;

public class AlphabetPattern {

	public static void main(String[] args) {
		int row = 5;
		int col = row / 2 + 1;

		printA(row, col);
		System.out.println();
		printB(row, col);
		System.out.println();
		printC(row);
		System.out.println();
		printD(row);
		System.out.println();
		printE(row, col);
		System.out.println();
		printF(row, col);
		System.out.println();
		printG(row, col);
		System.out.println();
		printH(row, col);
		System.out.println();
		printI(row, col);
		System.out.println();
		printJ(row, col);
		System.out.println();
		printK(row, col);
		System.out.println();
		printL(row);
		System.out.println();
		printM(row, col);
		System.out.println();
		printN(row);
		System.out.println();
		printO(row);
		System.out.println();
		printP(row, col);
		System.out.println();
		printQ(row, col);
		System.out.println();
		printR(row, col);
		System.out.println();
		printS(row, col);
		System.out.println();
		printT(row, col);
		System.out.println();
		printU(row);
		System.out.println();
		printV(row, col);
		System.out.println();
		printW(row, col);
		System.out.println();
		printX(row);
		System.out.println();
		printY(row, col);
		System.out.println();
		printZ(row);
	}

	public static void printA(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == col)
					System.out.print("* ");
				else if (r > col && (c == 1 || c == row))
					System.out.print("* ");
				else if (c - r == row / 2)
					System.out.print("* ");
				else if ((r + c) - (row / 2) == 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printB(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || ((r == row || r == 1) && c < row - 1))
					System.out.print("* ");
				else if (c <= col && r == col)
					System.out.print("* ");
				else if (r + c == row + 1 && r < col && r > 1)
					System.out.print("* ");
				else if (r == c && r > col && r < row)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printC(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 && r > 1 && r < row)
					System.out.print("* ");
				else if (c > 1 && (r == 1 || r == row))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printD(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || ((r == 1 || r == row) && c < row))
					System.out.print("* ");
				else if (r > 1 && r < row && c == row)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printE(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || r == 1 || r == row || r == col)
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printF(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || r == 1 || r == col)
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printG(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 && r > 1 && r < row)
					System.out.print("* ");
				else if (c > 1 && (r == 1 || r == row))
					System.out.print("* ");
				else if (r >= col && c == row)
					System.out.print("* ");
				else if (r == col && c >= col)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printH(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == col || (c == 1 || c == row))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printI(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == col || r == row || r == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printJ(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == 1 || (r == row && c > 1 && c < row))
					System.out.print("* ");
				else if (c == row && r < row)
					System.out.print("* ");
				else if (c == 1 && r < row && r > col)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printK(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || c <= col && r == col)
					System.out.print("* ");
				else if (r + c == row + 1 && r <= col)
					System.out.print("* ");
				else if (r == c && r >= col)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printL(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == row || c == 1)
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printM(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || c == row)
					System.out.print("* ");
				else if ((r == c || r + c == row + 1) && r <= col)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printN(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || c == row || r == c)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printO(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if ((c == 1 || c == row) && r > 1 && r < row)
					System.out.print("* ");
				else if ((r == 1 || r == row) && c > 1 && c < row)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printP(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || (r == 1 && c < row - 1))
					System.out.print("* ");
				else if (c <= col && r == col)
					System.out.print("* ");
				else if (r + c == row + 1 && r < col && r > 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printQ(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if ((c == 1 || c == row) && r > 1 && r < row - 1)
					System.out.print("* ");
				else if (r == 1 && c > 1 && c < row)
					System.out.print("* ");
				else if (r == row - 1 && c > 1 && c < row - 1)
					System.out.print("* ");
				else if (r == c && r >= col)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printR(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || (r == 1 && c < row - 1))
					System.out.print("* ");
				else if (c <= col && r == col)
					System.out.print("* ");
				else if (r + c == row + 1 && r < col && r > 1)
					System.out.print("* ");
				else if (r == c && r > col)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printS(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 && r > 1 && r < col)
					System.out.print("* ");
				else if (r == col && c > 1 && c < row)
					System.out.print("* ");
				else if (c == row && r < row && r > col)
					System.out.print("* ");
				else if ((c > 1 && r == 1) || (c < row && r == row))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printT(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == 1 || c == col)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printU(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == row && c > 1 && c < row)
					System.out.print("* ");
				else if (r < row && (c == 1 || c == row))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printV(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == row && c == col)
					System.out.print("* ");
				else if (r <= col && (c == 1 || c == row))
					System.out.print("* ");
				else if (c + r == row + col)
					System.out.print("* ");
				else if (r - c == row / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printW(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (c == 1 || c == row)
					System.out.print("* ");
				else if ((r == c || r + c == row + 1) && r >= col)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printX(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r + c == row + 1 || r == c)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printY(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r + c == row + 1 || (r == c && r <= col))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void printZ(int row) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= row; c++) {
				if (r == 1 || r == row || r + c == row + 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
