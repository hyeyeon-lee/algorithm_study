package codeup;

import java.util.Scanner;

public class Q1039 {

	// 1039 : [기초-산술연산] 정수 2개 입력받아 합 출력하기2(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] arr = str.split(" ");
		Long a = Long.parseLong(arr[0]);
		Long b = Long.parseLong(arr[1]);

		System.out.printf("%d", a + b);
	}

}
