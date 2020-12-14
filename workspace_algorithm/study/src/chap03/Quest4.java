package chap03;

import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int num = s.nextInt(); // 배열크기
		int[] arr = new int[num]; // 배열 생성

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]: ");
			arr[i] = s.nextInt();
		}

		int key = s.nextInt();
		binSearch(num, arr, key);
	}

	static int binSearch(int n, int[] arr, int k) {

		int pc = n / 2;
		int pl = 0;
		int pr = n;

		for (int i = 0; i < n; i++) {

		}

		return -1;
	}
}
