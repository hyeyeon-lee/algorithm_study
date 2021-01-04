package codeup1;

import java.util.Scanner;

public class Q1207 {
	// 1207 : 윷놀이
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();

		switch (a + b + c + d) {
		case 0:
			System.out.println("모");
			break;
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		default:
			break;
		}

	}
}
