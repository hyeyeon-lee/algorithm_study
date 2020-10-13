package codeup;

import java.util.Scanner;

public class Q1065 {

	// 1065 : [기초-조건/선택실행구조] 정수 3개 입력받아 짝수만 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a % 2 == 0)
			System.out.printf("%d\n", a);
		if (b % 2 == 0)
			System.out.printf("%d\n", b);
		if (c % 2 == 0)
			System.out.printf("%d", c);

	}

}
