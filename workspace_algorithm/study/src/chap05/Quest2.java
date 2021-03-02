package chap05;

import java.util.Scanner;

// 유클리드 호제법으로 최대공약수 구하기
// 재귀 사용하지 않기
public class Quest2 {

	// 정수 x, y의 최대 공약수를 구하여 반환
	static int gcd(int x, int y) {
		while (y != 0) {
			int n = x % y;
			x = y;
			y = n;
		}
		return (x); // ?
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요. : ");
		int x = stdIn.nextInt();
		System.out.println("정수를 입력하세요. : ");
		int y = stdIn.nextInt();

		System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");

	}

}
