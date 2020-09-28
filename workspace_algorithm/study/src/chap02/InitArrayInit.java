package chap02;

public class InitArrayInit {
	// 구성 요소의 자료형이 int인 배열 (구성 요솟수는 5: 배열 초기자에 의해 생성)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5 }; // 초기화

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

}
