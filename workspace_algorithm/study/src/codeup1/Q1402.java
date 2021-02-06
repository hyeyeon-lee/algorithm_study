package codeup1;

import java.util.Scanner;

public class Q1402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		for (int i = arr.length - 1; i >= 0; i--)
			System.out.printf("%d ", arr[i]);
	}

}
