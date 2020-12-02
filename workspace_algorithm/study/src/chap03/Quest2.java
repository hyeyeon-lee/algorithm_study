package chap03;

import java.util.Scanner;

// 선형 검색
public class Quest2 {

	// 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
	static int seqSearchSen(int[] a, int n, int key) {
		// td
		System.out.printf("  | ");
		for (int j = 0; j < a.length; j++) {
			System.out.printf("%d ", j);
		}
		System.out.println();
		System.out.println("---------------- ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("  | ");
			for(int k = 0; k < i; k++) System.out.print("  ");
			System.out.println("*");
			System.out.print(i + " | ");
			for (int j = 0; j < a.length; j++) {
				System.out.printf("%d ", a[j]);
			}
			System.out.println("");
			if (a[i] == key)
				return i;
		}
		System.out.println("");
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요솟수가 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}

		System.out.print("검색할 값:"); // 키 값을 입력
		int ky = stdIn.nextInt();

		int idx = seqSearchSen(x, num, ky); // 배열 x에서 키값이 ky인 요소 검색

		if (idx == -1)
			System.out.println("해당하는 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다. ");
	}

}
