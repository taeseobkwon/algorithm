package day04;

import java.util.Arrays;

public class 이름 {
	public static void main(String[] args) {
		String[] name = { "권수진", "최명진", "한경미", "박현진", "서유미" };
		for (int i = 0; i < name.length; i++) {

			System.out.println(name[i]);
		}
		System.out.println("-------------------");
		Arrays.sort(name);
		for (String i : name) {
			System.out.println(i + " ");
		}
	}

}