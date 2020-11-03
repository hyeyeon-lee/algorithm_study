package codeup;

import java.util.Scanner;

public class Q1086 {
	// 1086 : [기초-종합] 그림 파일 저장용량 계산하기(설명)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();

		long bit = (long) w * h * b;
		double mb = (double) bit / 8 / 1024 / 1024;
		System.out.printf("%.2f MB", mb);

	}
}
