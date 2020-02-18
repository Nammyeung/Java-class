package interfaceex;

interface Shape{ // 득립된 파일이 아니므로 public은 생략
	//-------------------------------------------------
			/* final */int r = 10; // final, abstract 있으나 없으나 큰 의미를 가지지 않음
			/* abstract */public void draw() ; // 변수를 대입할 때 지정만 해주면 된다.
			/* abstract */public void erase() ; // 
	//-------------------------------------------------
		}
	// 아래의 또 다른 클래스가 많이 만들어지는 경우를 고려한 것.
		class Circle implements Shape{
			@Override
			public void draw() {	// 강제 재정의
				System.out.println("반지름이 " + r + "인 원을 그린다 ");
			}
			@Override
			public void erase() {	// 강제 재정의
				System.out.println("원을 지운다");
			}
		}

		public class InterfaceEx1 {

			public static void main(String[] args) {
				Circle cir = new Circle();
				cir.draw();
				cir.erase();
				
			}
		}
			
// 상속 받은 부분도 에러가 남
				
//-------------------------------------------------추상(미완성) 클래스
//abstract class Shape{
////-------------------------------------------------
//		final int r = 10;
//		abstract public void draw() ; // 미완성 상태
//		abstract public void erase() ; // 정의를 나타내는 brace({}) 지움.
////-------------------------------------------------
//	}
//// 아래의 또 다른 클래스가 많이 만들어지는 경우를 고려한 것.
//	class Circle extends Shape{
//		@Override
//		public void draw() {	// 강제 재정의
//			System.out.println("반지름이 " + r + "인 원을 그린다 ");
//		}
//		@Override
//		public void erase() {	// 강제 재정의
//			System.out.println("원을 지운다");
//		}
//	}
//
//	public class InterfaceEx1 {
//
//		public static void main(String[] args) {
//			Circle cir = new Circle();
//			cir.draw();
//			cir.erase();
//
//		}
//
//	}

//------------------------------------------------일반 클래스
//class Shape{
////-------------------------------------
//	final int r = 10;
//	public void draw() {};
//	public void erase() {};
////-------------------------------------
//}
//// 아래의 또 다른 클래스가 많이 만들어지는 경우를 고려한 것.
//class Circle extends Shape{
//	@Override
//	public void draw() {
//		System.out.println("반지름이 " + r + "인 원을 그린다 ");
//	}
//	@Override
//	public void erase() {
//		System.out.println("원을 지운다");
//	}
//}
//
//public class InterfaceEx1 {
//
//	public static void main(String[] args) {
//		Circle cir = new Circle();
//		cir.draw();
//		cir.erase();
//
//	}
//
//}

// java.lang.Object - 자바 최상위 클래스
//		http://blog.daum.net/question0921/231
		