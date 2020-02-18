package collection1;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
		
	public static void main(String[] args) {
		@SuppressWarnings(value = "unchecked")
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(101,  "둘리");
		map.put(102,  "도우너");
		map.put(103,  "또치");
		map.put(104,  "마이콜");
		map.put(105,  "이찬용");
		System.out.println("key : " + 101 + " value : " + map.get(101));
		System.out.println("key : " + 102 + " value : " + map.get(102));
		System.out.println("key : " + 103 + " value : " + map.get(103));
		System.out.println("key : " + 104 + " value : " + map.get(104));
		System.out.println("key : " + 105 + " value : " + map.get(105));
		
	}
}
