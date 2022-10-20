package day03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Comparator프리셋 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComp() );
		treeSet.add(new Fruit("포도", 10000));
		treeSet.add(new Fruit("딸기", 5000));
		treeSet.add(new Fruit("바나나", 12000));
		treeSet.add(new Fruit("복숭아", 20000));
		treeSet.add(new Fruit("포도", 15000));
		
		Iterator<Fruit> it = treeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

class Fruit {
	String name;
	int price;

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
}

class FruitComp implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		if (o1.price < o2.price)
			return -1;
		else if (o1.price == o2.price)
			return 0;
		return 1;
	}

}