package codeup1;

import java.util.Scanner;

public class Q1277 {
	// 1277 : 몇 번째 데이터 출력하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int start, mid, end;
		start = mid = end = 0;

		for (int i = 0; i < n; i++) {
			int input = s.nextInt();

			if (i == 0)
				start = input;
			if (i == n / 2)
				mid = input;
			if (i == n - 1)
				end = input;

		}

		System.out.printf("%d %d %d", start, mid, end);

	}

}
