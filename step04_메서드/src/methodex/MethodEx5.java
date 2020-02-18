package methodex;

public class MethodEx5 {

	public static void show1() { // call by name
		System.out.println("안녕하세여");
		return; // return은 생략가능, return이 특정 값을 남겨야 하는 자료형을 가지고 있을때는 오류(void 이외)
				// 생성자 쪽으로 가면 void 부분이 아예 없어짐.
		
	}
	
	public static void show2(char c, int i) { // char c, int i => 매개변수 (식매개변수)
		System.out.println("타입 : " + c);
		System.out.println("코드 : " + i);
	}
	
	public static String show3() {
		return "hello";
	}
		
	public static float show4(int a , int b , int c) {
		return ((a + b + c) / 3.0f); // float((a + b + c) / 3.0f) / float(a + b + c) / float(3.0)f
	}
	
	public static void main(String[] args) { // 배열로 지정되면, 참조에 의한 전달 : 원본 데이터(메모리에 있는 데이터)에 엑세스 할 수 있는 방식
	// 메소드는 메인 함수 혹은 함수 안에서 호출
		show1();
		show2('A', 25); // show함수의 매개변수로 'A'와 25를 전달하라. 'A', 25 : 형식 매개변수 /
		String s = show3(); // 자동 형변환이 안되는 경우에는 강제로 형변환을 해줘야/ instanceof : 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해
		// instanceof를 이용한 연산결과로 true를 얻었다는 것은 참조변수가 검사한 타입으로 형변환이 가능하다는 것을 뜻합니다.

		System.out.println("리턴값 : " + s);
		
		float k = show4(14, 45, 73);
		System.out.printf("리턴값 : %.2f\n", k);
		
		
	}
}

/*정수 리터럴(코드 에디터에 직접 적은 문자를 리터럴이라고 합니다) 127은  자동으로 byte, int로 형변환이 되는데 소수 리터럴 3.14는 왜 명시적으로 3.14f를 처럼 해 주어야만 하는가?
 * 
 * 십진수 소수를 이진수 소수로 저장하는 과정에서 오차가 발생할 수 있고, 자료형 자체에 오차에 대한 정확도를 포함하고 있기 때문이라고 생각합니다.

3.14의 소수부분 0.14는

0 x 1/2(2^-1) + 0 x 1/4(2^-2) + 1 x 1/8(2^-3) + 0 x 1/16(2^-4) + 0 x 1/32(2^-5) + 1 x 1/64(2^-6) ...

와 같은 방법으로 연산 및 저장이 되는데, 이를 어느정도 정밀하게 하느냐가 float과 double에서 차이가 납니다.

그렇기 때문에 소수 리터럴은 명시적으로 f를 붙여야만 float으로 인식되는게 아닐까 싶습니다:)

show4 => (a+b+c) / 3.0f ;
숫자를 키보드로 입력하면 문자열 => 숫자인지 검사 ("123") / 검사 float or double 정수 => 실수 변환가능 / error 숫자 발생
*/
