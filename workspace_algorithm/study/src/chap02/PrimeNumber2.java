package chap02;

public class PrimeNumber2 {
	// 1000 이하의 소수 열거 (버전: 2)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0; // 횟수저장
		int ptr = 0; // 찾은 소수의 개수
		int[] prime = new int[500]; // 소수를 저장하는 배열

		prime[ptr++] = 2; // 2는 소수

		for (int n = 3; n <= 1000; n += 2) { // 홀수만
			int i;
			for (i = 1; i < ptr; i++) { // 이미 찾은 소수로 나누기
				counter++;
				if (n % prime[i] == 0) // 나누어 떨어진다
					break; // == 소수가 아니다, 반복 중지
			}

			if (ptr == i) // 마지막까지 나누어 떨어지지 않는다면
				prime[ptr++] = n; // 소수 배열에 저장

		}

		for (int i = 0; i < ptr; i++)
			System.out.println(prime[i]);
		System.out.println("나눗셈을 수행한 횟수 " + counter);
	}

}
