package chap04;

import java.util.Scanner;

// 원하는 개수만큼 값을 입력 받아 요솟수가 N인 배열에 마지막 N개를 저장
// 오래된 데이터 버리기
// 무제한 인큐, but 최근 입력 N개만 남음
public class LastNElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N]; // 입력 받은 값을 저장
		int cnt = 0; // 입력 받은 개수
		int retry; // 다시 할지 여부

		System.out.println("정수를 입력하세요.");

		do {
			System.out.printf("%d번째 정수 : ", cnt + 1);
			a[cnt++ % N] = stdIn.nextInt();

			System.out.println("계속 할까요? (1.예/0.아니오)");
			retry = stdIn.nextInt();
		} while (retry == 1);

		int i = cnt - N;
		if (i < 0) i = 0;

		for (; i < cnt; i++)
			System.out.printf("%2d번째의 정수 = %d\n", i + 1, a[i % N]);

	}

}
