package backjoon;

import java.util.Scanner;

public class Q11047 {

	// 11047 동전 0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt(); // 총 화폐 종류
		int k = stdIn.nextInt(); // 가치
		int cnt = 0; // 동전 개수

		int[] arr = new int[n]; // 화페 배열 생성
		for (int i = 0; i < n; i++) // 화폐 배열 입력 (오름차순)
			arr[i] = stdIn.nextInt();

		stdIn.close();

		for (int i = n - 1; i >= 0; i--) { // 필요한 동전 개수의 최솟값
			cnt += k / arr[i];
			k %= arr[i];
		}

		System.out.println(cnt);

	}

}
