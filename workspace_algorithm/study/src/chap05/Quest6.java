package chap05;

import java.util.Scanner;

// 하노이의 탑
// 기둥으로 출력하기
public class Quest6 {

	static String[] arr = { "A", "B", "C" };

	// no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
	static void move(int no, int x, int y) {
		if (no > 1) move(no - 1, x, 6 - x - y);

		System.out.println("원반[" + no + "]을 " + arr[x - 1] + "기둥에서 " + arr[y - 1] + "기둥으로 옮김");

		if (no > 1) move(no - 1, 6 - x - y, y);
	}

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("하노이의 탑");
		System.out.println("원반 개수 : ");
		int n = stdIn.nextInt();

		move(n, 1, 3); // 1번 기둥의 n개 원반을 3번 기둥으로 옮기기
	}

}
