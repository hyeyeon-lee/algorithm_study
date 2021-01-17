package codeup1;

import java.util.Random;
import java.util.Scanner;

public class Q1261 {
	// 1261 : First Special Judge (Test)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] arr = new int[10];
		int idx = 0;

		for (int i = 0; i < arr.length; i++) {
			int num = s.nextInt();
			if (num % 5 == 0)
				arr[idx++] = num;
		}

		Random random = new Random();

		if (idx != 0)
			System.out.println(arr[random.nextInt(idx)]);
		else
			System.out.println("0");
	}
}
