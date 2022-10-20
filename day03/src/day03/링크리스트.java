package day03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class 링크리스트 {

	public static void main(String[] args) { 
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList = Arrays.asList(1,2,3,4,5,6,1);
		// 향상된 for문
		for (int a : linkedList) {
			System.out.print(a + " ");
		}
		System.out.println();
		// Iterator 인터페이스 반복자를 지원하는 인터페이스로 출력
		Iterator<Integer> it = linkedList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
			
		}
	}

}
