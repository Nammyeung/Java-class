package methodex;

/* -- 출력
  총점 : 253점:
  평균 : 84.33점
  학점 : B
  결과 : 합격
----------------
 학점 : switch 이용하여 구하기 a b c d e f
 결과 : if ~ else		F면 불합격 아니면 합격을 리턴 

*/

public class MethodEx4 {

	public static int total(int k, int e, int m) { // return을 하고자 하는 값이 정수
		
		return k + e + m; // 호출한 곳으로 값을 가지고 되돌아감(return함), void일 때는 생략가능, 제어의 이동(brace가 끝나면 닫히는 걸로 약속)
	}
	
	public static double avg(int tot) { // total의 결과값을 전달 위의 함수를 호출할 것임.
				
		// avg(total(10, 10, 10)); / total(10,10,10) => 하나의 값(매개변수)
		return tot / 3.0;
		
	}
	
	public static char grade(double av) {
		//switch문 사용하기
		char gd; // return하고자 하는 변수를 선언하는 것이 좋다.
		switch((int)((av / 10))) { // /는 몫, %는 나머지 값.
		case 10 : gd = 'A' ; // case의 수행에 return을 넣으면 안된다. case 9 : return (x)
		break;
		case 9 : gd = 'B' ;
		break;
		case 8 : gd = 'C' ; 
		break;
		case 7 : gd = 'D' ; 
		break;
		case 6 : gd = 'E' ; 
		break;
		default : gd = 'F' ;
		
		}
	return gd;
	}
		
	/*	switch((int)((av / 10))) {
	 * case 10 : return 'A'; / break가 필요없는 이유 : break는 switch문을 빠져나가기 위해 사용하는데 return하면 그 함수 자체를 빠져나가기 때문입니다.
	 * case 9 : return 'B';
	 * case 8 : return 'C';
	 * case 7 : return 'D';
	 * case 6 : return 'E';
	 * default : return 'F'; }
			
	*/	
	
	public static String result(char gr) {
		//합격,불합격 리턴하기
		if (gr == 'F') { // 문자에 대하여 범위를 정하는 것을 권장하지는 않음, 문자가 아스키코드로 되어있어 가능은 함.
			return "불합격";
		} else {
			return "합격";
		}
	}
	
	public static void main(String[] args) {
		int k = 95, e = 85, m = 73;
		System.out.println("총점 : " + total(k, e, m)); // 데이터의 양이 많아지면 함수를 통해 연산과정을 설정해 놓고 메인에서 처리 / 유지보수의 편의를 위해
		System.out.printf("평균 : %.2f\n", avg(total(k, e, m))); // total을 세 번 쓸 것 같으면 변수를 하나 더 많들어주는 것이 성능에 좋다.(최대한 연산을 하지 않고 한 번 한 연산은 저장공간에 넣어두도록)
		System.out.println("학점 : " + grade(avg(total(k, e, m))));
		System.out.println("결과 : " + result(grade(avg(total(k, e, m)))));
		
		
	}

}




