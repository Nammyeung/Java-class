package collection1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set : 중복 허용 x, 순서 유지 x
public class SetEx {
	@SuppressWarnings(value="unchecked") // type을 확인하지 않음, 자료형 검사를 안함
	public static void main(String[] args) {
		// Set<Integer> set = new HashSet<Integer>(); // <Integer> => integer 자료형을 넣고 싶다, generic 표현 (이 경우 integer 빼곤 전부 오류가 난다)
		Set set = new HashSet();
		set.add("one"); //add(Object)
		set.add(2); 	//int-->new Integer(2) : 기본형 -> 객체형(Boxing)
		set.add(new Float(3.0f));
		set.add(4.00); //double -> new Double(4.00)
		set.add(2);
		set.add(new Integer(2));
		set.add(new Double(4.00));
//		set.add(Integer.valueOf(2));
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) // 다음단계에서 내보낼 수 있는 값이 있는가
			System.out.println(iter.next());
	}

}

// summicro => 오라클

// 웹 프로그램 => 대소문자 구분
// *** 클래스 단어 하나 바뀔 때마다 대문자 사용 ***
// instanceof(of 소문자)
// 집합의 요소들에는 순서의 개념이 없다, 중복이 허용되지 않는다.

// Generic 컨테이너 => 무언가를 담을 수 있다.
// Set 자료형 => 안에 있는 자료형은 set이 아니다, 아무거나 담고 싶은 것을 담을 수 있다. 
// => [Integer][Double]

/* HashMap : 키 값과 데이터를 사용하여 HashTable의 값을 찾음.

HaspMap<키의 타입, 데이터의 타입> 객체명 = new HaspMap<키의 타입, 데이터의 타입>(배열 수);

타입 파라미터를 프리미티브 타입으로 정하면 안됨 

()는 50이나 60으로 배열의 크기를 설정 가능 

와일드카드 안의 첫번째는 "키의 타입" 뒤는 "데이터 타입"으로 콤마(,)를 써서 구분한다 

출처: https://soft91.tistory.com/16 [너와 나의 프로그래밍]
/////////////////////////////////////////////////////////////////////////////////////////
HashSet : "중복해서 저장하지 않는" 집합으로 사용할 수 있는 클래스.

HashSet<타입 파라미터> 객체명 = new HashSet<타입 파라미터>();

HashSet 객체에는 "String" 타입의 객체만 저장할 수 있다.
이미 있는 데이터를 저장하면 집합에 변동이 일어나지 않는다.(중복 저장 안함)


출처: https://soft91.tistory.com/16 [너와 나의 프로그래밍]

※ HashSet는 데이터에 순서가 없기 때문에 데이터를 순서대로 읽어오거나, 특정 위치의 데이터를 읽어올 수 있는 방법이 없기 때문에 
"Iterator" 메소드를 활용해서 집합에 있는 "전체" 데이터를 불러올 수 있다.

출처: https://soft91.tistory.com/16 [너와 나의 프로그래밍]

*/



