package controller;

import java.util.Scanner;

public class Interp {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		double x1, x2, x3, y1, y3, ans;

		System.out.println("Interpolation Calculator");
		System.out.println("|----|----|");
		System.out.println("| x1 | y1 |");
		System.out.println("|----|----|");
		System.out.println("| x2 | y2 |");
		System.out.println("|----|----|");
		System.out.println("| x3 | y3 |");
		System.out.println("|----|----|");

		System.out.print("\nEnter x1: ");
		x1 = kb.nextInt();
		System.out.print("\nEnter x2: ");
		x2 = kb.nextInt();
		System.out.print("\nEnter x3: ");
		x3 = kb.nextInt();
		System.out.print("\nEnter y1: ");
		y1 = kb.nextInt();
		System.out.print("\nEnter y3: ");
		y3 = kb.nextInt();
		kb.close();
		ans = doMath(x1, x2, x3, y1, y3);
		System.out.println("The answer is " + ans);

	}

	public static double doMath(double x1, double x2, double x3, double y1, double y3) {
		return ((x2 - x1) * (y3 - y1) / (x3 - x1)) + y1;
	}
}