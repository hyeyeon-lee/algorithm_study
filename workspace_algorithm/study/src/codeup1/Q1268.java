package codeup1;

import java.util.Scanner;

public class Q1268 {
	// 1268 : n개의 수 중 짝수의 개수
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		int cnt = 0;

		for (int i = 0; i < num; i++) {
			int in = s.nextInt();
			if (in % 2 == 0)
				cnt++;
		}

		System.out.println(cnt);

	}
}
