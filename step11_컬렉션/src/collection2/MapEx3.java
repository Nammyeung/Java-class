package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx3 {

	public static void main(String[] args) {
		// 맵은 기본적으로 순서가 없다.
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(3,  "피카츄");
		map.put(1, "잠만보");
		map.put(4, "파이리");
		map.put(2, "꼬부기");
		
		System.out.println(map);
		
//		Set<Integer> keys = map.keySet(); // map의 키만 뽑아주는 것
//		for(Integer n : keys)
//			System.out.println(map.get(n));
		
		Set<Integer> keys = map.keySet(); // map의 키만 뽑아주는 것
		List<Integer> list = new ArrayList<Integer>(keys);
		System.out.println(list);
//		Collections.sort(list);
		for(Integer n : list)
			System.out.println(map.get(n));
	}

}
