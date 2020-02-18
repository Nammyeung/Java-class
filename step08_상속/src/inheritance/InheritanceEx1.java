package inheritance;

//Object
//[toString] <-
// Override가 안됐는데 Override를 입력하면 지우라는 메세지를 보냄.
class SuperEx{
	public void show() {
		System.out.println("show1 method");
	}
}
// 부모클래스에서 자식클래스도 접근이 가능(동적 바인딩 기법), 원칙적으로는 부모가 자식에게 접근할 수 없음.(일상 ex - 부모가 자식에게 몽땅 상속 => 자식이 먹고 쨈)
class SubEx extends SuperEx{
	@Override // toString에서 본 것
	public void show() {
		super.show(); // 부모클래스를 연결
		System.out.println("show2 method");
	}
	
}
// 부모 : Super class, 자식 : Sub class

/* 오버 라이딩 (Override)
 * 
오버 라이딩 : 슈퍼 클래스에 존재하는 필드나 메소드를 서브 클래스에서 재정의하여 사용할 수 있다.

오버 라이딩을 통한 슈퍼 클래스를 생성할 때는 super 키워드를 사용한다.

Tip. 오버라이딩을 위해 필드나 메소드를 정의할 때 바로 위 상단에 @Override 문구를 넣어주면 오타를 방지할 수 있다. 

(슈퍼 클래스에 존재하지 않은 메소드를 오버라이드 하려고하면 컴파일 과정에서 에러 발생)

*/

public class InheritanceEx1 {

	public static void main(String[] args) {
		SubEx ob = new SubEx();
		ob.show(); // 자식으로 객체를 선언했지만 부모 내부의 메소드를 마음껏 사용할 수 있다.

	}

}



//class SuperEx{
//	public void show1() {
//		System.out.println("show1 method");
//	}
//}
//
//class SubEx extends SuperEx{
//	public void show2() {
//		System.out.println("show2 method");
//	}
//	
//}
//// 부모 : Super class, 자식 : Sub class
//
//
//
//
//
//public class inheritanceEx1 {
//
//	public static void main(String[] args) {
//		SubEx ob = new SubEx();
//		ob.show1(); // 자식으로 객체를 선언했지만 부모 내부의 메소드를 마음껏 사용할 수 있다.
//		ob.show2();
//	}
//
//}

// 상속 - []상위클래스가 존재 <- []
//부모가 죽고나서 자식들의 부모의 것을 가져감 < 증여의 개념
// 부모 클래스에 접근할 수 있는 권한을 
// 1. 상속 - 메소드를 오버라이드