package codeup1;

import java.util.Scanner;

public class Q1222 {
	// 1222 : 축구의 신 2
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int time = s.nextInt();
		int one = s.nextInt();
		int two = s.nextInt();

		for (int i = time; i < 90; i += 5) {
			one++;
		}

		if (one > two)
			System.out.println("win");
		else if (one < two)
			System.out.println("lose");
		else
			System.out.println("same");

	}
}
