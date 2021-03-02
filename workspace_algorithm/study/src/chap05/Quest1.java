package chap05;

import java.util.Scanner;

// 팩토리얼을 구현
// 재귀 사용하지 않기
public class Quest1 {

	// 양의 정수 n의 팩토리얼을 반환합니다.
	static int factorial(int n) {
		int result = 1;
		while (n > 1) // 1일 때도 반복문을 거칠 필요가 없음
			result *= n--;
		return result;

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요. : ");
		int x = stdIn.nextInt();

		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}

}
