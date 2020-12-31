package codeup1;

import java.util.Scanner;

public class Q1180 {
	// 1180 : 만능 휴지통
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// 70
		int num = s.nextInt();

		// 7
		int mok = num / 10;

		// 0
		int nmg = num % 10;

		// 10의 자릿수와 1의 자릿수를 서로 바꾸고, 거기에 2를 곱한다.
		int zip = (nmg * 10 + mok) * 2;

		// 만약 이 알고리즘의 심각한 부작용으로 수치가 100이 넘는다면 100의 자릿수는 무시된다.
		if (zip / 100 >= 1)
			zip %= 100;
		System.out.println(zip);

		if (zip <= 50)
			System.out.println("GOOD");
		else
			System.out.println("OH MY GOD");

	}
}
