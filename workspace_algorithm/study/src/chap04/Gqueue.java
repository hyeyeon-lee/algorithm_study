package chap04;

public class Gqueue<E> {
	private int max; // 큐의 용량
	private int num; // 현재 데이터 수
	private int front; // 프론트 요소 커서
	private int rear; // 리어 요소 커서
	private E[] que; // 큐의 본체

	// 큐가 비어 있을 때
	public static class EmptyGqueueException extends RuntimeException {
		public EmptyGqueueException() {
		}
	}

	// 큐가 가득 차 있을 때
	public static class OverflowGqueueException extends RuntimeException {
		public OverflowGqueueException() {
		}
	}

	// 생성자
	public Gqueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = (E[]) new Object[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	// 큐에 데이터를 인큐
	public E enque(E x) throws OverflowGqueueException {
		if (num >= max) throw new OverflowGqueueException();
		que[rear++] = x;
		num++;
		if (rear == max) rear = 0;
		return x;
	}

	// 큐에 데이터를 디큐
	public E deque() throws EmptyGqueueException {
		if (num <= 0) throw new EmptyGqueueException();
		E x = que[front++];
		num--;
		if (front == max) front = 0;
		return x;
	}

	// 큐에서 데이터를 피크 (프론트 데이터를 들여다 봄)
	// 디큐할 데이터 훔쳐 보기
	public E peek() throws EmptyGqueueException {
		if (num <= 0) throw new EmptyGqueueException();
		return que[front];
	}

	// 큐에서 x를 검색하여 인덱스를 반환 (찾지 못하면 -1 반환)
	public int indexOf(E x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x) return idx;
		}
		return -1;
	}

	// 큐를 비움
	// 실제 배열 요소값을 비우진 않음
	public void clear() {
		num = front = rear = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}

	// 큐가 비어 있나요?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 찼나요?
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
	public void dump() {
		if (num <= 0) System.out.println("큐가 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}

}
