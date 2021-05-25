package codeup1;

import java.util.Scanner;

public class Q1442 {
	// 1442 : 선택 정렬
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // 입력받을 개수

		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();

		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min]) min = j;
			swap(arr, i, min);
		}

		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
