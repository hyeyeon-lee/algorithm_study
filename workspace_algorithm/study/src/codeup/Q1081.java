package codeup;

import java.util.Scanner;

public class Q1081 {
	// 1081 : [기초-종합] 주사위를 2개 던지면?(설명)
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= m; j++)
				System.out.printf("%d %d\n", i, j);

	}
}
