package codeup1;

import java.util.Scanner;

public class Q1405 {
	// 1405 : 숫자 로테이션
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++)
			arr[i] = s.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++)
				System.out.printf("%d ", arr[(j + i) % num]);
			System.out.println();
		}
	}
}
