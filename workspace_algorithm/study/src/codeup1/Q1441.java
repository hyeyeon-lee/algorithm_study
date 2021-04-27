package codeup1;

import java.util.Scanner;

public class Q1441 {
	// 1441 : 버블 정렬
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++)
			arr[i] = s.nextInt();

		for (int i = 0; i < num; i++)
			for (int j = 0; j < num - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		for (int i = 0; i < num; i++)
			System.out.println(arr[i]);
	}

}
