package backjoon;

import java.util.Scanner;

public class Q2562 {
	// Q2562 : 최댓값
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int idx = -1;
		for (int i = 0; i < 9; i++) {
			int n = s.nextInt();
			if (n > max) {
				max = n;
				idx = i;
			}
		}
		System.out.printf("%d\n", max);
		System.out.printf("%d", idx + 1);
	}

}
