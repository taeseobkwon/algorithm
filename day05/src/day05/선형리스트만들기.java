package day05;

public class 선형리스트만들기 {

	public static void main(String[] args) {
	List arr = new List();
	arr.createList(10);
	System.out.println(arr.isEmpty(arr));
	arr.insert(arr,0,1);	
	arr.printall(arr);

	arr.insert(arr,1,2);
	arr.printall(arr);

	arr.insert(arr,0,3);
	arr.printall(arr);

	arr.insert(arr,1,4);
	arr.printall(arr);
	
	arr.delete(arr, 4);
	
//	List ulist = new ArrayList<Integer>();
//	ulist.add(10);
//	ulist.add(20);
//	ulist.add(40);
//	ulist.add(30);
//	for (int i = 0; i < ulist.size(); i++) {
//		System.out.println(i + " " + ulist.get(i));
//	}
	}

}
class List{
	int arr[];
	int size;
	public void createList(int number) {
		// 배열의 크기를 10인 배열 생성
		arr = new int[number];
		size=0;
	}
	public void delete(List a, int x) {
		// 해당값을 찾아서 삭제하기
		for(int i=0; i<a.size; i++) {
			if(a.arr[i]==x) {
				while(i<size-1) a.arr[i] = a.arr[i+1];
				size--;
			}
		}
		printall(a);
	}
	public void printall(List a) {
		// 전체 출력
		System.out.println("-------");
		for(int i=0; i<size; i++) {
			System.out.printf("%3d", a.arr[i]);
		}
	}
	public void insert(List a, int i, int x) {
		// 리스트에 값 삽입하기
		int len = size;
		while(i != len) {
			a.arr[len] = a.arr[len-1];
			len--;
		}
		a.arr[i] = x;
		size++;
	}
	public boolean isEmpty(List a) {
		// 배열이 비어있는지 확인하기
		return a.size == 0;
	}
	
}

// 리스트는 데이터를 순서대로 나열한 구조
// 노드는 리스트에 있는 개별 요소
// head node-제일 처음에 있는 노드, tail node-제일 마지막에 있는 노드
// predecessor node - 하나의 노드를 기준으로 바로 앞에 노드
// successor node - 하나의 노드를 기준으로 바로 뒤에 노드
