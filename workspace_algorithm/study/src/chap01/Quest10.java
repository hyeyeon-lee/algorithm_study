package chap01;

import java.util.Scanner;

public class Quest10 {
	// Q10. a,b 입력 후 b-a 출력 (b가 a보다 작으면 다시 입력해야 함)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 0;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a의 값: ");
		int a = stdIn.nextInt();
		int b = 0;
		do {
			System.out.println("b의 값: ");
			b = stdIn.nextInt();
			if (b <= a)
				System.out.println("a보다 큰 값을 입력하세요!");

		} while (b <= a);

		/*
		 * while (true) {
			System.out.print("b의 값：");
			b = stdIn.nextInt();
			if (b > a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}*/

		result = b - a;
		System.out.println("b-a=" + result);
	}

}
