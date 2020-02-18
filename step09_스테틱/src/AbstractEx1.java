package abstractex;

//---------------------------------------------------------------- 3 // 정렬 단축기 Ctrl + Shift
abstract class AA{ // 추상(미완성)클래스, *관리의 측면*에서 생각하면 설계할 때 abstract으로 정의해 버리면 해당 클래스가지고 객체를 형성하지 않는다.
	public void view1() {}; // 선언
	
	public void view2() {System.out.println("view2 method");}
}
class BB extends AA{ // 클래스 이름에는 의미를 부여할 것
	@Override
	public void view1() {System.out.println("view11 method");}
	//AA클래스의 view1() 재정의- 강제성이 없음.
}

public class AbstractEx1 {

	public static void main(String[] args) {
		//AA ob = new AA(); // 객체 생성 불가능
		
		
		AA ob2 = new BB(); // ob2로 참조변수를 만들어 후손객체 생성
		ob2.view1();
		ob2.view2();

	}

}

//----------------------------------------------------------------- 2

//abstract class AA{ // 추상(미완성)클래스
//	abstract public void view1(); // 선언
//	public void view2() {System.out.println("view1 method");}
//}
//class BB extends AA{ // 클래스 이름에는 의미를 부여할 것
//	@Override
//	public void view1() {System.out.println("view11 method");}
//	//AA클래스의 view1() 재정의- 강제성이 있음.
//}
//
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
//		//AA ob = new AA(); // 객체 생성 불가능
//		
//		
//		AA ob2 = new BB(); // ob2로 참조변수를 만들어 후손객체 생성
//		ob2.view1();
//		ob2.view2();
//
//	}
//
//}

//------------------------------------------------------------------ 1
//class AA{ // 일반 클래스
//	public void view1() {System.out.println("view1 method");}
//	public void view2() {System.out.println("view1 method");}
//}
//class BB extends AA{ // 클래스 이름에는 의미를 부여할 것
//	@Override
//	public void view1() {System.out.println("view11 method");}
//	//AA클래스의 view1() 재정의- 강제성은 없음 
//}
//
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
//		AA ob = new AA(); // 객체 생성 가능
//		ob.view1();	// 1
//		ob.view2();	// 2
//		
//		AA ob2 = new BB(); // ob2로 참조변수를 만들어 후손객체 생성
//		ob2.view1();
//		ob2.view2();
//
//	}
//
//}

/* 추상 클래스를 사용하는 이유
 
추상 클래스는 상속을 강제하기 위한 것이다. 즉 부모 클래스에는 메소드의 시그니처만 정의해놓고 그 메소드의 실제 동작 방법은 이 메소드를 상속 받은 하위 클래스의 책임으로 위임하고 있다. 
사실 코드를 이런 식으로 작성하는 경우는 작은 규모의 프로젝트에서는 거의 없다. 예제를 통해서 추상 클래스의 용도를 생각해보자.
*/


