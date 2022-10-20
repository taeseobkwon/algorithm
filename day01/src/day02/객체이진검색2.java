package day02;

import java.util.Arrays;

public class 객체이진검색2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] pArr = { new Person(10, "홍"), new Person(20, "김"),
							new Person(27, "최"), new Person(25, "이")};
		// Arrays.binarySearch(pArr, new Person(20, ""), Person.Age_ORDER)
		// System.out.println(idx+"~~~");
	}

}

class Person{
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return name + " " + age;
	}
	// public static final Comparator<Person> Age_ORDER = new AgeComparator();
	
// }
// class AgeComparator implements Comparator<Person>{
	public int compare(Person o1, Person o2) {
		return o1.age - o2.age;
	}
}