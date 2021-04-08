package codeup1;

import java.util.Scanner;

public class Q1905 {
	// 1905 : (재귀함수) 1부터 n까지 합 구하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		int hap = sum(num);
		System.out.println(hap);

		s.close();

	}

	public static int sum(int n) {
		if (n > 1) return n + sum(n - 1);
		return n;
	}
}
