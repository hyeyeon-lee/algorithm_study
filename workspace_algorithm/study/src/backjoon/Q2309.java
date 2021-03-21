package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q2309 {
	// 2309: 일곱 난쟁이
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int[] arr = new int[9];
		int sum = 0;
		final int total = 100;
		int sub = 0;

		int not1 = 0;
		int not2 = 0;

		for (int i = 0; i < 9; i++) {
			arr[i] = s.nextInt();
			sum += arr[i];
		}

		if (sum > total) sub = sum - total;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == j) continue;
				if (arr[i] + arr[j] == sub) {
					not1 = arr[i];
					not2 = arr[j];
				}
			}
		}

		Arrays.sort(arr);
		for (int i = 0; i < 9; i++) {
			if (arr[i] == not1 || arr[i] == not2) continue;
			System.out.println(arr[i]);
		}

	}

}