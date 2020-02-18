package test;

import java.util.ArrayList;
import java.util.Scanner;

/* ID를 입력하세요 : pororo
 * PW를 입력하세요 : 1234
 * 
 * 뽀로로님이 입장하셨습니다.
 * 현재 포인트는 89.97입니다.
 * 
 * [[BOOK의 정보보기]]
 * 책이름 : java 책저자 : kim 페이지 : 100
 * 책이름 : oracle 책저자 :lee 페이지 : 200
 * 책이름 : html 책저자 : aprk 페이지 : 300
 * 
 * -------------------------------------
 * ID를 입력하세요 : pororo
 * PW를 입력하세요 : 1235

ID 또는 PW가 틀리거나 존재하지 않는 ID입니다.
*/

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id; // 접근지정자 필요없음 <= 어차피 메인함수 안에서 동작하게 때문에
		String pw;
		
		//입력 처리
		System.out.println("ID를 입력하세요 : ");
		id=sc.next();
		System.out.println("PW를 입력하세요 : ");
		pw=sc.next();
		
		//입력값에 대한 검사
		UserProc up = new UserProc(); // 메소드에 담아서 매개변수로 전달
		// up.getLoginUser(id, pw); =>
		User entity = up.getLoginUser(id, pw);
		
		//결과 출력
		if(entity!=null) {
			//데이터가 있는 경우
			System.out.println(entity.getName() + "님이 입장하셨습니다");
			System.out.println("현재 포인트는 " + entity.getPoint() + "입니다.");
			System.out.println();
			System.out.println("[[BOOK의 정보보기]]");
			
			BookProc book = new BookProc(); // 3 x 3 하나씩 하나씩 북 리스트에 담는다. [<Book>][][]
			ArrayList<Book> list = book.getList();	// 객체 하나가 하나의 리스트에 들어간다고 생각, <하나의 객체를 명시>
			// for(:)
			for(Book ob : list) // 좌측 : list에서 뽑아내는 데이터 
				System.out.println("책이름 : " + ob.getTitle() + "\t책저자 : " 
				+ ob.getAuthor() + "\t페이지 : " + ob.getPage());

		} else {
			//데이터가 없는 경우
			System.out.println("ID 또는 PW가 틀리거나 존재하지 않는 ID입니다.");
		}
	}

}

// rs : 데이터베이스 결과를 연결하는 셋 => re.getString(문자열을 데이터베이스에서 가져와 뽑아냄)
// http://falkhausen.de/
