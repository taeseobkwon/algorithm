package day01;

import java.util.Iterator;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 1.배열이란
		int[] aa = new int[10];
		String[][] b = new String[2][3];
		b[0][0] = "a";
		b[0][1] = "b";
		b[0][2] = "c";
		b[1][0] = "d";
		b[1][1] = "e";
		b[1][2] = "f";

		// 1차원 데이터 입력하고 출력하기
		int[] alpha = new int[11];
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = 100 * i + 100;
			System.out.println("alpha[" + i + "]=" + alpha[i] + "");
		}
		System.out.println();
		// 향상된 for문으로 출력하기
		for (int n : alpha) {
			System.out.println(n + "이곳을 찍어보자!! \t");
		}

		// 2차원 배열에 데이터 입력하고 출력하기
		int[][] beta = new int[2][3];
		int num = 100;
		int[] sum = new int[2];

		for (int i = 0; i < beta.length; i++) {
			for (int j = 0; j < beta[i].length; j++) {
				beta[i][j] = num;
				sum[i] += beta[i][j];
				num -= 5;
			}
		}
		for (int i = 0; i < beta.length; i++) {
			for (int j = 0; j < beta[i].length; j++) {
				System.out.print(beta[i][j] + "\t");
			}
			System.out.print(sum[i]);
			System.out.println();

		}
		System.out.println("----------------");
		// 향상된 for문
		for (int[] bb : beta) {
			for (int bbb : bb) {
				System.out.println(bbb);
			}
			for (int sumsum : sum)
				System.out.println(sumsum);
		}
//		beta[0][0] = 100;
//		beta[0][1] = 95;
//		beta[0][2] = 90;
//		beta[1][0] = 85;
//		beta[1][1] = 80;
//		beta[1][2] = 75;
//
//		System.out.print(beta[0][0] + "\t");
//		System.out.print(beta[0][1] + "\t");
//		System.out.print(beta[0][2] + "\t");
//		System.out.println(beta[0][0] + beta[0][1] + beta[0][2]);
//		System.out.print(beta[1][0] + "\t");
//		System.out.print(beta[1][1] + "\t");
//		System.out.print(beta[1][2] + "\t");
//		System.out.println(beta[1][0] + beta[1][1] + beta[1][2]);

		// 3차원 배열에 데이터 입력하고 출력하기
		String[][][] gamma = { { { "a", "b" }, { "c", "d" }, { "e", "f" } },
				{ { "g", "h" }, { "i", "j" }, { "k", "l" } } };
		// for문 첨자문을 이용해서 찍기
		// 면, 행, 열의 개수 찍기
		System.out.println("면의 개수 " + gamma.length);
		System.out.println("행의 개수 " + gamma[0].length);
		System.out.println("열의 개수 " + gamma[0][0].length);

		for (int i = 0; i < gamma.length; i++) {
			for (int j = 0; j < gamma[i].length; j++) {
				for (int k = 0; k < gamma[i][j].length; k++) {
					System.out.print(gamma[i][j][k] + "\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		// 향상된 for문으로 찍기
		for(String[][] cc : gamma) {
			for(String[] ccc : cc) {
				for(String cccc : ccc) {
					System.out.print(cccc + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}

}
