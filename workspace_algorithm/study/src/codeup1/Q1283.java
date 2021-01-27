package codeup1;

import java.util.Scanner;

public class Q1283 {
	// 1283 : 주식 투자
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt(); // 투자한 액수
		int b = s.nextInt(); // 투자 일수

		float money = a;
		for (int i = 1; i <= b; i++) {
			int p = s.nextInt(); // 일일 변동폭
			money = money * (100 + p) / 100;
		}

		float prf = money - a;
		System.out.printf("%.0f\n", prf);

		if (prf > 0)
			System.out.println("good");
		else if (prf == 0)
			System.out.println("same");
		else
			System.out.println("bad");
	}

}
