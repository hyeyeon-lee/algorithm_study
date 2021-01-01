package codeup1;

import java.util.Scanner;

public class Q1203 {
	// 1203 : 비만도 측정 0
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int score = s.nextInt();

		if (score <= 10)
			System.out.println("정상");
		else if (score <= 20)
			System.out.println("과체중");
		else
			System.out.println("비만");

	}
}
