package codeup;

import java.util.Scanner;

public class Q1051 {

	// 1051 : [기초-비교연산] 두 정수 입력받아 비교하기3(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		int result = a <= b ? 1 : 0;
		System.out.printf("%d", result);
	}

}