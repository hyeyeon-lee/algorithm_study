package backjoon;

import java.util.Scanner;

public class Q15552 {

	// 15552 빠른 A+B
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		int t = stdIn.nextInt(); // 총 테스트케이스

		for (int i = 0; i < t; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			System.out.println(a + b);
		}

	}

}
