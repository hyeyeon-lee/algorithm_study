package codeup1;

import java.util.Arrays;
import java.util.Scanner;

public class Q1411 {
	// 1411 : 빠진 카드
	// 1411 : 빠진 카드
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n - 1];

		for (int i = 0; i < n - 1; i++)
			arr[i] = s.nextInt();

		Arrays.sort(arr);
		int lost = 0;

		for (int i = 1; i <= arr.length; i++)
			if (arr[i - 1] != i) {
				lost = i;
				break;
			}

		if (lost == 0) lost = n;

		System.out.println(lost);

	}

}