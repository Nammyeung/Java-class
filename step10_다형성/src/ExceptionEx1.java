package exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		/* $ java ExceptionEx1 2 ==> 2
		 * $ java ExceptionEx1 0 ==> 2	// 오류 = java.lang.ArithmeticException
		 * $ java ExceptionEx1 p ==> 2	// 오류 = NumberFormatException
		*/
		
		int var = 5;
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(var/n);
		}catch(Exception e) {
			System.out.println("입력된 값에 문제가 있어요..");
			// exception은 상속관계에 있으므로 최상위권을 잡아서 한 번에 하기도 한다.
		}
// 파이썬, 인텔리제이는 힌트가 잘 안떠서 갑갑한 경우가 맣음. but API를 많이 활용하도록 한다.		
//		int var = 5;
//		try {
//			int n = Integer.parseInt(args[0]);
//			System.out.println(var/n);
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나눌수 없어요");
//		}catch(NumberFormatException e) {
//			System.out.println("숫자로 바꿀수 없습니다");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("입력된 값이 없어요");
//		}finally {
//			System.out.println("무조건 실행");
//		}
	
		
		int n = Integer.parseInt(args[0]);
		System.out.println(var/n);

	}
}
///////////// 에외 클래스 계층 구조(구글링 이미지 참조)
// NullPointerException : 클래스가 없는 경우

/*
 * 예외 처리 Exception try-catch-finally, throws, 사용자 정의 예외
 * 
 * 
 * 
 * 자바는 프로그램 실행중에 발생할 수 있는 예외 처리문을 제공한다.
 * 
 * 자바의 예외 처리는 예외가 발생한 메서드 내에서 직접 처리하는 방법과 예외가 발생한 메소드를 호출한 곳으로 예외 객체를 넘겨주는 방법,
 * 그리고 사용자 정의 예외를 생성하여 처리하는 방법이 있다.
 * 
 * try{
 *
 *  예외 발생 가능성이 있는 문장들;

 * }catch(예외 타입1 매개변수명){

 *  예외타입1의 예외가 발생할 경우 처리 문장들;

 * }catch(예외 타입 n 매개변수명){

 * 예외타입 n의 예외가 발생할 경우 처리 문장들;

 * }finally{
   }
 * 
 */