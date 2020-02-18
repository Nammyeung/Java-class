package collection1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListEx02 {
// 연속된 기억 공간 서로 다른 자료형, 중복허용, 순서유지
	
	@SuppressWarnings(value = "unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(4);
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		list.add("second");
		list.add(5.0f);
		// System.out.println(list);
		list.remove("second");
		Iterator iter = list.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
		
		
	}
}