package day03;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class 트리셋 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		// scores.add(new Integer(87)); // 취소줄 = 과거의 문법
		// scores.add(new Integer(88));
		// scores.add(new Integer(98));
		// scores.add(new Integer(75));
		// scores.add(new Integer(80));
		// scores.add(new Integer(85));
		
		scores.add(87);
		scores.add(88);
		scores.add(98);
		scores.add(75);
		scores.add(80);
		scores.add(85);
		
		Integer score = null;
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);
		score = scores.lower(95);
		System.out.println("95이하 점수 : " + score);
		score = scores.higher(95);
		System.out.println("95이상 점수 : " + score);
		
		NavigableSet<Integer> decedingSet = scores.descendingSet();
		for(Integer score1 : decedingSet) {
			System.out.print(score1 + " ");
		}
		System.out.println();
		NavigableSet<Integer> decedingSet1 = decedingSet.descendingSet();
		for(Integer score1 : decedingSet1) {
			System.out.print(score1 + " ");
		}
	}

}











