package day02;

// 선형 검색(보초법)
import java.util.Scanner;

class 보초에제 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1]; // 1. 보초알고리즘은 제일 마지막에 키값을 넣어 주어야 하니까 1열 더 크게

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		int idx = 보초메서드(x, num, ky);
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
	}
		private static int 보초메서드(int[] x, int num, int key) {
			int i=0;
			x[num] = key; // 2. 찾을 값을 마지막 열에 넣어 준다
			while(true) {
				if(x[i]==key) break;
				i++;
			}
			return i == num ? -1 : i;
	}

}
