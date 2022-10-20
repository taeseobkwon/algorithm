package day03;

import java.util.Iterator;
import java.util.TreeSet;

public class Comparable트리셋 {

	public static void main(String[] args) {
		// TreeSet에 Person클래스를 단다
		// 정렬 기준은 나이순
		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person("a", 10));
		treeSet.add(new Person("b", 12));
		treeSet.add(new Person("c", 13));
		treeSet.add(new Person("d", 14));
		treeSet.add(new Person("e", 15));
		treeSet.add(new Person("k", 18));

		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}
	// 나이순 오름차순 정렬
	//@Override
//	public int compareTo(Person o) {
//		if (age < o.age)
//			return -1;
//		else if (age == o.age)
//			return 0;
//		else
//			return 1;
//
//	}
	// 나이순 내림차순 정렬
	// @Override
	public int compareTo(Person o) {
		if (age < o.age)
			return 1;
		else if (age == o.age)
			return 0;
		else
			return -1;

	}
}