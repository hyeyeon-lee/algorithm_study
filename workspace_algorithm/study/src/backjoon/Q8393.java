package backjoon;

import java.util.Scanner;

public class Q8393 {

	// 8393 합
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++)
			sum += i;

		System.out.println(sum);

	}

}
