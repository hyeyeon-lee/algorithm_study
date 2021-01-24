package codeup1;

import java.util.Scanner;

public class Q1276 {
	// 1276 : 팩토리얼 계산
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int f = 1;

		for (int i = n; i >= 1; i--)
			f *= i;

		System.out.println(f);

	}

}
