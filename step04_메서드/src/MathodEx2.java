package methodex;

public class MathodEx2 {
	public static int view1() { // void 대신에 int 정수를 처리해야 해서 => 정수를 리턴할 수 있는 형식을 지정.(파이썬 지정 x)  (2)
		return 10; // (3)
	}
	
	public static char view2() {
		return 'A' ;
	}
	
	public static float view3() {
		return 50.3f ; // float 자료형 => f 붙이기 번거로워 double을 많이 씀.
	}
	
	public static String view4() {
		return "hello";
	}
	
	public static double view5() { // 대부분이 함수를 만드는데서 시작
		return 100.4;
	}
	public static boolean view6() { // boolean => 판단을 해야하는 경우, 하나의 함수 안에 분리, 특정한 flag를 리턴
		return false;
	}
	
	
	public static void main(String[] args) {
		int a = view1(); // 출력은 안되지만 10의 값을 가지고 있음
	//     (4)      (1)
		System.out.println(a); // (5) / 함수 실행순서
		char b = view2(); System.out.println(b);
		float c = view3(); System.out.println(c);
		System.out.println(view3());
		System.out.println(view4()); // 함수가 별도로 있으니 분리 "hello" => view4() (전달)
		System.out.println(view5());
		System.out.println(view6());

	}
}
