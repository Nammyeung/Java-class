package collection2;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	
	@SuppressWarnings(value="unchecked") // type을 확인하지 않음
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "둘리");
		map.put(201, "도우너");
		map.put(301, "마이콜");
		map.put(401, "또치");
		
		System.out.println("key : " + 101 + " value : " + map.get(101));
		System.out.println("key : " + 201 + " value : " + map.get(201));
		System.out.println("key : " + 301 + " value : " + map.get(301));
		System.out.println("key : " + 401 + " value : " + map.get(401));
		
	}
}
