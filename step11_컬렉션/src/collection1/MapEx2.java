package collection1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapEx2 {
	public static void main(String[] args) {
		
		@SuppressWarnings(value = "unchecked")
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("해리포터", Integer.valueOf(95));
		map.put("론", Integer.valueOf(75));
		map.put("헤르미온느", Integer.valueOf(85));
		map.put("말포이", Integer.valueOf(88));
		map.put("지니", Integer.valueOf(93));
		map.put("네빌롱바텀", Integer.valueOf(66));
		map.put("해리포터", Integer.valueOf(85)); // 중복 허용 금지
		map.put(null, Integer.valueOf(95)); // 키에 널 사용 가능
		map.put("볼드모트", null); // 값에 널 사용 가능
		System.out.println(map);
		
		Integer num = map.get("말포이");
		System.out.println("말포이 성적은 " + num);
		
//		int n = num.intValue(); // 언박싱이라고함
		int n = new Integer(num); // 오토언박싱
		System.out.println(n);
	}
}
