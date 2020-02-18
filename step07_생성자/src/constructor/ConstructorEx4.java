package constructor;

import java.util.Scanner;

/* 클래스명 : ConstructorEx4
 * x:int
 * y:int
 * 
 * +ConstructorEx4()	--입력처리 (스캐너)
 * +clac():int			--x*y 리턴
 * +display():void		--출력하기
 */
/* ****** 결과 ******
 * 가로를 입력 : 5
 * 세로를 입력 : 4
 * 
 * 사각형의 넓이 : 20
 */
public class ConstructorEx4 {
	int x;
	int y;	
	public ConstructorEx4() { // return 값을 정의 하느냐 안하느냐에 따라 생성자가 결정되므로 void를 넣었는지 제대로 보자.
		Scanner sr = new Scanner(System.in);
		System.out.println("가로를 입력 : ");
		x = sr.nextInt();
		this.x = x;
		System.out.println("세로를 입력 : ");
		y = sr.nextInt();
		this.y = y;
		sr.close();
	}
	// 언어가 굉장히 길어지는 경우에 선언을 하는 구간과 생성자를 통해 데이터를 연결시키는 구역을 구분지어양 유지보수가 편하지 않을까
	public int clac() {
		return x*y;
	}
	public void display() {
		System.out.println("가로를 입력 : " + x + "\n세로를 입력 : "
	+ y + "\n\n사각형의 넓이 : " + clac());
	}


	public static void main(String[] args) {
		new ConstructorEx4().display();
		
	}

}

/*
 * public ConstructorEx4() { // 생성자 자동 생성 단축키 Alt + Shift + s
 * 	Scanner sc = new Scanner(System.in);
 *  System.out.print("가로를 입력 : ");
 *  sc.nextInt();
 *  System.out.print("세로를 입력: " );
 *  sc.nextint();
 *  
 *  생선장사 - class(클래스) => 상태와 동작이 변화하는 구역
 *  (sell() - 파는 동작을 처리) => 동작(함수) 형성 => 공통된 동작(함수)는 공용으로 사용
 *  ---------------------------------------
 *  객체 생선장사   |	구매
 *  	고등어    |	고등어
 * 		오징어    |	밀감
 *  	꼴뚜기    |	(buy() - 동작을 처리)
 *  	상태 : 변수값
 *  ---------------------------------------
 *     과일장사	sell()
 *     사과		-10
 *     밀감
 *     오렌지
 *  ---------------------------------------
 *  new 과일장사 형성
 */  
