package chap01;

import java.util.Scanner;

// 1, 2, n의 합을 구합니다.

public class SumFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값:");
		int n = stdIn.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			// Q7. 출력 내용 변경하기
			if (i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i + " = ");
			sum += i;
		}
		System.out.print(sum);
		System.out.println();
		System.out.println("1부터 " + n + "까지의 합은 " + sum);
	}

}
