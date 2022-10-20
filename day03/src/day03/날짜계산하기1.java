package day03;

// 비즈니스 클래스
public class 날짜계산하기1 {

	public static void main(String[] args) {
		// 2022년 10월 14일은 2022년 1월 1일부터 며칠째인지 출력하는 프로그램 작성하기
		// 1. 1월 + ... + 9월 + 14 =
		// 2. 2월 윤년 29일

		DayOfYear dy = new DayOfYear();
		System.out.println("올해 1월 1일부터의 날짜는 " + dy.calc(2022, 10, 14));

	}

}

// 날짜 계산하는 클래스
class DayOfYear {

	public int calc(int year, int month, int day) {
		// 1. 1월 ~ 9월까지 마지막열을 누적해서 더한다
		int[] lastday = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 2. 윤년인지 판단하기
		if (isLeap(year))
			lastday[2] = 29;
		int result = 0; // 누적변수
		for (int i = 1; i < month; i++) {
			result += lastday[i];
		}
		result += day;
		return result;

	}
	// 윤년을 계산하는 메서드

	private boolean isLeap(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return true;
		return false;
	}
}