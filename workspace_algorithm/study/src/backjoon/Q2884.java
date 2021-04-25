package backjoon;

import java.util.Scanner;

public class Q2884 {
	// 2884 알람 시계
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int h, m;
		h = s.nextInt();
		m = s.nextInt();

		m -= 45;

		if (m < 0) {
			h--;
			if (h < 0) h += 24;
			m += 60;
		}

		System.out.printf("%d %d", h, m);
	}

}
