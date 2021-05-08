package backjoon;

import java.util.Scanner;

public class Q10870 {
	// 10870: 피보나치 수 5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		System.out.println(fibonacci(n));

	}

	static int fibonacci(int n) {
		if (n > 1) return fibonacci(n - 2) + fibonacci(n - 1);
		else return n;
	}

}
