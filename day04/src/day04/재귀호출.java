package day04;

// 재귀호출 - 함수가 자기자신을 호출한다.
// 규칙 - 계속해서 호출은 할 수 있지만 언젠가는 끝나야 한다.
//     - 속도는 느리고 메모리를 많이 사용하는 단점
//     - 스택공간 저장
// 5! = 5 * 4 * 3 * 2 * 1
public class 재귀호출 {

	public static void main(String[] args) {
		Recursive rs = new Recursive();
		rs.display(10);
		System.out.println("-------------------");
		rs.display2(10);
		System.out.println("-------------------");
		System.out.println(rs.factorial(5));
		System.out.println("유클리드 호재법 - 최대 공약수");
		// 1. 큰 수에서 작은 수로 나눈다.
		// 2. 나머지가 0이면 나누는 수가 최대 공약수이다.
		// 3. 나머지가 0이 아니면 작은수 / 나머지
		System.out.println(rs.gcd(22, 8));
	}

}

class Recursive {
	public void display(int limit) {
		if (limit == 0)
			return;
		System.out.println(limit);
		display(limit - 1);
	}

	public void display2(int limit) {
		if (limit == 0)
			return;
		display2(limit - 1);
		System.out.println(limit);
	}
	// 재귀함수
	public int factorial(int limit) {
		if(limit == 1) return 1;
		else return limit * factorial( limit - 1);
	}
	// 유클리스호제법을 이용하여 최대공약수 구하기
	public int gcd(int x, int y) {
		if(y == 0) return x;
		else
			return gcd(y, x % y);
	}
}