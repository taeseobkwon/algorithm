package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 리스트 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("AA");
		list.add("BB");
		list.add(1, "CC"); // 1번자리로
		list.add("AA");
		list.add("DD");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.remove("DD");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "~~");
		}

		List<String> list1 = Arrays.asList("11", "22", "33", "44", "22");

		for(String a : list1) {
			System.out.print(a + " ");
		}
	}

}
