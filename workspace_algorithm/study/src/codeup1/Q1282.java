package codeup1;

import java.util.Scanner;

public class Q1282 {
	// 1282 : 제곱수 만들기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int k = 0;
		int t = 0;

		for (int i = 1; i * i <= n; i++)
			t = i;

		k = n - t * t;
		System.out.printf("%d %d", k, t);
	}

}
