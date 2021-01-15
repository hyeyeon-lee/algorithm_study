package codeup1;

import java.util.Scanner;

public class Q1255 {
	// 1255 : 두 실수 사이 출력하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double start = s.nextDouble();
		double end = s.nextDouble();

		for (double i = start; i <= end; i+=0.01) {
			System.out.printf("%.2f ", i);
		}

	}
}
