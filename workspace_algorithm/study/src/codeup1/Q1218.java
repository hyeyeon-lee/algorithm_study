package codeup1;

import java.util.Scanner;

public class Q1218 {
	// 1218 : 삼각형 판단하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a + b > c) {
			if (a == b && a == c)
				System.out.println("정삼각형");
			else if (a == b || b == c || a == c)
				System.out.println("이등변삼각형");
			else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
				System.out.println("직각삼각형");
			else
				System.out.println("삼각형");
		} else
			System.out.println("삼각형아님");
	}
}
