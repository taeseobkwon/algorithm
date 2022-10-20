package day01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n값을 입력하세요.");
		double n = sc.nextDouble();
		System.out.println("1부터 n까지의 합은" + (1 + n) * (n / 2));

		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println("n까지의 합은" + (int) sum);

	}

}
