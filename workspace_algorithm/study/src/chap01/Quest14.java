package chap01;

import java.util.Scanner;

public class Quest14 {
	// 입력한 수를 한 변으로 하는 정사각형 * 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		System.out.println("사각형을 출력합니다.");
		System.out.println("단수: " + a);
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
