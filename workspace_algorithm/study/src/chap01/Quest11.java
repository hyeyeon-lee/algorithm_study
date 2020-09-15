package chap01;

import java.util.Scanner;

public class Quest11 {
	// Q11. 양의 정수를 입력해서 자릿수 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		// String num = s.nextLine();
		// System.out.println("그 수는 " + num.length() + "자리입니다.");

		// 좋은 정답
		int n;
		do {
			System.out.println("정수값: ");
			n = s.nextInt();
		} while (n <= 0);

		int no = 0; // 자릿수
		while (n > 0) {
			n /= 10; // n
			no++;
		}
		System.out.println("그 수는 " + no + "자리입니다.");

	}

}
