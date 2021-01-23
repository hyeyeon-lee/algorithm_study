package codeup1;

import java.util.Scanner;

public class Q1272 {
	// 1272 : 기부
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int john = s.nextInt(); // 존 순서
		int bob = s.nextInt(); // 밥 순서

		System.out.println(getMoney(john) + getMoney(bob));

	}

	public static int getMoney(int who) {
		int money = 0;

		// 1, 10, 2, 20, 3, 30 ..... 규칙

		// 1, 3, 5.... 홀수일 경우 1의 단위
		// 2, 4, 6.... 짝수일 경우 10의 단위

		// 1->1, 3->2, 5->3 (입력값/2 + 입력값%2)
		// 2->10, 4->20, 6->30 (입력값*5)

		if (who % 2 == 0) // 짝수면
			money = who * 5;
		else // 홀수면
			money = who / 2 + 1;

		return money;
	}
}
