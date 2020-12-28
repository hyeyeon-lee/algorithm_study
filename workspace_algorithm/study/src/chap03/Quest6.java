package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Quest6 {
	// Arrays.binarySearch로 이진 검색
	// 검색 실패 시 삽입포인트 값 출력

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);

		System.out.println("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요솟수가 num인 배열 생성

		System.out.println("오름차순으로 입력하세요.");

		System.out.println("x[0]: "); // 배열의 첫 요소 먼저 입력:
		// 다음 수보다 작아야 하기 때문에 먼저 입력
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.println("검색할 값: ");
		int key = stdIn.nextInt();

		int idx = Arrays.binarySearch(x, key);
		// 배열 x에서 key 검색
		// 일치하는 요소가 여러개라면 무작위의 인덱스 반환

		if (idx < 0)
			System.out.println("삽입 포인트 값: " + idx);
		else
			System.out.println(key + "은 x[" + idx + "]에 있습니다.");
	}

}
