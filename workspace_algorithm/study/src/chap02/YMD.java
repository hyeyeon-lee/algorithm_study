package chap02;

// 서기 년월일을 필드로 갖는 클래스 만들기
// 생성자, AFTER, BEFORE 메소드 포함
public class YMD {

	int y; // 년
	int m; // 월(1~12)
	int d; // 일(1~31)

	public YMD(int y, int m, int d) {
		super();
		this.y = y;
		this.m = m;
		this.d = d;
	}

	public YMD after(int n) {
		return this;
	}

	public YMD before(int n) {
		return this;
	}

	@Override
	public String toString() {
		return this.y + "년" + this.m + "월" + this.d + "일";
	}

}