package family;
/*
 * 이름 : 홍길동
 * 아빠는 나가서 일을 한다
 * 
 * 이름 : 소정
 * 엄마는 집안일을 한다
 * 
 * 이름 : 홍준표
 * 아들은 공부를 한다
 * 
*/

public class MainEx {

	public static void main(String[] args) {
		Father ft = new Father("홍길동");
		Mother mt = new Mother("소천");
		Son sn = new Son("홍준표");
		System.out.println(ft.toString());
		System.out.println(mt.toString());
		System.out.println(sn.toString());
		
		Family [] family= new Family[] {
				new Father("홍길동"),
				new Mother("소천"),
				new Son("홍준표")
		};
		for (Family ob :family)
			System.out.println(ob);
		
		Family fal = new Family("홍길동");
		System.out.println(fal);
		}
	}

