package day02;

public class 배열요소역순정렬64 {

	public static void main(String[] args) {
		// 정렬하기
		int[] iArr = {2,5,1,3,9,6,7};
		
		// 배열의 요소를 역순으로 정렬하기
		for (int i = 0; i < iArr.length / 2; i++) {
			swap(iArr, i, iArr.length - i -1);
		}
			
		
		
	}

	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

}
