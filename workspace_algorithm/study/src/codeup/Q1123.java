package codeup;

import java.util.Scanner;

public class Q1123 {
	// 1123 : 섭씨 온도를 화씨 온도로 변환
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int c = s.nextInt();
		float f = (float) 9 / 5 * c + 32;

		System.out.printf("%.3f", f);

	}
}
