package codeup;

import java.util.Scanner;

public class Q1083 {
	// 1083 : [기초-종합] 3 6 9 게임의 왕이 되자!(설명)
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 1; i <= num; i++)
			if (i % 3 == 0)
				System.out.print("X ");
			else
				System.out.printf("%d ", i);

	}
}
