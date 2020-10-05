package codeup;

import java.util.Scanner;

public class Q1046 {

	// 1046 : [기초-산술연산] 정수 3개 입력받아 합과 평균 출력하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String num = s.nextLine();
		String arr[] = num.split(" ");

		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);

		Long sum = (long) a + b + c;
		System.out.printf("%d", sum);
		System.out.println();
		System.out.printf("%.1f", (double) sum / arr.length);
	}

}
