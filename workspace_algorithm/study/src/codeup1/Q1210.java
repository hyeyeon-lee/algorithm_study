package codeup1;

import java.util.Scanner;

public class Q1210 {
	// 1210 : 칼로리 계산하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		int aCal = getCalorie(a);
		int bCal = getCalorie(b);

		if (aCal + bCal > 500)
			System.out.println("angry");
		else
			System.out.println("no angry");

	}

	public static int getCalorie(int menu) {
		int cal = 0;
		switch (menu) {
		case 1:
			cal = 400;
			break;
		case 2:
			cal = 340;
			break;
		case 3:
			cal = 170;
			break;
		case 4:
			cal = 100;
			break;
		case 5:
			cal = 70;
			break;
		default:
			break;
		}
		return cal;
	}
}
