package inheritance;

class NumberEx1 {
	int a, b;
	public NumberEx1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void view1() {
		System.out.println(a + " " + b);
	}
}
class NumberEx2 extends NumberEx1 {
	int c;
	public NumberEx2(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	public void view2() {
		super.view1();
		System.out.println(c);
	}
	// 부모 클래스에 변수가 있어야 생성자를 만들 수 있음.
	
}
public class InheritanceEx4 {

	public static void main(String[] args) {
		new NumberEx1(100, 200).view1(); // 부모 클래스의 객체를 생성할 경우 자식 클래스에는 접근할 수 없다.
		
		// new NumberEx2(10, 20, 30).view1();
		new NumberEx2(10, 20, 30).view2();

	}

}
