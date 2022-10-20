package day05;

public class 힙정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {6,4,3,7,1,9,8};
		int nx = x.length;
		heapSort(x,nx);
		System.out.println("오름차순을 힙정렬");
		for (int aa : x) {
			System.out.printf("%3d", aa);
		}
	}

	private static void heapSort(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int i=(n-1)/2 ; i>=0; i--) { //i=3, 2, 1, 0
			downHeap(a, i, n-1);
		}
		for(int i=n-1; i>0; i--) { //i= 6 5 4 3 2 1 
			swap(a, 0, i);
			downHeap(a, 0, i-1);
		}
	}

	private static void swap(int[] a, int idx1, int idx2) {
		// TODO Auto-generated method stub
		int t=a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	private static void downHeap(int[] a, int left, int right) { //left=3, right=6
		// TODO Auto-generated method stub
		int temp = a[left]; // temp = a[3] => temp = 7
		int child;
		int parent;
		
		for(parent = left; parent < (right + 1) / 2; parent = child) {
			// parent = 3; parent < 3 ;
			int cl=parent * 2 + 1; // 부모의 왼쪽 자식의 배열 인덱스
			int cr = cl + 1; // 오른쪽 자식의 배열 인덱스
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl;
			if(temp >= a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}

}
