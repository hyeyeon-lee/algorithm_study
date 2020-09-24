package chap01;

import java.util.Scanner;

public class Quest15 {
	// 직각 이등변 삼각형 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n;

		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

		do {
			System.out.println("몇 단 삼각형입니까? : ");
			n = s.nextInt();
		} while (n <= 0);

		triangleLB(n);
		System.out.println();
		triangleLU(n);
		System.out.println();
		triangleRU(n);
		System.out.println();
		triangleRB(n);
	}

	// 왼쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	// 왼쪽 위가 직각인 이등변 삼각형을 출력
	static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			// for (int j = 1; j <= n - i + 1; j++) 모범
			for (int j = 0; j <= n - i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	// 오른쪽 위가 직각인 이등변 삼각형을 출력
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			// for (int j = 1; j <= i - 1; j++)
			for (int j = 1; j < i; j++)
				System.out.print(" ");
			// for (int j = 1; j <= n - i + 1; j++)
			for (int j = i; j <= n; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	// 오른쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
