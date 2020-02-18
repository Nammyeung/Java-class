package methodex;

public class methodEX6 {
	
	public static int total (int toeic, int it) { // 지역변수, total 함수의 범위(해당 함수의 범위안에서는 toeic과 it의 사용을 허용, 인식), local variable
		toeic = 800; // call by back ***
		return toeic + it;
	}
	public static String rs (int total) { // return값이 문자열이 나온다, 매개변수의 변수명은 취향대로(int tot 가능) / tot = 815
				if(total >= 800) {
			return "합격";
		} else {
			return "불합격";
		}
	}
// 함수 정의 / 다른 언어 함수 선언이 존재, java에서는 함수 정의 >(포함된다) 함수 선언		
	public static void main(String[] args) {
		int toeic = 750, it = 65;
		
		System.out.println("입시총점 : " + total(toeic, it) + "점");
		System.out.println("입시결과 : " + rs(total(toeic, it)) + "입니다");
		//입사총점 : 815점
		//입사결과 : 합격입니다		--> 800이상 합격, 미만 불합격
		System.out.println(toeic); // 원본자료형에 엑세스를 하는 구조가 아니다.
	}

}

// 함수 정의 : 접근지정자, 리턴타입(void or int...), 함수명 (매개변수)
//			(1) 수행결과의 자료형 일치	(2) 상하위 매개변수 자료형 일치해야
// 함수 호출 : 함수이름(매개변수), 매개변수는 값 or 변수가 옴
//
// 답
// public static int total (int toeic, int it) { / main함수에 정수값이 선언된 것을 확인
// [     ] => total 함수 영역   [      ] => main 함수 영역
// 5장, 스택, 힙 영역
