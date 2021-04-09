package codeup1;

import java.util.Scanner;

public class Q1912 {
	// 1912 : (재귀함수) 팩토리얼 계산
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		System.out.println(factorial(num));

		s.close();

	}

	public static int factorial(int n) {
		if (n > 1) return n * factorial(n - 1);
		else return 1;
	}
}
