package day02;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch121 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String[] x = { "boolean", "byte", "char", "double", "floatint", "long", "short" };
		System.out.println("찾고 싶은 글자는?");
		String xkey = stdIn.next();

		int idx = Arrays.binarySearch(x, xkey);
		if (idx < 0)
			System.out.println("그값의 요소가 없습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다");

		double[] y = { 12.2, 13.3, 23.4, 55.7 };
		System.out.println("찾고 싶은 실수는?");
		double ykey = stdIn.nextDouble();

		idx = Arrays.binarySearch(y, ykey);
		if (idx < 0)
			System.out.println("그값의 요소가 없습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다");

	}

}
