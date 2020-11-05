package codeup;

import java.util.Scanner;

public class Q1088 {
	// 1088 : [기초-종합] 3의 배수는 통과?(설명)
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		int i = 0;
		while (i++ < num) {
			if (i % 3 == 0)
				continue;
			System.out.printf("%d ", i);
		}

	}
}
