package shape;

public class ShapeMain {

	public static void main(String[] args) {
		//정적 바인딩
		Rectangle ob1 = new Rectangle(4, 5);
		System.out.println("사각형의 넓이 : " + ob1.getSize());
		
		Triangle ob2 = new Triangle(3, 7);
		System.out.println("삼각형의 넓이 : " + ob2.getSize());
		
		//동적 바인딩
		Shape sh = null;
		sh = new Rectangle(4,5);
		System.out.println("사각형의 넓이 : " + ob1.getSize());
		
		sh = new Triangle(3, 7);
		System.out.println("삼각형의 넓이 : " + ob2.getSize());
		
		
		
//		Rectangle ob1 = new Rectangle(4, 5);
//		System.out.println("사각형의 넓이 " + ob1.getSize()); // 20
//		
//		Triangle ob2 = new Triangle(3, 7);
//		System.out.println("삼각형의 넓이 " + ob1.getSize()); // 10.5
	}
	
}

		
		

/* 동적바인딩(Dynamic Binding)은 다형성(Polymorphism)을 사용하여 메소드를 호출할때 발생하는 현상입니다. 
 * 동적바인딩은 실행시간(Runtime) 즉, 파일이 실행하는 시점에서 성격이 결정되고 정적바인딩(Static Binding)은 
 * 컴파일(Compile)시간에 성격이 결정됩니다.
 

동적바인딩과 정적바인딩을 할때 알아둬야할 점은 Object Promotion에 관한 내용입니다.

동적바인딩 : 실제 참조하는 객체는 서브클래스이니 서브클래스의 메소드를 호출한다.

정적바인딩 : 변수의 타입이 수퍼클래스이니 수퍼클래스의 메소드를 호출한다.

정적 바인딩(Static Binding)

컴파일 시간에 일어나며, 실행 중 변하지 않고 유지됨
예를 들어 int n; 이란 문장을 보자. 변수 n의 자료형은 컴파일 시간에 int로 할당되고, 
실행 중에도 변하지 않는 변수 n의 속성이다.
함수의 정적 바인딩은 컴파일 시간에 호출될 해당 함수의 주소가 결정되어 바인딩 된다. 
즉, 실행 파일에 호출할 함수가 위치한 메모리 주소가 이미 확정 기록된 것이다.
일반적인 함수는 정적 바인딩이 일어난다.
정적 바인딩은 컴파일 시간에 대부분 변수들의 속성이나 호출될 함수의 주소를 확정해놓기 때문에 실행시간의 속도가 빨라 효율적이다.

동적 바인딩(Dynamic Binding)

실행 시간(run time) 중에 일어나며, 프로그램 실행 도중 변경 가능
인터프리터 언어인 Python을 대표적으로 들 수 있다. num=10 과 같은 문장에서 보듯
Python은 실행 시간에 변수의 자료형을 결정한다.
함수의 동적 바인딩은 실행파일을 만들 때 호출할 함수의 메모리 주소가 확정되지 않고 보류상태로 둔다. 
이후 실제 실행 시간에 호출할 함수의 주소가 결정되기 때문에, 이 주소를 저장할 공간을 미리 확보해둔다(4byte). 
실행될지 확정되지 않은 함수를 위해 저장공간을 빼둬야 하는 점 때문에 메모리 관리에 있어 비효율적일 수 있다.
보통 가상함수들이 동적 바인딩
동적 바인딩의 값은 프로그램 실행 도중 변경될 수 있기 때문에 할당되는 메모리 또한 유동적이며, 
동적 바인딩 되는 변수를 동적 변수라고 한다.

*/