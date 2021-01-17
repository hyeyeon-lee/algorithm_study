package codeup1;

import java.util.Scanner;

public class Q1259 {
	// 1259 : 1부터 n까지 중 짝수의 합 구하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int end = s.nextInt();
		int sum = 0;

		for (int i = 1; i <= end; i++)
			if (i % 2 == 0)
				sum += i;

		System.out.println(sum);
	}
}
