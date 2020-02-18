package step02_연산자;
/* 아스키코드 = 7비트 정보교환용 코드 2**7 개의 자료표현
 * A : 65, a : 97   \n : 13
 */


public class AsciiCode {

	public static void main(String[] args) {
		System.out.println("A : " + (int)'A'); // (int)'A' : 문자 A가 숫자로 나올 수 있게 바꾸어 달라.
		System.out.println("a : " + (int)'a'); // (int)'A' : 문자 A가 숫자로 나올 수 있게 바꾸어 달라. / 괄호안에 자료형 => 캐스팅(casting) / 자료형 => 숫자, 문자가 저장될 수 있는 기억공간 (ex : class => 자료형)
		System.out.println("\\n : " + (int)'\n'); // (int)'A' : 문자 A가 숫자로 나올 수 있게 바꾸어 달라. => 자료의 형변환 
		
		System.out.println(65 + " : " + (char)65);
		System.out.println(65 + " : " + (char)97); // 자바에서 수식을 계산하는 중이거나 대입하거나 출력할 떄 원래 정의된 자료형을 변환해서 처리하는 것을 의미하는 것으로 캐스팅 연산자라 한다.(자료의 형변환)
	
		System.out.println("------------------------");
		
		System.out.println('A'+1); // char + int = int // Ctrl + Shift + x => 대소문자 변환
		System.out.println((char)('A'+1)); // 대소문자 별환할 때 사용
		
		System.out.println(('a'-32));
		System.out.println((char)('a'-32));
		
		System.out.println('A'+'B'); // char + char = int;
	}

}
