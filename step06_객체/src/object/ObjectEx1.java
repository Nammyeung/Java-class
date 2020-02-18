package object;

/*	- (private)		+ (public)		#(protected)
	------------------------------------------------------------
	클래스 명 : Person
	------------------------------------------------------------
	+name : String
	+age : int
	+score : float
	------------------------------------------------------------
	+setPerson(name:String, a:int, s:float) : void(Return 타입)
	+viewPerson():void
	------------------------------------------------------------
	(표를 만들 수 없으니 이렇게 표시)
*/
// 함수의 역할 : 변수의 상태를 변화, 동작을 나타냄
//class Person{
//	public String name; // 상위에 + Name 자료형이 표기안되어 있어도 묵시적으로 인정, 설계서에서는 명시를 해놓는것을 관례로
//	public int age;
//	public float score;
//	// 멤버변수(field) 선언, 객체지향
//	public void setPerson(String n, int a, float s) { // set이라는 값을 임의로 붙으면 변수에 값을 붙이는 용도
//			//멤버 함수정의, method
//	{
//		name = n; // name 변수에 값을 대입
//		age = a;
//		score = s;
//		}
//	}
//}

class Person{
	public String name; // public 생략가능
	public int age;		// public 생략가능
	public float score;	// public 생략가능
	
	public void setPerson(String name, int age, float score) { // 필드?
		this.name = name ; // name = n "개나리" => String n => name => public String name // 객체 지향의 목표 : 정보 입력(값을 입력)
		this.age = age; // 가린다? / age = a
		this.score = score; // 자기자신의 객체안에 있는 변수 / score = s
	} // 출력을 하고 싶으면 출력을 할 수 있는 메소드를 생성해야(public String name에서 바로 전달)
	public void viewPerson() {
		// String name = "";
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("점수 : " + score);
	}
}

public class ObjectEx1 {
	
	public static void main(String[] args) { // Entry point
		Person ps = new Person(); // new Person : 힙 영역에 메모리를 할당하는 인스턴스 
		ps.setPerson("개나리", 23, 73.5f); // ps.setPerson("개나리", 23, 73.5f);, 주석도 한 번 확인해 볼 것 /  ps : 객체(필드와 메소드의 종합)
		ps.viewPerson();
		System.out.println(ps.hashCode()); // hashCode를 가지고 체크? / hash : 참조 주소, 힙영역의 인스턴스에 대한 참조값을 주는 방식 / hash = page, 해시태크(태그 건 것을 모두 찾아냄, 참조값)
		
	    ps = new Person();
	    ps.setPerson("민들레",  25,  90.5f);
	    ps.viewPerson();
	    System.out.println(ps);
	    
	    
	}
}

//public class ObjectEx1 {
//
//	public static void main(String[] args) {
//		// String name;
//		// String name = "홍길동";
//		// String name = new Sting("홍길동"); => 생성자, 보통 클래스에는 값을 대입하지 않는다.
//		Person ps = new Person(); // name, age, score, setPerson() 사용가능.
//		ps.setPerson("개나리", 23, 73.5f); // 결과가 안나옴 => 출력없이 ps[]객체 -> [name : 개나리, age : 23세, score : 73.5]를 가지는 객체 형성 -> ps[] 소멸
//
//	}
//
//}
// +, - 접근지정자를 기호로 나타냄(+ : public,- : private)
// stack : 컴파일 결정 vs 힙 : 런타임 결정
// 정적바인딩 : 호출하기전에 미리 아는것.

// Person ob = new Person();
// ob.setPerson("개나리", 23, 73.5f);

// 
