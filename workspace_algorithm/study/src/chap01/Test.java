package chap01;

public class Test {

	// Q1. �� ���� �ִ��� ���ϴ� ����
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;

		return max;
	}

	// Q2. �� ���� �ּڰ��� ���ϴ� ����
	static int min3(int a, int b, int c) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}

	// Q3. �� ���� �ּڰ��� ���ϴ� ����
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		if (min > d)
			min = d;
		return min;
	}

	// Q4. �� ���� ��� ���� 13������ ��� ���տ� ���� �߾Ӱ� ����ϴ� ����
	static int med13(int a, int b, int c) {
		if (a >= b) {
			if (a > b) {
				if (b >= c) {
					if (b > c)
						return b;
					else
						return b;
				} else {
					if (a >= c) {
						if (a > c)
							return c;
						else
							return c;
					} else
						return a;
				}
			} else {
				if (b >= c) {
					if (b > c)
						return b;
					else
						return a;
				} else
					return a;
			}
		} else {
			if (a >= c) {
				if (a > c)
					return a;
				else
					return a;
			} else {
				if (b >= c) {
					if (b > c)
						return c;
					else
						return c;
				} else
					return b;
			}
		}
	}

	// Q5. ������ �߾Ӱ��� Median.med3 ���� ȿ���� �������� ������?
	// a. ������ �ʹ� �����ؼ�
	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---max4---");
		System.out.println("max4(3, 2, 1, 9) = " + max4(3, 2, 1, 9));
		System.out.println("max4(8, 8, 8, 8) = " + max4(8, 8, 8, 8));
		System.out.println("max4(4, 1, 90, 800) = " + max4(4, 1, 90, 800));

		System.out.println("---min3---");
		System.out.println("min3(3, 2, 1) = " + min3(3, 2, 1));
		System.out.println("min3(1, 2, 13) = " + min3(1, 2, 13));

		System.out.println("---min4---");
		System.out.println("min4(3, 2, 1, 80) = " + min4(3, 2, 1, 80));
		System.out.println("min4(1, 2, 13, 0) = " + min4(1, 2, 13, 0));

		System.out.println("---med13---");
		System.out.println("med13(3, 2, 1) = " + med13(3, 2, 1));
		System.out.println("med13(100 ,80, 90) = " + med13(100, 80, 90));
	}

}
