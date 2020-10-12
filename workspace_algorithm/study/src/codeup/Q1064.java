package codeup;

import java.util.Scanner;

public class Q1064 {

	// 1064 : [기초-삼항연산] 정수 3개 입력받아 가장 작은 수 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		System.out.printf("%d", (a < b ? a : b) < c ? (a < b ? a : b) : c);
	}

}
