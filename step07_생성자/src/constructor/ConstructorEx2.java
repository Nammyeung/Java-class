package constructor;

public class ConstructorEx2 {
	public ConstructorEx2() { // 디폴트 생성자
		System.out.println("default constructor"); // 4
	}
///////////////////////////////	
	public ConstructorEx2(String str) {
		this(str, 10); // 2
		System.out.println(str + " constructor"); // 6
	}
////////////////////////////// 2번으로 넘어감(2번 주소 저장) => 2번에 해당 하는 생성자 모두 처리	
	public ConstructorEx2(String str, int n) { // 생성자이므로 클래스와 이름이 동일
		this();	// 3 디폴트 생성자 호출
		System.out.println(str+" "+ n + " constructor"); // 5
	}
		
	public static void main(String[] args) { // 복귀 주소 저장 공간 : 스택
		new ConstructorEx2("가나다", 10); // 1 항상 시작은 메인
		System.out.println("ooo"); // 7
	}

}

// ----------------------------------------------------------1
//public class ConstructorEx2 {
//	public ConstructorEx2() {
//		this("가나다", 10); //2 디폴트 생성자
//		System.out.println("default constructor"); // 6
//	}
//	public ConstructorEx2(String str) {
//		System.out.println(str + " constructor"); // 4
//	}
//	
//	public ConstructorEx2(String str, int n) { // 생성자이므로 클래스와 이름이 동일
//		this(str);	// 3 this에 연결된 과정을 모두 해결하고 아래를 처리 3~5(점프했다가 다시 돌아오기 위해서는 복귀(현재의 위치) 주소를 저장해놔야 함)
//		// this 생성자 호출, 클래스 안에서 자기 자신의 생성자를 호출하겠다.
//		// 추가적으로 this(x) this 생성자는 한 번만 호출.
//		System.out.println(str+" "+ n + " constructor"); // 5
//	}
//		
//	public static void main(String[] args) { // 복귀 주소 저장 공간 : 스택
//		new ConstructorEx2("가나다", 10); // 1 항상 시작은 메인
//		System.out.println("ooo"); // 6
//	}
//
//}

//복귀 주소 저장 공간 : 스택 (동전 [_]을 밀어넣으면 착착 쌓임, 마지막에 넣은 것이 먼저 튀어 나오는 구조

// ----------------------------------------------------------2
//  public class ConstructorEx2 {
//	public ConstructorEx2() {
//		System.out.println("default constructor"); // 4
//	}
//	public ConstructorEx2(String str) {
//		this(); // 3
//		System.out.println(str + " constructor"); // 5
//	}
//	
//	public ConstructorEx2(String str, int n) { // 생성자이므로 클래스와 이름이 동일
//		this(str);	// 2
//		// this 생성자 호출, 클래스 안에서 자기 자신의 생성자를 호출하겠다.
//		// 추가적으로 this(x) this 생성자는 한 번만 호출.
//		System.out.println(str+" " + n + " constructor"); // 6
//	}
//		
//	public static void main(String[] args) {
//		new ConstructorEx2("가나다", 10); // 1, 
//		System.out.println("ooo"); // 7
//	}
//
//}

// [] -> []  -> [] -> [] => 전부다 함수(4개) / 다시 호출
//	  <-	 <-	   <-    (다시 호출)
