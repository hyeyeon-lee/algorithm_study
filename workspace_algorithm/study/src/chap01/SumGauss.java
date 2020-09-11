package chap01;

import java.util.Scanner;

// Q8. 가우스의 덧셈으로 합 구하기
public class SumGauss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값:");
		int n = stdIn.nextInt();

		int sum = (1 + n) * n / 2;

		System.out.println(sum);
	}

}
