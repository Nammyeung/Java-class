package methodex;
// call by name
public class MethodEx1 {
	
	public static void view() {
		System.out.println("hello");
		return;  // 함수의 끝에는 항상 리턴(return)이 있고 생략가능(void 타입일때만)
		
	}
	
	public static void star() { // void는 실행하는 결과값과 관련 / star(), 괄호[()]가 안나오면 함수가 아니다.
		System.out.println("*****");
	}
	
	public static void main(String[] args) {
		// 함수 = function = 프로시져  => 메소드  
		view(); // 함수 호출(메소드)  view() => view 메소드로 이동 => 메소드 내부의 명령을 실행
		star(); // star() 호출 => 위 과정 바복
		view();
	
	}

}

// void : return 타입이 없다. string readline()
// 키, 마우스 이동 : event = 메세지를 전달한다. => eventless 
// 중첩클래스 : 클래스를 두 번 이상 사용? => 프로그램 동작에 좋지 않은 영향을 미침.