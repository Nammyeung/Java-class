package object;

import java.util.Scanner;

class MemberPhone{ // Navigator => 동일한 패키지 안에 클래스가 다 들어가있는데 중복된 이름으로 작성할 수 없다.
	private String name;
	private String phone; // 전화번호는 자료형을 주로 String으로 함.
	
	public void input() {
		Scanner sc = new Scanner(System.in); // BufferedReader와 비슷(동일 x)
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine(); // 숫자를 입력 받으려면 nextInt();
		
		System.out.print("전화를 입력하세요 : ");
		phone = sc.nextLine();
		sc.close(); // 닫아줘야함. / IO에서 입출력 할 때 닫아주는 것이 중요.
	}
	public void output() {
			System.out.println(name + "고객님의 전화번호는 " + phone + "입니다");
	}
}	

public class ObjectEx6 {

	public static void main(String[] args) {
		MemberPhone mp = new MemberPhone();
		mp.input(); // 입력 메소드
		mp.output(); // 출력 메소드

	}

}
