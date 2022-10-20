package day03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 해시맵연습 {

	public static void main(String[] args) {
		Map<String, Integer> mapp = new HashMap<String, Integer>();
		
		mapp.put("3334", 1111);
		mapp.put("2234", 1112);
		mapp.put("1114", 1113);
		mapp.put("1234", 1000);
		
		Set keySet = mapp.keySet();
		Iterator<String> it   = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("전화번호 뒷자리 : " + key +" ");
			System.out.println("회원번호 : " + mapp.get(key) );
		}
		
		
	}

}
