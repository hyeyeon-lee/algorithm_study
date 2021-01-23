package codeup1;

import java.util.Scanner;

public class Q1274 {
	// 1274 : 소수 판별
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		int cnt = 0;

		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				cnt++;

		if (cnt == 2)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

}
