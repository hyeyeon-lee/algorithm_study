package backjoon;

import java.util.Scanner;

public class Q2839 {

	// 2839 설탕 배달
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt(); // 설탕 무게 입력
		int cnt = 0; // 봉지 개수

		cnt += n / 5;
		n %= 5;

		/*
		 * if (n != 0 && cnt != 0 && (n + 5) % 3 == 0) { // 무게가 남았다면 5kg 하나 해체
		 * cnt--; n += 5; }
		 */
		cnt += n / 3;
		n %= 3;

		if (n != 0) cnt = -1;

		System.out.println(cnt);
	}

}
