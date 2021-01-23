package chap04;

public class Gstack<E> {
	// 제네릭 스택

	private int max; // 스택 용량
	private int ptr; // 스택 포인터
	private E[] stk; // 스택 본체

	// 실행 시 예외: 스택이 비어 있음
	public static class EmptyGstackStackException extends RuntimeException {
		public EmptyGstackStackException() {
		}
	}

	// 실행 시 예외: 스택이 가득 참
	public static class OverflowGstackStackException extends RuntimeException {
		public OverflowGstackStackException() {
		}
	}

	// 생성자
	public Gstack(int capacity) {
		ptr = 0; // 0~max
		max = capacity;
		try {
			stk = (E[]) new Object[max]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}

	}

	// 스택에 x를 푸시
	public E push(E x) throws OverflowGstackStackException {
		if (ptr == max) // 스택이 가득 참
			throw new OverflowGstackStackException();
		return stk[ptr++] = x; // 푸시된 x(stk[ptr]) 반환
	}

	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public E pop() throws EmptyGstackStackException {
		if (ptr <= 0)
			throw new EmptyGstackStackException();
		return stk[--ptr];
	}

	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public E peek() throws EmptyGstackStackException {
		if (ptr <= 0) // 스택이 비어있음
			throw new EmptyGstackStackException();
		return stk[ptr - 1];
	}

	// 스택에서 x와 같은 값의 데이터가 있는지 꼭대기부터 바닥으로 선형 검사
	public int indexOf(E x) {
		for (int i = ptr - 1; i >= 0; i--) // 정상쪽에서 선형 검색
			if (stk[i] == x)
				return i; // 검색 성공
		return -1; // 검색 실패
	}

	// 스택의 모든 요소를 삭제, 비우기
	public void clear() {
		ptr = 0;
	}

	// 스택의 용량을 확인, 반환, max 값
	public int capacity() {
		return max;
	}

	// 스택에 쌓여 있는 데이터 수를 반환
	public int size() {
		return ptr;
	}

	// 스택이 비어있는지 검사
	// 비었으면 true, 아니면 false
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// 스택이 가득 차 있는지 검사
	// 가득 찼으면 true, 아니면 false
	public boolean isFull() {
		return ptr >= max;
	}

	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
		System.out.println();
	}


}
