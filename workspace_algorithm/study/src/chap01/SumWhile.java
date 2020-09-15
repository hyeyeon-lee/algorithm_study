package chap01;

import java.util.Scanner;

// 1, 2, n까지의 합을 구합니다.
public class SumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값:");
		int n = stdIn.nextInt();

		int sum = 0;
		int i = 1;

		while (i <= n) { // i가 n이하면 반복
			sum += i; // sum = sum + i
			i++; // i 1증가
		}
		// Q6. 최종 i의 값이 n+1
		System.out.println(i);
		System.out.println("1부터 " + n + "까지의 합은 " + sum);
	}

}
