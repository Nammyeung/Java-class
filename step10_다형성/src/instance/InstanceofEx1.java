package instance;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}

public class InstanceofEx1 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B(); // b변수가 참조하고 있는 인스턴스
		D d = new D();
		// 참조변수가 참조한느 인스턴스의 실제 타입을 알아보기 위한 연산자(boolean 형으로 결과)
		System.out.println(b instanceof A); // b가 A클래스에 속해 있는가?
		System.out.println(a instanceof C); // false(속해있는지의 여부이므로 속해 있을 때와 종속여부가 아닐 때 차이가 있음)
		// System.out.println(b instanceof C); // error, b와 c는 아무 관계가 없는 동등환 관계이기 때문에 error
		System.out.println(d instanceof A); // 손자, 속하는가 OR 소속이 되는가?
	}

}
