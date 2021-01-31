package codeup1;

import java.util.Scanner;

public class Q1284 {
	// 1284 : 암호 해독
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int a = n;

		int cnt = 0;
		int gop = 1;

		for (int i = 2; i <= a; i++) {
			if (checkPrime(i) && a % i == 0) {
				a /= i;
				gop *= i;
				cnt++;
				if (cnt > 2 || n == gop)
					break;
				// System.out.printf("%d ", i);
			}
		}

		if (cnt == 2 && gop == n) {
			for (int i = 2; i <= n; i++) {
				if (checkPrime(i) && n % i == 0) {
					n /= i;
					System.out.printf("%d ", i);
				}
			}
		} else
			System.out.println("wrong number");

	}

	// 소수 판별
	public static boolean checkPrime(int num) {
		int cnt = 0;
		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				cnt++;
		return cnt == 2 ? true : false;
	}

}
