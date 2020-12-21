package chap03;

import java.util.Scanner;

// 이진 검색
public class Quest5 {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
	// 같은 요소가 있으면 맨 앞의 요소를 찾도록 함
	static int binSearchX(int[] a, int n, int key) {
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n - 1; // 검색 범위의 끝 인덱스

		do {
			int pc = (pl + pr) / 2; // 중앙 idx
			if (a[pc] == key) {
				while (pl < pc) {
					pc--;
					if (a[pc - 1] < key)
						break;
				}
				return pc; // 검색 완료
			} else if (a[pc] < key)
				pl = pc + 1; // 검색 범위가 뒤쪽으로 옮겨짐
			else
				pr = pc - 1; // 검색 범위를 앞쪽으로 옮김
		} while (pl <= pr);

		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);

		System.out.println("요솟수 :");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요솟수가 num인 배열

		System.out.println("오름차순으로 입력하세요.");

		System.out.println("x[0]:"); // 첫 요소 입력
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]);// 바로 앞의 요소보다 작으면 다시 입력 (0을 따로 입력 받는다)
		}

		System.out.println("검색할 값:"); // 키 값을 입력
		int ky = stdIn.nextInt();
		int idx = binSearchX(x, num, ky);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "는 x[" + idx + "]에 있습니다.");

	}

}
