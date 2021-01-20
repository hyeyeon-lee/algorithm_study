package codeup1;

import java.util.Scanner;

public class Q1269 {
	// 1269 : 수열의 값 구하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt(); //시작 값(a)
		int b = s.nextInt(); //곱할 값(b)
		int c = s.nextInt(); //더할 값(c)
		int n = s.nextInt(); //몇 번째 항인지 나타내는 정수(n)

		int pre = a;

		for (int i = 1; i < n; i++) {
			pre = pre * b + c;
		}

		System.out.println(pre);

	}
}
