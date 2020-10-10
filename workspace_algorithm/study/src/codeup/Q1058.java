package codeup;

import java.util.Scanner;

public class Q1058 {

	// 1058 : [기초-논리연산] 둘 다 거짓일 경우만 참 출력하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		int result = a == 0 && b == 0 ? 1 : 0;
		System.out.printf("%d", result);
	}

}
