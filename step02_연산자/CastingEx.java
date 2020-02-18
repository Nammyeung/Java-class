package step02_연산자;

public class CastingEx {

	public static void main(String[] args) {
		
		int pay = 857650;
		double tax = 0.033;
		//int tax = (int)1.033 / int : 작은 기억공간 / double : 큰 기억공간 / 형변환은 좌변을 기중으로 우변을 변환
		// 좌변과 우변이 일치되도록 만들어 줄 것.
		
		int rPay = pay - (int)(pay*tax); // 정수 - 정수*실수 / Casting의 기본 : 좌변과 우변을 일치시켜야
		
		System.out.println("실 수령액 : " + rPay);
		
		/*
		int k = 87, e = 88, m = 75;
		int tot = k+e+m;
		//double avg = tot/3; // (실수/정수) => 정수 / 정수로 나눈값을 double형으로 넣어서 83.0
		double avg = (double)tot/3.0;
		
		
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg );
		
		byte a = 100; // 2^8승개 표현 => -128 ~ 127(0포함) 표현
		int b = a; // 64 32 16 8 4 2 1 / 자동 형변환
		
		double c = 73.45;
		int d = (int)c;			//강제 형변환
		
		System.out.println(a + "  " + b); // 상위의 자료형(기억공간)으로 캐스팅을 한다.
		System.out.println(c + "  " + d);
	    */
	
	}

}
