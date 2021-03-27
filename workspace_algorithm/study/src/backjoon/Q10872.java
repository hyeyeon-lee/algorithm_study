package backjoon;

import java.util.Scanner;

public class Q10872 {
	// 10872: 팩토리얼
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		System.out.println(factorial(n));

	}

	static int factorial(int n) {
		if (n > 1) return n * factorial(n - 1);
		else return 1;
	}

}
