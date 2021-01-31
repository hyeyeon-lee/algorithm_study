package codeup1;

import java.util.Scanner;

public class Q1287 {
	// 1287 : 구구단을 *로 출력하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= n * i; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
