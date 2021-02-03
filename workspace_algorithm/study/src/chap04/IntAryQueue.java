package chap04;

import java.util.Arrays;
import java.util.Scanner;

// 큐 구현
public class IntAryQueue {

	private int max; // 큐의 용량
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체

	public IntAryQueue(int capacity) {
		max = capacity;
		num = 0;
		que = new int[max];
	}

	// 큐에 데이터를 넣음 (인큐)
	public int enque(int x) {
		que[num++] = x;
		return x;
	}

	// 큐에서 데이터를 뺌 (디큐)
	public int deque() {
		int x = que[0];
		for (int i = 0; i < num; i++)
			que[i] = que[i + 1];
		num--;
		return x;
	}

	@Override
	public String toString() {
		return "IntAryQueue [max=" + max + ", num=" + num + ", que=" + Arrays.toString(que) + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);

		// 큐의 용량 정하기
		int num = stdIn.nextInt();
		IntAryQueue queue = new IntAryQueue(num);

		System.out.println(queue.toString());

		boolean exit = false;

		while (!exit) {
			System.out.println("1.인큐 2.디큐 3.종료: ");
			int mode = stdIn.nextInt();
			switch (mode) {
			case 1:
				System.out.println("넣을 데이터 입력: ");
				int x = stdIn.nextInt();
				queue.enque(x);
				System.out.println(queue.toString());
				break;
			case 2:
				System.out.println("디큐");
				queue.deque();
				System.out.println(queue.toString());
				break;
			case 3:
				exit = true;
				break;
			default:
				break;
			}
		}

	}

}
