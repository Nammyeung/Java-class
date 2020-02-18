package object;

public class objectEx2 {

	public static void main(String[] args) {
		User ob = new User() ; // 객체 생성
		ob.setUser("진달래", 97, 55, 79); // 객체에다 값을 대입
		System.out.println(ob.getUser());
		

	}
	// 이름은 진달래이고, 총점은 231점입니다.
}
