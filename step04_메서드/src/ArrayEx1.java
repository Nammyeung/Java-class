package array;
// 1차원 배열
// 배열 : 동일한 자료형의 연속된 기억공간 , 기억공간 => 메모리
// String name = "홍길동" / 0번째 방, 1번째 방, 2번째 방
public class ArrayEx1 {

	public static void main(String[] args) {
		int[] num = new int[5]; // 5개의 기억공간을 가지는 정수 배열 선언 / new 연산자 : 객체 생성 --- 참조 자료형 , 원본 데이터에 엑세스 할 수 있는 경우. ex) show1(95,85,73)
		num[0] = 10; // 다른 언어에서는 배열을 [] {} () 다른 괄호 모양으로 묶기도 한다.
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		for(int i = num.length-1 ; i >= 0 ; i--) {
			System.out.println(num[i]);
		}
		System.out.println();
		// 향상된 for문을 이용하여 출력하세요
		// 10 20 30 40 50
		
		for(int n : num) { // n => 기억공간 할당, 접근
			System.out.print(n + " ");
		}
		
	}

}

// 배열의 특성은 빠르다 / 자료형이 일치하기 때문에 자료형의 특성을 검사하는 과정이 빠져있기 때문에 / 파이썬, R의 리스트(서로 다른 자료형)는 속도가 상대적으로 느리지만 자료를 더 추가할 수 있다(공간을 늘릴 수 있음).
// 할당 = 변수선언 = 초기화 		|
// int[] a = new int[10];	| New 연산자가 하는 일 = 객체선언 = 참조자료형과 연결
// 기억공간 할당				|
// new 연관되는 데이터하고 연결		|