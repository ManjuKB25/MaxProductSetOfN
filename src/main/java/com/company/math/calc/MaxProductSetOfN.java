package com.company.math.calc;

public class MaxProductSetOfN {

	public static void main(String[] args) {
		getMaxProdutNumbersOfN(8);
	}

	public static long getMaxProdutNumbersOfN(long n) {
		System.out.println("For " + n + " : ");
		//For values < 4 need specific conditions as below
		if (n < 2) {
			System.out.println(" : " + 0);
			return 0;
		} else if (n == 2) {
			System.out.println(" : " + 1);
			return 1;
		} else if (n == 3) {
			System.out.println(" : " + 2);
			return 2;
		} else {
			// Recursive call for rest of the input
			long result = recMul(n);
			System.out.println(" : " + result);
			return result;
		}
	}

	private static long recMul(long n) {
		if (n == 2 || n == 3) {
			System.out.print((n));
			return (n);
		}
		if (n - 3 >= 3) {
			System.out.print("3*");
			return 3 * recMul(n - 3);
		} else if (n - 2 >= 2) {
			System.out.print("2*");
			return 2 * recMul(n - 2);
		} else
			System.out.print(n);
		return n;
	}

}
