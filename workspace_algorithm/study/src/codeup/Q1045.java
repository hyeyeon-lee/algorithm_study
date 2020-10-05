package codeup;

import java.util.Scanner;

public class Q1045 {

	// 1045 : [기초-산술연산] 정수 2개 입력받아 자동 계산하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String num = s.nextLine();
		String arr[] = num.split(" ");

		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);


		System.out.printf("%d", (long) a + b);
		System.out.println();
		System.out.printf("%d", a - b);
		System.out.println();
		System.out.printf("%d", (long) a * b);
		System.out.println();
		System.out.printf("%d", a / b);
		System.out.println();
		System.out.printf("%d", a % b);
		System.out.println();
		System.out.printf("%.2f", (float) a / b);
	}

}
