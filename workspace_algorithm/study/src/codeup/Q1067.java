package codeup;

import java.util.Scanner;

public class Q1067 {

	// 1067 : [기초-조건/선택실행구조] 정수 1개 입력받아 분석하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		if (num > 0) {
			System.out.printf("%s\n", "plus");
			if (num % 2 == 0)
				System.out.printf("%s\n", "even");
			else
				System.out.printf("%s\n", "odd");
		} else {
			System.out.printf("%s\n", "minus");
			if (num % 2 == 0)
				System.out.printf("%s\n", "even");
			else
				System.out.printf("%s\n", "odd");
		}

	}

}
