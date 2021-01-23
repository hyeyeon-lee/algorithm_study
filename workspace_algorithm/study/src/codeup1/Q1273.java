package codeup1;

import java.util.Scanner;

public class Q1273 {
	// 1273 : 약수 구하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				System.out.printf("%d ", i);
	}

}
