package collection2;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("해리포터", Integer.valueOf(95));
		map.put("론", Integer.valueOf(75));
		map.put("헤르미온느", Integer.valueOf(85));
		map.put("말포이", Integer.valueOf(88));
		map.put("지니", Integer.valueOf(93));
		map.put("네빌롱바텀", Integer.valueOf(66));
		map.put("해리포터", Integer.valueOf(85)); //해리포터가 중복되므로 덮어쓰기 발생
		map.put(null, Integer.valueOf(95));
		map.put(null, Integer.valueOf(95)); // 키에 null 허용
		map.put("볼드모트", null); // 값에 null 허용
		
		System.out.println(map);
		
		Integer num = map.get("말포이");
		System.out.println("말포이 성적은?" + num);
		
		int n = num.intValue();
		System.out.println(n); // 이런 과정을 UnBoxing이라 부른다.
	}
}

/* [Java] int와 Integer의 차이(+ Wrapper Class란?)



자바에는 Integer.valueOf(String);
혹은Integer.parseInt(String); 처럼 Integer라는 것이 존재합니다.


보통 C 계열 언어를 사용하시던 분들이 자바를 처음 접하게 되면 당황하기 마련인데요.
int 와 Integer는 비슷한 말이지만 어떤 차이가 있는지 알아보도록 하겠습니다.

1. int (Primitive 자료형)
- '자료형' 을 의미한다. (int, float, long, double 와 같은 하나의 primitive 자료형을 의미합니다.)
- '산술 연산'이 가능합니다.
- null 로 초기화 불가능합니다.(0으로 초기화 가능합니다.)
이러한 점 때문에 자바는 C/C++과 조금의 차이를 보입니다.

2. Integer (Wrapper 클래스-객체)
- Wrapper 클래스입니다. **
- Unboxing 을 하지 않으면 산술 연산이 불가능하지만, null값은 처리할 수 있습니다.
- null값 처리가 용이해서 SQL 과 연동할 경우 처리가 용이. 직접적인 산술연산은 불가능합니다.

** Wrapper 클래스란?
Java는 데이터를 클래스와 객체 외에 기초 타입을 가집니다. 그렇기 때문에 Java는 기본형 타입(위에서 말한 primitive 자료형)과 객체 참조(클래스) 같은 두 가지 타입의 관리 데이터를 가집니다. 
경우에 따라서 기본형 타입을 객체로 사용하는 경우가 있으며, 이러현 강우 기본형 타입 값을 객체로 표현해야합니다.

이때 Wrapper 클래스를 사용하는데, 특정 기본형 타입으로 나타냅니다. 예를 들어 Integer 클래스는 간단한 정수 값을 나타내며 객체는 하나의 int값을 저장할 수 있습니다.



ex)

Integer a = new Integer(10);

Double b = new Double("4.57");

*/