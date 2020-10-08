package chap02;

public class PrimeNumber1 {
	// 1000 이하의 소수 열거 (배열을 사용하지 않는 버전: 1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0; // 횟수저장

		for (int n = 2; n <= 1000; n++) {
			int i;
			for (i = 2; i < n; i++) {
				counter++;
				if (n % i == 0) // 나누어 떨어진다
					break; // == 소수가 아니다, 반복 중지
			}

			if (n == i) // 마지막까지 나누어 떨어지지 않는다면
				System.out.println(n);
		}

		System.out.println("나눗셈을 수행한 횟수 " + counter);
	}

}
