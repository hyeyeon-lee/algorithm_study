package backjoon;

import java.util.Scanner;

public class Q2839 {

	// 2839 설탕 배달
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt(); // 설탕 무게 입력
		int cnt = 0; // 봉지 개수

		while (true) {
			if (n == 4 || n == 7) {
				cnt = -1;
				break;
			}
			if (n % 5 == 0) cnt = n / 5;
			else if (n % 5 == 1 || n % 5 == 3) cnt = n / 5 + 1;
			else if (n % 5 == 2 || n % 5 == 4) cnt = n / 5 + 2;

			break;
		}

		System.out.print(cnt);
	}

}
