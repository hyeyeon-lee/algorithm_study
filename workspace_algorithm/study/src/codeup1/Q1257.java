package codeup1;

import java.util.Scanner;

public class Q1257 {
	// 1257 : 두 수 사이의 홀수 출력하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int start = s.nextInt();
		int end = s.nextInt();

		for (int i = start; i <= end; i++)
			if (i % 2 == 1)
				System.out.printf("%d ", i);
	}
}
