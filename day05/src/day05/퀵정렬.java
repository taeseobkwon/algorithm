package day05;

public class 퀵정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 1, 8, 7, 4, 5, 2, 6, 3, 9 };
		int nx = x.length;

		partition(x, x.length);
		quickSort(x, 0, nx - 1); // 재귀호출을 활용한 퀵정렬
//		System.out.println();
//		System.out.println("퀵정렬 했습니다");
//		for (int a : x) {
//			System.out.printf("%3d", a);
//		}
		quickSort2(x, 0, nx-1); // 비재귀적인 퀵정렬구하기
	}

	private static void quickSort2(int[] x, int left, int right) {
		// TODO Auto-generated method stub
		IntStack lstack = new IntStack(right-left+1);
		IntStack rstack = new IntStack(right-left+1);
		lstack.push(left);
		rstack.push(right);
		while(lstack.isEmpty() != true) {
			int pl = left=lstack.pop();
			
		}
	}

	private static void quickSort(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		System.out.println();

		System.out.printf("a[%d]~a[%d] : { ", left, right);
		for (int i = left; i < right; i++)
			System.out.printf("%3d", a[i]);

		System.out.printf("%3d } ", a[right]);

		do {
			while (a[pl] < x)
				pl++;
			while (a[pr] > x)
				pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);
		if (left < pr)
			quickSort(a, left, pr);
		if (pl < right)
			quickSort(a, pl, right);

	}

	private static void partition(int[] a, int n) { // n=9
		// TODO Auto-generated method stub
		int pl = 0; // 왼쪽시작포인트 인덱스 0으로
		int pr = n - 1; // 오른쪽시작포인트 인덱스 n-1
		int x = a[n / 2]; // 피벗의 값 정하기 a[4] 5
		do {
			while (a[pl] < x)
				pl++; // pl=1 a[0] 1 < 5 a[1] 8 < 5 pl=1
			while (a[pr] > x)
				pr--; // pr=7 pr=6
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);
		System.out.println("피벗값은" + x + " 입니다.");

		System.out.println("피벗 이하의 그룹");
		for (int i = 0; i <= pl - 1; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
		System.out.println("피벗과 같은 그룹");
		if (pl > pr + 1) {
			System.out.println("피벗과 같은 그룹");
			for (int i = pr + 1; i <= pl - 1; i++) {
				System.out.printf("%3d", a[i]);
			}
			System.out.println();
		}
		System.out.println("피벗값보다 큰 숫자 그룹");
		for (int i = pr + 1; i < n; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
	}

	private static void swap(int[] a, int idx1, int idx2) {
		// TODO Auto-generated method stub
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

}
