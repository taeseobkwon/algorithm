//package day04;
//
//import java.util.Iterator;
//
//public class 이름정렬 {
//
//	String[] name;
//
//	void init() {
//		name = new String[] { "권수진", "최명진", "한경미", "박현진", "서유미" };
//	}
//
//	void display() {
//		for (String n : name) {
//			System.out.printf("%3d", n);
//		}
//		System.out.println();
//	}
//
//	public static void main(String[] args) {
//		이름정렬 s = new 이름정렬();
//		System.out.println("선택정렬 전");
//		s.init();
//		s.display();
//		s.selectSort();
//		System.out.println("선택정렬");
//		s.display();
//	}
//
//	void selectSort() {
//		System.out.println("선택정렬 중");
//		for (int i = 0; i < name.length; i++) {
//			for (int j = i+1; j < name.length; j++) {
//				if(name[i] > name[j]) {
//					String temp = name[j];
//					name[j] = name[i];
//					name[i] = temp;
//				}
//			}
//			System.out.printf("%3d 회", (i + 1));
//			display();
//		}
//	}
//}
