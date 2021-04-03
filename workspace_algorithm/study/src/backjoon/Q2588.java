package backjoon;

import java.util.Scanner;

public class Q2588 {
	// 2588 곱셈
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();

		System.out.println(a * (b % 10));
		System.out.println(a * (b % 100 / 10));
		System.out.println(a * (b % 1000 / 100));
		System.out.println(a * b);
	}

}
