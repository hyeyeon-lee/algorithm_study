package backjoon;

import java.util.Scanner;

public class Q2490 {
	// 윷놀이
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String[] arr = new String[3];

		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			for (int j = 0; j < 4; j++) {
				// 1: 등, 0: 배
				cnt += s.nextInt();
			}
			switch (cnt) {
			case 0: // 윷
				System.out.println("D");
				break;
			case 1: // 걸
				System.out.println("C");
				break;
			case 2: // 개
				System.out.println("B");
				break;
			case 3: // 도
				System.out.println("A");
				break;
			case 4: // 모
				System.out.println("E");
				break;
			default:
				break;
			}

		}

	}

}
