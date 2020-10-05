package codeup;

import java.util.Scanner;

public class Q1043 {

	// 1043 : [기초-산술연산] 정수 2개 입력받아 나눈 나머지 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String num = s.nextLine();
		String arr[] = num.split(" ");

		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);

		System.out.printf("%d", a % b);
	}

}
