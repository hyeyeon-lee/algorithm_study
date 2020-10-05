package chap02;

import java.util.Scanner;

public class Quest5 {
	// 배열 b의 모든 요소를 배열 a에 역순으로 복사
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("배열 b의 요소 개수: ");
		int num = stdIn.nextInt();

		int[] a = new int[num];
		int[] b = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("b[" + i + "]: ");
			b[i] = stdIn.nextInt();
		}

		rcopy(a, b);
		for (int i = 0; i < num; i++)
			System.out.println(b[i]);
		System.out.println("a");
		for (int i = 0; i < num; i++)
			System.out.println(a[i]);
	}

	static void rcopy(int[] a, int[] b) {
		/*int num = a.length <= b.length ? a.length : b.length;*/
		for (int i = 0; i < b.length; i++)
			a[i] = b[b.length - i - 1];
	}
}
