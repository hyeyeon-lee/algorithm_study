package codeup1;

import java.util.Scanner;

public class Q1403 {
	// 1403 : 배열 두번 출력하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++)
			arr[i] = s.nextInt();

		for (int i = 0; i < num; i++)
			System.out.println(arr[i]);
		for (int i = 0; i < num; i++)
			System.out.println(arr[i]);

	}

}
