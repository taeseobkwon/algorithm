package day03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 해시맵 {

	public static void main(String[] args) {
		// Map
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 삽입하기
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		map.put("d", 100);
		map.put("d", 200);
		map.put("d", 300);
		
		// 객체 검색하기(출력)
		System.out.println(map.get("b"));   
		System.out.println(map.get("f"));
		
		// 모든 값을 다 출력하기
		// 1단계 key만 모은다
		Set keySet = map.keySet();
		Iterator<String> it   = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + "~");
			System.out.println(map.get(key) + "~");
		}
	}

}
