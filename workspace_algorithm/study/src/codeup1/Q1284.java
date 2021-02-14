package codeup1;

import java.util.Scanner;

public class Q1284 {
	// 1284 : 암호 해독
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		boolean flag = false;

		for (int i = 2; i <= n; i++) {
			// System.out.println(i);
			if (n % i == 0) {
				if (checkPrime(i) && checkPrime(n / i)) {
					System.out.printf("%d %d", i, n / i);
					flag = true;
					break;
				}
			}
		}

		if (!flag)
			System.out.println("wrong number");
	}

	// 소수 판별
	public static boolean checkPrime(int num) {
		int cnt = 0;
		if (num == 1)
			return false; // 1은 소수가 아님
		if (num == 2)
			return true; // 2은 소수
		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				cnt++;
		return cnt == 2 ? true : false;
	}

}
