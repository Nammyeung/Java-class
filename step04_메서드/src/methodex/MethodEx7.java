package methodex;
// call by reference => 참조에 의한 전달, 참조 주소 전달(mapping이 되어있는 구조), 객체 자료형
// 객체 자료형에서 사용, 클래스, 열거형(나열), 배열, 인터페이스(클래스와 유사한 형태)
public class MethodEx7 {
		// 매개변수를 전달할때(like String[] args)
	
	public static void view1(String str) { // String str : 객체 자료형 => 원본 데이터에 엑세스 가능
		System.out.println("view1의 변경전 str:" + str); // [ str ] => "happy"
		System.out.println(str);
		str = "가나다";								// [ str ] => "가나다" 대임, 새로운 기억공간 생성
		System.out.println("view1의 변경후 str:" + str);
		
	}
	
	public static void view2(int[] num) {
		for (int n:num) {
			System.out.println("변경전 view2의 num: " + n); // 참조 자료형, 어느 위치든 값을 변경을 시키면 전체 영역에 영향 vs 정수 자료형
		}
		//System.out.println();
		num[2] = 300;
		for (int n:num) {
			System.out.println("변경후 view2의 num: " + n);
		}
		
	}
	//c언어 배열 --> 포인터, 포인터 --> 배열
	//	char* test[] --> 배열 포인터 / 결과적으론 똑같다.
	// char** test --> 2차원 배열 / c언어와 반대로 생각하면 된다.
	// (1) 포인터 배열
	// 포인터들의 배열, 배열의 요소가 포인터들로 이루어져 있다.
	// 선언방법 : char* arr[3];
	// 배열 요소의 자료형이 char* (포인터)인 배열
	
	public static void main(String[] args) {
		String str = "happy";
		System.out.println("호출 전 str: " + str);
		view1(str); // 함수 호출, happy 값이 넘어가는게 아니고 str 주소가 넘어감?
		System.out.println("호출 후 str: " + str);  // [ str ] => "happy", 객체 자료형의 경우 원본데이터에 엑세스하지 못하는 경우가 있다. 힙때문?
		System.out.println("---------------------------");
		int [] num = {10, 20, 30, 40, 50};
		for(int i : num) {
		System.out.println("호출 전 메인의 num: " + i);
		
		view2(num);
		
		}
		for(int i : num) {
		System.out.println("호출 후 메인의 num: " + i);
		}
	}
}
