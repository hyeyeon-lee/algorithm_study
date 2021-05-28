package codeup1;

import java.util.Scanner;

public class Q1409 {
	// 1409 : 기억력 테스트 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++)
			arr[i] = s.nextInt();

		int k = s.nextInt();

		System.out.println(arr[k - 1]);

	}

}