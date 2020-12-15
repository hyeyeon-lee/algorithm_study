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

		System.out.printf("%3s|", "");
		for (int i = 0; i < num; i++) {
			System.out.printf("%2d", i);
		}
		System.out.println("");
		System.out.print("---+");
		for (int i = 0; i < num * 2; i++) {
			System.out.print("-");
		}
		System.out.print("--\n");

		int idx = binSearch(num, arr, key);
		if (idx < 0)
			System.out.println("해당 요소가 없습니다.");
		else
			System.out.println(key + "는 x[" + idx + "]에 있습니다.");

	}

	static int binSearch(int n, int[] arr, int k) {

		int pl = 0;
		int pr = n - 1;

		do {
			int pc = (pl + pr) / 2;
			if (k < arr[pc])
				pr = pc - 1;
			else if (k > arr[pc])
				pl = pc + 1;

			else
				return pc;
		} while (pl <= pr);

		return -1;
	}
}
