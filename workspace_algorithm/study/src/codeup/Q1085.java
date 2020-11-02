package codeup;

import java.util.Scanner;

public class Q1085 {
	// 1085 : [기초-종합] 소리 파일 저장용량 계산하기(설명)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();

		long bit = (long) h * b * c * s;
		System.out.println(bit);
		double mb = (double) bit / 8 / 1024 / 1024;
		System.out.printf("%.1f MB", mb);

	}
}
