package chap01;

import java.util.Scanner;

public class Quest17 {
	// n단 피라미드 출력 (숫자로)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n;

		System.out.println("n단 피라미드를 출력합니다.");

		do {
			System.out.println("몇 단입니까? : ");
			n = s.nextInt();
		} while (n <= 1);

		npira(n);
	}

	// n단 피라미드를 숫자로 출력
	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int j = n - i + 1; j <= n - 1 + i; j++)
				System.out.print(i%10);

			System.out.println();
		}
	}

}
