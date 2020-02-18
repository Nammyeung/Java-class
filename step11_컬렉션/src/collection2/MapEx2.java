package collection2;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("�ظ�����", Integer.valueOf(95));
		map.put("��", Integer.valueOf(75));
		map.put("�츣�̿´�", Integer.valueOf(85));
		map.put("������", Integer.valueOf(88));
		map.put("����", Integer.valueOf(93));
		map.put("�׺��չ���", Integer.valueOf(66));
		map.put("�ظ�����", Integer.valueOf(85)); //�ظ����Ͱ� �ߺ��ǹǷ� ����� �߻�
		map.put(null, Integer.valueOf(95));
		map.put(null, Integer.valueOf(95)); // Ű�� null ���
		map.put("�����Ʈ", null); // ���� null ���
		
		System.out.println(map);
		
		Integer num = map.get("������");
		System.out.println("������ ������?" + num);
		
		int n = num.intValue();
		System.out.println(n); // �̷� ������ UnBoxing�̶� �θ���.
	}
}

/* [Java] int�� Integer�� ����(+ Wrapper Class��?)



�ڹٿ��� Integer.valueOf(String);
Ȥ��Integer.parseInt(String); ó�� Integer��� ���� �����մϴ�.


���� C �迭 �� ����Ͻô� �е��� �ڹٸ� ó�� ���ϰ� �Ǹ� ��Ȳ�ϱ� �����ε���.
int �� Integer�� ����� �������� � ���̰� �ִ��� �˾ƺ����� �ϰڽ��ϴ�.

1. int (Primitive �ڷ���)
- '�ڷ���' �� �ǹ��Ѵ�. (int, float, long, double �� ���� �ϳ��� primitive �ڷ����� �ǹ��մϴ�.)
- '��� ����'�� �����մϴ�.
- null �� �ʱ�ȭ �Ұ����մϴ�.(0���� �ʱ�ȭ �����մϴ�.)
�̷��� �� ������ �ڹٴ� C/C++�� ������ ���̸� ���Դϴ�.

2. Integer (Wrapper Ŭ����-��ü)
- Wrapper Ŭ�����Դϴ�. **
- Unboxing �� ���� ������ ��� ������ �Ұ���������, null���� ó���� �� �ֽ��ϴ�.
- null�� ó���� �����ؼ� SQL �� ������ ��� ó���� ����. �������� ��������� �Ұ����մϴ�.

** Wrapper Ŭ������?
Java�� �����͸� Ŭ������ ��ü �ܿ� ���� Ÿ���� �����ϴ�. �׷��� ������ Java�� �⺻�� Ÿ��(������ ���� primitive �ڷ���)�� ��ü ����(Ŭ����) ���� �� ���� Ÿ���� ���� �����͸� �����ϴ�. 
��쿡 ���� �⺻�� Ÿ���� ��ü�� ����ϴ� ��찡 ������, �̷��� ���� �⺻�� Ÿ�� ���� ��ü�� ǥ���ؾ��մϴ�.

�̶� Wrapper Ŭ������ ����ϴµ�, Ư�� �⺻�� Ÿ������ ��Ÿ���ϴ�. ���� ��� Integer Ŭ������ ������ ���� ���� ��Ÿ���� ��ü�� �ϳ��� int���� ������ �� �ֽ��ϴ�.



ex)

Integer a = new Integer(10);

Double b = new Double("4.57");

*/