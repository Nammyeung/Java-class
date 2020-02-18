package test;

import java.util.ArrayList;
import java.util.List;
//비즈니스 로직
public class BookProc {
	
	public ArrayList<Book> getList() { // 리턴값 기입 : ArrayList<Book> => list 리턴
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

/* *******************답안***********************
 * ArrayList<Book> list = new ArrayList<Book>();
 * list.add(bk1);
 * list.add(bk2);
 * list.add(bk3);
 * 
 * return list;
 * 
 * List와 ArrayList의 차이
 * List : 인터페이스
 * ArrayList, LinkedList : List에 상속된 클래스
 * 
 * 도형에 비유하여 풀어보면,

List list = new ArrayList();
-> 도형 list = new 정사각형();

ArrayList list = new ArrayList();
-> 정사각형 list = new 정사각형();

(List는 interface다. interface는 공통되는 메소드를 추출해 놓은 클래스로 생각하면 된다.)

출처: https://galgum.tistory.com/18 [개인주의]
 * 
 */
