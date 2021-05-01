package backjoon;

import java.util.Scanner;

public class Q2739 {
	// 구구단
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 1; i <= 9; i++)
			System.out.printf("%d * %d = %d\n", n, i, n * i);
	}

}
