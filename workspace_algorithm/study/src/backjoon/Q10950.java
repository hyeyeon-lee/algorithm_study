package backjoon;

import java.util.Scanner;

public class Q10950 {
	// 10998 A+B - 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			arr[i] = a + b;
		}

		for (int i = 0; i < num; i++) {
			System.out.printf("%d\n", arr[i]);
		}
	}

}
