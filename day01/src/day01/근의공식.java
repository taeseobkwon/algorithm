package day01;

import java.util.Scanner;

public class 근의공식 {

	public static void main(String[] args) {
		
		double x1,x2;
		Scanner sc = new Scanner(System.in);
		System.out.print("a값을 입력하세요.");
		int a = sc.nextInt();
		
		System.out.print("b값을 입력하세요.");
		int b = sc.nextInt();
		
		System.out.print("c값을 입력하세요.");
		int c = sc.nextInt();		
		
		x1 = -b + Math.sqrt(Math.abs(b*b - 4*a*c)) / (2*a);
		x2 = -b - Math.sqrt(Math.abs(b*b - 4*a*c)) / (2*a);
		
		System.out.println("x1의 값은 " + x1);
		System.out.println("x2의 값은 " + x2);
	
		
	}

}
