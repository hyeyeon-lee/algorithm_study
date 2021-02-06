package chap04;

import java.util.Arrays;
import java.util.Scanner;

// 큐 구현
public class IntAryQueue {

	private int max; // 큐의 용량
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체

	// 큐가 비었을 때
	public class EmptyIntAryQueueException extends RuntimeException {
		public EmptyIntAryQueueException() {

		}
	}

	// 큐가 가득 찼을 때
	public class OverflowIntAryQueueException extends RuntimeException {
		public OverflowIntAryQueueException() {

		}
	}

	// 생성자
	public IntAryQueue(int capacity) {
		max = capacity;
		num = 0;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	// 큐에 데이터를 넣음 (인큐)
	public int enque(int x) throws OverflowIntAryQueueException {
		if (num >= max)
			throw new OverflowIntAryQueueException();
		que[num++] = x;
		return x;
	}

	// 큐에서 데이터를 뺌 (디큐)
	public int deque() throws EmptyIntAryQueueException {
		if (num <= 0)
			throw new EmptyIntAryQueueException();
		int x = que[0];
		for (int i = 0; i < num; i++)
			que[i] = que[i + 1];
		num--;
		return x;
	}

	// 큐에서 데이터 피크 (큐에서 가장 위에 있는 항목 반환)
	public int peek() throws EmptyIntAryQueueException {
		if (num <= 0)
			throw new EmptyIntAryQueueException();
		return que[num - 1];
	}

	// 큐에서 데이터 찾기 (없으면 -1)
	public int indexOf(int x) {
		for (int i = 0; i < num; i++)
			if (que[i] == x)
				return i;
		return -1;
	}

	// 큐를 비움
	public void clear() {
		num = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 있는 데이터 수 반환
	public int size() {
		return num;
	}

	// 큐가 비어 있는지?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 차 있는지?
	public boolean isFull() {
		return num >= max;
	}

	// 큐에서 데이터를 앞 -> 뒤 순서로 출력
	public void dump() {
		if (num == 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.println(que[i] + " ");
			System.out.println();
		}
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
