package step02_연산자;

public class ParseInt {

	public static void main(String[] args) {
		String a = "100";	// 문자열 100
		String b = "200";	// 문자열 200
		
		int a1 = Integer.parseInt(a); //"100" --> 100으로 변환
		int b1 = Integer.parseInt(b); // parseInt => 키보드에 입력된 값을 숫자로 변환 /Python => int("15")
		
		
		
		System.out.println(a+b); // 문자열 데이터에 대해서 단항연산자를 사용할 수 없다.		/ + => 연결의 의미
		System.out.println(a1+b1); // 
		
		
	}

}
