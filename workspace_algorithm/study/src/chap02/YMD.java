package chap02;

import java.util.Scanner;

// 서기 년월일을 필드로 갖는 클래스 만들기
// 생성자, AFTER, BEFORE 메소드 포함
public class YMD {

	int y; // 년
	int m; // 월(1~12)
	int d; // 일(1~31)

	// 각 달의 일수
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
	};

	// 서기 year년은 윤년인가? (윤년：1／평년：0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// 생성자(주어진 날짜로 설정)
	YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}

	// n일 뒤의 날짜를 반환
	YMD after(int n) {
		YMD ymd = new YMD(this.y, this.m, this.d);
		// todo
		return ymd;
	}

	// n일 앞의 날짜를 반환
	YMD before(int n) {
		YMD ymd = new YMD(this.y, this.m, this.d);
		// todo
		return ymd;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("날짜를 입력하세요.");
		System.out.println("년: ");
		int y = s.nextInt();
		System.out.println("월: ");
		int m = s.nextInt();
		System.out.println("일: ");
		int d = s.nextInt();

		YMD ymd = new YMD(y, m, d);
		System.out.println("며칠: ");

		int n = s.nextInt();
		YMD afterYMD = ymd.after(n);
		System.out.printf("%d-%d-%d\n", afterYMD.y, afterYMD.m, afterYMD.d);
		YMD beforeYMD = ymd.before(n);
		System.out.printf("%d-%d-%d\n", beforeYMD.y, beforeYMD.m, beforeYMD.d);
	}

}