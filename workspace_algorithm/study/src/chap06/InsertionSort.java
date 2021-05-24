package chap06;

import java.util.Scanner;

public class InsertionSort {
	// 단순 삽입 정렬

	static void insertsionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--)
				a[j] = a[j - i];
			a[j] = tmp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순 삽입 정렬");
	}

}
