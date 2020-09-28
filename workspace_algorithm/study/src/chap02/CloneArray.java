package chap02;

public class CloneArray {
	// 배열 복제

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a.clone();

		b[3] = 0;

		System.out.println("a = ");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("b = ");
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}

	}

}
