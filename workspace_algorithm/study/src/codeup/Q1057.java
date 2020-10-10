package codeup;

import java.util.Scanner;

public class Q1057 {

	// 1057 : [기초-논리연산] 참/거짓이 서로 같을 때에만 참 출력하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		int result = (a == 1 && b == 1) || (a == 0 && b == 0) ? 1 : 0;
		System.out.printf("%d", result);
	}

}
