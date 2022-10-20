package day01;

import java.util.Scanner;

public class Q10{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요.");
		int n = sc.nextInt();
		int ori_number = n;
		int cnt = 0; // 나누기 10을 반복한, 횟수를 구하는 변수
		while (n > 0) {
			n /= 10;
			cnt++;
		}
		System.out.println("입력한 숫자는 " + ori_number);
		System.out.println(cnt + "자리의 양의 정수");
	}

}
