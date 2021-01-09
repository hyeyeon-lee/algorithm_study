package backjoon;

import java.util.Scanner;

public class Q2576 {
	// 홀수

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int sum = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 7; i++) {
			int num = s.nextInt();
			if (num % 2 == 1) {
				sum += num;
				if (min > num)
					min = num;
			}

		}
		if (sum == 0)
			System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
