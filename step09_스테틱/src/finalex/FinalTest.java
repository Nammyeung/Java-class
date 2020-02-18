package finalex;

class A{
	final int n=100; // final 변수로 선언된 것은 상수이다. => 값을 변경할 수 없음.
	final public void view() { // 
//		n=200; --final 변수는 값을 변경할 수 없음.
		System.out.println("A class");
	}
	
}
class B extends A{
//	@Override
//	public void view() { // final 메서드는 오버라이드 불가 => 여기서 오버라이드 개념을 이해할수 있을 듯.(덮어씌우기 불가)
//		
//	}
}


public class FinalTest {

	public static void main(String[] args) {
		

	}

}
