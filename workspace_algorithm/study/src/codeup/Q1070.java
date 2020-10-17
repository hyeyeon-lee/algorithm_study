package codeup;

import java.util.Scanner;

public class Q1070 {

	// 1070 : [기초-조건/선택실행구조] 월 입력받아 계절 출력하기(설명)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int month = s.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("fall");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("winter");
			break;
		default:
			break;
		}

	}

}
