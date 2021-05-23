package backjoon;

import java.util.Scanner;

public class Q11021 {
	// 11021 A+B-7

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			arr[i] = a + b;
		}

		for (int i = 0; i < n; i++)
			System.out.printf("Case #%d: %d\n", i + 1, arr[i]);
	}

}
