package codeup1;

import java.util.Scanner;

public class Q1916 {

	public static int[] arr;

	// 1916 : (재귀함수) 피보나치 수열 (Large)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		arr = new int[num + 1];
		System.out.println(fibonacci(num));

		s.close();

	}

	public static int fibonacci(int n) {
		if (n > 2) {
			if (arr[n] != 0) return arr[n];
			else {
				arr[n] = (fibonacci(n - 2) + fibonacci(n - 1)) % 10009;
				return arr[n];
			}

		} else return 1;
	}
}
