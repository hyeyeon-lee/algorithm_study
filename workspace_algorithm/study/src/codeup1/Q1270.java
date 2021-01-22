package codeup1;

import java.util.Scanner;

public class Q1270 {
	// 1270 : 1의 개수는? 1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		int cnt = 0;

		for (int i = 1; i <= num; i++)
			if (i % 10 == 1)
				cnt++;


		System.out.println(cnt);
	}
}
