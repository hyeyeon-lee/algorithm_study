package chap04;

import java.util.Scanner;

// int형 스택의 사용 예
// intStack 모든 메소드 사용

public class Quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		IntStack s = new IntStack(64);

		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.println("(1) 푸시 (2) 팝 (3) 피크  (4) 덤프 (5) 검색 (6) 초기화 (0) 종료 : ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // 푸시
				System.out.println("데이터 : ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2: // 팝
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 4:
				s.dump(); // 덤프
				break;
			case 5:
				System.out.println("검색할 데이터: ");
				int search = stdIn.nextInt();
				int idx = s.indexOf(search); // 정상부터 검색
				if (idx >= 0)
					System.out.println("검색한 데이터 " + search + "는 " + idx + "에 있습니다.");
				else
					System.out.println("존재하지 않는 데이터입니다.");
				break;
			case 6:
				s.clear(); // 초기화
				System.out.println("초기화 완료되었습니다.");
				break;

			}
		}
	}

}
