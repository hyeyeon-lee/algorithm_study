package codeup;

import java.util.Scanner;

public class Q1053 {

	// 1053 : [기초-논리연산] 참 거짓 바꾸기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		int result = a == 1 ? 0 : 1;
		System.out.printf("%d", result);
	}

}
