package chap03;

import java.util.Comparator;
// 클래스 X의 내부에서 comparator를 정의하는 방법은 다음과 같습니다.
// 실행되지 않는 예제, 클래스 구현 방법

class X {
	// 필드, 메서드 등
	public static final Comparator<T> COMPARATOR = new Comp();

	private static class Comp implements Comparator<T> {
		public int compare(T d1, T d2) {
			// d1이 d2 보다 크면 양의 값 반환
			// d1이 d2 보다 작으면 음의 값 반환
			// d1이 d2와 같으면 0 반환

		}
	}

}