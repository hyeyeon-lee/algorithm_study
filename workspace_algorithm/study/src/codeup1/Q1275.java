package codeup1;

import java.util.Scanner;

public class Q1275 {
	// 1275 : k 제곱 구하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int k = s.nextInt();

		int sqrd = 1;

		for (int i = 0; i < k; i++)
			sqrd *= n;

		System.out.println(sqrd);
		//System.out.println(Math.pow(n, k));

	}

}
