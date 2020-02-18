package ovverride;

class Test1{
	public void view1() {System.out.println("view11 method");} // 출력되지 않음.
	public void view3() {System.out.println("view3 method");}
}

class Test2 extends Test1 {
	// @Override // 어노테이션
	public void view1() {System.out.println("view133 method");} // Override한 것이 출력
	public void view2() {System.out.println("view2 method");}
}

public class OverrideEx {

	public static void main(String[] args) {
		Test1 ob = new Test2(); //부모클래스의 참조변수로 자식 객체 생성 => ** 동적 바인딩 **
		ob.view1();
		ob.view3();		//ob.view2(); // Override가 없을때는 없다고 인식
		
		
		//		Test2 ob = new Test2();
//		ob.view1(); // view1, 2, 3 전부다 보임
//		ob.view2();
//		ob.view3();

	}

}

// 오버라이딩 : 부모와 자식 간에 똑같은 형태로 존재하는 것
// 동적 바인딩 : 부모가 자식을 접근하는 방식
// 접근 방식은 같은데 돌아가는 내부 구조가 다르다.

// 정적 바인딩 vs 동적 바인딩 (****************매우 유용******************
