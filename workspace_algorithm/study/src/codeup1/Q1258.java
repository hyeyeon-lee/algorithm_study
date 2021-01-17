package codeup1;

import java.util.Scanner;

public class Q1258 {
	// 1258 : 1부터 n까지 합 구하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int end = s.nextInt();
		int sum = 0;

		for (int i = 1; i <= end; i++)
			sum += i;

		System.out.println(sum);
	}
}
