package chap05;

import java.util.Scanner;

import chap04.IntStack;

// 하노이의 탑
// 비재귀적으로 구현
public class Quest7 {

	// no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
	static void move(int no, int x, int y) { // 3, 1, 3

		IntStack n_stack = new IntStack(100);
		IntStack x_stack = new IntStack(100);
		IntStack y_stack = new IntStack(100);

		while (true) {
			if (no >= 1) {
				n_stack.push(no);
				no = no - 1;

				x_stack.push(x);

				y_stack.push(y);
				y = 6 - x - y;
				continue;
			}

			// move(no - 1, x, 6 - x - y);
			if (n_stack.isEmpty() != true) {
				no = n_stack.pop();
				x = x_stack.pop();
				y = y_stack.pop();

				System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");
				no = no - 1;
				x = 6 - x - y;
				continue;

			}

			// if (no > 1) move(no - 1, 6 - x - y, y);

		}
	}

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("하노이의 탑");
		System.out.println("원반 개수 : ");
		int n = stdIn.nextInt();

		move(n, 1, 3); // 1번 기둥의 n개 원반을 3번 기둥으로 옮기기
	}

}
