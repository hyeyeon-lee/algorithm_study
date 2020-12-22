package codeup1;

import java.util.Scanner;

public class Q1163 {
	// 1163 : 당신의 사주를 봐 드립니다 2
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int year = s.nextInt();
		int month = s.nextInt();
		int day = s.nextInt();

		int result = year + month + day;
		if (result / 100 % 2 == 0)
			System.out.println("대박");
		else
			System.out.println("그럭저럭");

	}
}
