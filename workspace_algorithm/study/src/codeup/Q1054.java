package codeup;

import java.util.Scanner;

public class Q1054 {

	// 1054 : [기초-논리연산] 둘 다 참일 경우만 참 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		int result = a == 1 && b == 1 ? 1 : 0;
		System.out.printf("%d", result);
	}

}
