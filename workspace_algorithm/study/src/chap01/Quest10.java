package chap01;

import java.util.Scanner;

public class Quest10 {

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

		result = b - a;
		System.out.println("b-a=" + result);
	}

}
