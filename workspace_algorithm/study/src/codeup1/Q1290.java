package codeup1;

import java.util.Scanner;

public class Q1290 {
	// 1290 : 대금 만들기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		int cnt = 0;

		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				cnt++;

		System.out.printf("%d", cnt - 1);
	}

}
