package codeup;

import java.util.Scanner;

public class Q1063 {

	// 1063 : [기초-삼항연산] 두 정수 입력받아 큰 수 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		System.out.printf("%d", a > b ? a : b);
	}

}
