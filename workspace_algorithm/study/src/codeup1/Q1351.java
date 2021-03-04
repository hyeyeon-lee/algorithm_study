package codeup1;

import java.util.Scanner;

public class Q1351 {
	// 1351 : 구구단 출력하기 2
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();

		for (int i = start; i <= end; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.printf("%d*%d=%d\n", i, j, i * j);
		}

	}

}
