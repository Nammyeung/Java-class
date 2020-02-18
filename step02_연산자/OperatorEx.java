package step02_연산자;

public class OperatorEx {

	public static void main(String[] args) {
		
		// 변수의 초기화
		String a = null; // default로 초기화 a = null의 상태, 아무것도 없는 상태, String => class, class는 초기화 가능 / String a = ""; => 기억공간을 넣고 데이터를 할당하지 않는.
		int b = 0; // 초기화는 출력을 해야하는 경우 반드시 전제되어야 한다.
		float c=0.0f;
		char d = '\0'; // 널문자
		
		System.out.println(a+ " " + b + " " + c + " " + d);
//		char code = '남';
//		String gender;
//		
//		gender = (code == 'M' || code == '남')?"man":"woman"; // 3항 연산자
//		System.out.println("성별 : " + gender);
//		boolean ck = true;// 전등 스위치가 => flag, 상태를 표시 / 1byte짜리 flag / // | | | | | | | => 2^8, 8개 정도를 표현해서 조합, 기계 혹은 전자제품, 경우의 수 256개를 꽉꽉 채우는 경우도 있음. 
//		System.out.println(!ck);
		
//		if(code=='M' || code=='남') {
//			System.out.println("멘");
//		}
		
//		
//		  int k = 5; // 화면 메모리 System.out.println(k++); // 5 6 * 화면에 나오는 것과 다를 수 있는 값을
//		  주의 System.out.println(++k); // 7 7 System.out.println(k); // 7 7
//		  System.out.println(--k); // 6 6 System.out.println(k--); // 6 5 * 화면에 나오는 것과
//		  다를 수 있는 값을 주의
//		  
//		  int p = 3; p += 2; // p = p+2 / 대입연산자(우변의 값을 좌변에 대입, 좌변에 항상 변수가 와야) p *= 3;
//		  // p = p*3 p -= 2; // 13 p %= 3; // 나머지 1
//		  
//		  System.out.println(p);
//		 
//		
//		
//		
//		  int score = 57; boolean sw = (score >= 70 && score < 90); // 플래그의 개념이 강하다.
//		  
//		  System.out.println(sw);
//		 
		
		
//		
//		  System.out.println(5/3); // 5/3 = 1 몫이 결과 값으로 System.out.println(5%3); // 2
//		  나머지가 결과 값으로
//		  
//		  int a = 5;
//		  
//		  System.out.println(a==5); // a가 5인가? => true
//		  
//		  System.out.println(a>=5); // a가 5보다 크거나 같은가 System.out.println(a!=5); // a가
//		  5가 아닌가? 네 true 아니오 false
//		  
//		  String str = "korea"; System.out.println(str == "korea" || str == "KOREA");
//		  // 이 문장의 특성은 왼쪽이 true가 나오면 뒤에는 수행을 하지 않음. // && 연산이면 둘 다 체크 => 앞의 것이 false가
//		  나오면 뒤에는 체크를 하지 않음.
//		  
//		  int score = 57; System.out.println(score >= 70 && score < 90);
		 	
		
		// 결론 : 연산자는 잘 볼일이 없어서 빨리 넘어감...
	}

}
