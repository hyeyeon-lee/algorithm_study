package chap02;

public class InitArray {
	// 구성 요소의 자료형이 int인 배열 (구성 요솟수는 5: new에 의해 본체를 생성)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5]; // 참조, 배열 선언

		a[1] = 45;
		a[2] = 51;
		a[4] = a[1] * 2;

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

}
