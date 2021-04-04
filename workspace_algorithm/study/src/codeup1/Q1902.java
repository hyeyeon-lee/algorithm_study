package codeup1;

import java.util.Scanner;

public class Q1902 {
	// 1902 : (재귀 함수) 1부터 n까지 역순으로 출력하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		print(num);

		s.close();

	}

	public static void print(int n) {
		System.out.println(n);
		if (n > 1) print(n - 1);
	}
}
