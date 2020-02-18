package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List : 서로 다른 자료형의 연속된 기억공간 [][][] + [] => 데이터를 추가할 수 있음, 중복허용 o, 순서유지 o
public class ListEx01 {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("봄"); // list에 데이터를 추가하는 메소드, add(Object e) boolean 객체를 추가했을때 참 거짓을 검사하여 리턴값을 돌려준다.
		// boolean a = list.add("one") or if(a == true) {처리작업}
		list.add("여름");
		list.add("가을");
		list.add(new Integer(4));
		list.add("겨울");
		list.add(5.0f);
		list.add(4.0);
		
//		System.out.println(list);
		
		for(Object ob : list)
			System.out.println(ob);
				
		list.remove("second");
		Iterator iter = list.iterator();
		while(iter.hasNext()) // 괄호 내용이 참이면 데이터가 있다
			System.out.println(iter.next());

	}

}
// Object가 최상위 클래스