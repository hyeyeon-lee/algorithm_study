package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q2587 {
	// 대표값2

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int sum = 0;

		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = s.nextInt();
			sum += arr[i];
		}

		System.out.println(sum / 5);
		Arrays.sort(arr);
		System.out.println(arr[2]);

	}

}
