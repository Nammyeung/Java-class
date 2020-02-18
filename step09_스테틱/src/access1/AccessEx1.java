package access1;

import access2.AccessEx3; // 패키지 이름까지 입력
import access2.AccessEx4;

public class AccessEx1 extends AccessEx4{ // 상속을 하게되면 곧바로 접근을 할 수 있는 구조가 됨
	private int x = 10;
	private int y = 20;
	
	public static void main(String[] args) {
		AccessEx1 a1 = new AccessEx1();
		System.out.println(a1.x + "\t" + a1.y); // private이지만 자기 클래스 안에서는 접근 가능
		System.out.println(a1.a + "\t" + a1.b);
		
		AccessEx2 a2 = new AccessEx2();
		System.out.println(a2.x + "\t" + a2.y + "\t" + a2.a); // default 형식으로 선언 => 문제없이 접근
		// a2.a 접근 가능
		AccessEx3 a3 = new AccessEx3();// 패키지가 바뀌는 경우 import가 형성되어야 한다.
		System.out.println(a3.x + "\t" + a3.y/* + "\t+a3.x1 */); // default 형식으로 선언 => 문제없이 접근
		
		// AceessEx4 a4 = new AccessEx4();
		// System.out.println(a4.a); => 접근이 안됨
		
	}
}

//  T - T1	  |- T21
//    |		  |- T22
//	  -- T2 -----T23

// 상속 관계를 벗어날 때는 protected
// 변수에 직접 접근은 흔하지 않은 경우 => 함수에 대해서 생각.

// 내부 + 외부 : public