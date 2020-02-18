package methodex;


public class MethodEx8 {
		
	
	public static void view1() { 
		System.out.println("static method");
	}
	
	public static void view2(int[] num) {
		for (int n:num) {
			System.out.println("변경전 view2의 num: " + n); // 참조 자료형, 어느 위치든 값을 변경을 시키면 전체 영역에 영향 vs 정수 자료형
		}
		//System.out.println();
		num[2] = 300;
		for (int n:num) {
			System.out.println("변경후 view2의 num: " + n);
		}
		
	}
	
	public static void main(String[] args) {
		//클래스 메서드(class method) : 객체 없이 호출 가능(static이 붙어있는)
		MethodEx8.view1();
		view1(); // 자기자신의 매서드에 접근할때는 class명 생략가능.
		
		
		//클래스의 오브젝트는 인스턴스, 클래스의 인스턴스가 오브젝트
				
		Math.random(); // 클래스 메서드 ex, 외부의 Math클래스를 가져와서 사용하기 때문에 Math.~~
		
		int 	a = 5; // 
		
		String	name = new String("홍길동"); // 이렇게 만드는게 귀찮다.
		
		MethodEx8 ob = new MethodEx8(); // 객체 생성, 인스턴스를 실체화 시킨 것이 객체(인스턴스화), new부분 => 무슨 일을 하는지를 정의, 괄호안에 값을 추가로 전달
		//ob.view2(); 인스턴스 메소드 (instance method)
		// 반드시 객체를 생성하고 메서드를 호출해야 함. // view1, view2를 어느곳에서나 호출하고 싶다.
		
		// name. => String name => String이 가지고 있는 함수를 가지고 올 수 있음.
	}
}
// 오브젝트 = 인스턴스 = 객체