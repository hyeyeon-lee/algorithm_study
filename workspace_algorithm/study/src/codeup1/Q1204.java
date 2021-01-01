package codeup1;

import java.util.Scanner;

public class Q1204 {
	// 1204 : 영어 서수로 표현하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		System.out.print(num);

		if (num / 10 != 1) {
			switch (num % 10) {
			case 1:
				System.out.println("st");
				break;
			case 2:
				System.out.println("nd");
				break;
			case 3:
				System.out.println("rd");
				break;
			default:
				System.out.println("th");
				break;
			}
		} else {
			System.out.println("th");
		}
	}
}
