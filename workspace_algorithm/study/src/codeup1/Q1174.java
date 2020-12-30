package codeup1;

import java.util.Scanner;

public class Q1174 {
	// 1174 : 30분전 (if는 아직...)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int h = s.nextInt();
		int m = s.nextInt();
		int t = 0;

		// 시+분을 분으로 변환
		// 1h 10m -> 70m
		// 23h 53m -> 1433m
		// 0h 25m -> 25m
		t = h * 60 + m;

		// 30분 전 계산을 위한 감산
		// 70m - 30m = 40m
		// 1433m - 30m = 1403m
		// 25m - 30m = -5m
		t -= 30;

		// 분이 30 미만인 경우 음수값 처리를 위함
		// 40m + 1440m(total) = 1480m
		// 1403m + 1440m(total) = 2843m
		// -5m + 1440m(total) = 1435m
		t += 24 * 60;

		// 30분 전 계산을 위한 감산값과 같음, 예외: 30분 미만
		// 1480m % 1440m = 40m
		// 2843m % 1440m = 1403m
		// 1435m % 1440m = 1435m -- 예외
		t %= (24 * 60);


		// 40 / 60 = 0
		// 1403 / 60 = 23
		// 1435 / 60 = 23
		h = t / 60;

		// 40 % 60 = 40
		// 1403 % 60 = 23
		// 1435 % 60 = 55
		m = t % 60;

		System.out.printf("%d %d", h, m);

	}
}
