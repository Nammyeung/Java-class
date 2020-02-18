package methodex;
// call by value : 복사에 의한 전달 / 얕은 복사, 깊은 복사
public class MethodEx3 {
	
	public static void show1(int a, char b, double c, float d) {// 호출한 곳에서 값을 전달, 기본자료형
		System.out.println(a + " " + b + " " + c + " " + d);
	}
	public static int show2(int a, int b, int c) {
		return a + b + c;
	}
		
	public static double show3(int a, int b, int c) {
		return (a + b + c) / 3.0; // 나누기 3(int), 3.0(double) 차이가 있음에 유의!
	}
	
	public static String show4(int a, int b, int c) {
		String result = (((a+b+c)/3) >= 60) ? "합격" : "불합격"; // 3항 연산자 활용
		return result; // return은 메소드 당 하나만 작성 
	}
	/*
	public static String show4(int a, int b, int c) {
		double av = (a + b + c) / 3.0 ;  //평균 계산
		String rs;
		if (av >= 60) {
			rs = "합격";  / return "합격"
		}else {
			rs = "불합격"  / return "불합격"
		}					//평균 검사
		return rs;	
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show1(10, 'A', 100.4, 50.3f);
		
		int sum = show2(95,85,73);
		System.out.println("합계 :  " + sum);
		System.out.println("합계 :  " + show2(95,85,73));
		
		double avg = show3(95, 85, 73);
		System.out.println("평균 :  " + show3(95,85,73));
		System.out.printf("평균 : %.2f\n", show3(95,85,73));
	
		String result = show4(95,85,73);
		System.out.println("결과 : " + result);
	}

}

/*
 * [------------]
 *  show1       |
    10			|
 	A           |  ---> 기억공간
 	100.4		|
 	50.3 		|*/

// br, isr => 객체 자료형 / 배열 자료형 num, color => 참조 자료형

/*
 * ※ 주의사항
 *
 * 1. 삼항연산자를 사용하여 코드의 라인이 줄어들었다고 컴파일 속도가 빨라지는 것은 아닙니다.
 * 
 * 2. 삼항연산자를 중복해서 처리할 경우, 가독성이 떨어질 수 있으므로 중복처리는 피하는것이 좋습니다.
 * 
 */