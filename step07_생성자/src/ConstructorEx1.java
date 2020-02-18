package constructor;
//생성자 : 클래스 이름과 동일한 메서드의 형태, 리턴 자료형이 없음
//		객체 생성 담당
public class ConstructorEx1 {
	public ConstructorEx1() {  // public : 접근지정자(생성자에서는 뺄 수도 있음), ConstructorEx1() : 함수
		System.out.println("default constructor");
	} // 제어는 이동을 한다.
	public ConstructorEx1(String str) { // 생성자는 return 자체가 없다.(void) (2) => 매개변수 하나짜리 생성자
		System.out.println(str + " constructor"); // (3)
	}
	public ConstructorEx1(String str, int n) {
		System.out.println(str + " " + n + " constructor");
	}

	public static void main(String[] args) {
		ConstructorEx1 ob = new ConstructorEx1(); // new ConstructorEx1() => 해당 생성자를 지속적으로 사용하지 않을 경우 굳이 변수에 저장 x 
		new ConstructorEx1("가나다"); // 생성자에 매개변수가 붙은 경우 (1)
		new ConstructorEx1("가나다", 10);
	}

}
