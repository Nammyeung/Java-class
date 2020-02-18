package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List : ���� �ٸ� �ڷ����� ���ӵ� ������ [][][] + [] => �����͸� �߰��� �� ����, �ߺ���� o, �������� o
public class ListEx01 {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("��"); // list�� �����͸� �߰��ϴ� �޼ҵ�, add(Object e) boolean ��ü�� �߰������� �� ������ �˻��Ͽ� ���ϰ��� �����ش�.
		// boolean a = list.add("one") or if(a == true) {ó���۾�}
		list.add("����");
		list.add("����");
		list.add(new Integer(4));
		list.add("�ܿ�");
		list.add(5.0f);
		list.add(4.0);
		
//		System.out.println(list);
		
		for(Object ob : list)
			System.out.println(ob);
				
		list.remove("second");
		Iterator iter = list.iterator();
		while(iter.hasNext()) // ��ȣ ������ ���̸� �����Ͱ� �ִ�
			System.out.println(iter.next());

	}

}
// Object�� �ֻ��� Ŭ����