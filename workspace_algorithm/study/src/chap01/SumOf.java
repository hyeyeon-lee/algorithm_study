package chap01;

public class SumOf {

	static int sumof(int a, int b) {
		int sum = 0;

		int sm = a < b ? a : b;
		int lg = a < b ? b : a;

		for (int i = sm; i <= lg; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumof(3, 5));
		System.out.println(sumof(5, 3));
		System.out.println(sumof(6, 4));
		System.out.println(sumof(4, 6));
	}

}
