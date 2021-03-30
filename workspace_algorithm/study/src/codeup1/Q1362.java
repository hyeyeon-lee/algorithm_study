package codeup1;

import java.util.Scanner;

public class Q1362 {
	// 1362 : 숫자 피라미드 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		int sum = sum(num);

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++)
				System.out.printf("%d ", sum--);
			System.out.println();
		}

	}

	static int sum(int n) {
		int result = 0;
		if (n > 0) result = n + sum(n - 1);
		return result;
	}

}
