package test;

import java.util.ArrayList;
import java.util.List;
//����Ͻ� ����
public class BookProc {
	
	public ArrayList<Book> getList() { // ���ϰ� ���� : ArrayList<Book> => list ����
		Book bk1 = new Book("java", "kim", 100);
		Book bk2 = new Book("c++", "lee", 200);
		Book bk3 = new Book("jsp", "park", 300);
		
		ArrayList<Book> list = new ArrayList<>();
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
				
		return list;
	}
	
}

/* *******************���***********************
 * ArrayList<Book> list = new ArrayList<Book>();
 * list.add(bk1);
 * list.add(bk2);
 * list.add(bk3);
 * 
 * return list;
 * 
 * List�� ArrayList�� ����
 * List : �������̽�
 * ArrayList, LinkedList : List�� ��ӵ� Ŭ����
 * 
 * ������ �����Ͽ� Ǯ���,

List list = new ArrayList();
-> ���� list = new ���簢��();

ArrayList list = new ArrayList();
-> ���簢�� list = new ���簢��();

(List�� interface��. interface�� ����Ǵ� �޼ҵ带 ������ ���� Ŭ������ �����ϸ� �ȴ�.)

��ó: https://galgum.tistory.com/18 [��������]
 * 
 */
