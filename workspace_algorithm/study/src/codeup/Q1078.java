package codeup;

import java.util.Scanner;

public class Q1078 {
	// 1078 : [기초-종합] 짝수 합 구하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		int sum = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println(sum);

	}
}
