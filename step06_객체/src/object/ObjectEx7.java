package object;

import java.util.Scanner;

/* *** 사다리 꼴의 넓이 구하기 ***
 * 밑변을 입력하세요 : 5
 * 윗변을 입력하세요 : 4
 * 높이을 입력하세요 : 3
 * 
 * 넓이 : 13.5
 * 
 * 한 번 더 계산할까요?(Y/y) n
 * *** 수고하셨습니다. ***
 * 
*/

public class ObjectEx7 {

	public static void main(String[] args) {
		Trapezoid tz = new Trapezoid();
		char ans;
		// 스캐너
		Scanner sr = new Scanner(System.in);
		do {
			//입력처리
			System.out.println("*** 사다리꼴의 넓이 구하기 ***");
			System.out.print("밑변을 입력하세요 : ");
			int base = sr.nextInt();
			System.out.print("윗변을 입력하세요 : ");
			int top = sr.nextInt();
			System.out.print("높이을 입력하세요 : ");
			int height = sr.nextInt();
			//do-while
			tz.setTrapezoid(base, top, height);
			System.out.println("\n");
			//계산처리
			System.out.println(tz.toString());
			System.out.println("\n");
			System.out.println("한 번 더 계산할까요?(Y/y) ");
			//재수행?
			ans = sr.next().charAt(0);
			//조건검사
//			if(ans == 'y' || ans == 'Y') {
//					continue;			
//			} else if(ans == 'n') {
//					break;
//			}
		} while(ans == 'y' || ans == 'Y');
		System.out.println("\n*** 수고하셨습니다 ***");
		sr.close();
	}
}

// 변수 : 동작과 상태
// *************결과**************
/*// 스캐너, 변수선언
 * int base, top, height;
 * char yn;
 * Scanner sc = new Scanner(System.in);
 * Trapezoid tz = new Trapezoid();
 * 
 * 
*//*// do-while
 * do {
 * 	// 입력처리
 * System.out.println("*** 사다리꼴의 넓이 구하기 ***");
 * System.out.print("밑변을 입력하세요 : ");
 * base = sc.nextInt();
 * System.out.print("윗변을 입력하세요 : ");
 * top = sc.nextInt();
 * System.out.print("높이를 입력하세요 : ");
 * height = sc.nextInt();
 * 
 * tz.setTrapezoid(base, top, height); // 값이 위의 변수로 전달
 * System.out.println(tz.toString());  // toString => 결과, 넓이 구하기
 * 
 * System.out.print("한 번 더 계산할까요?(Y/y) ");
 * //반복처리
 * yn = sc.next().charAt(0);
 * } while(yn == 'Y' || yn == "y"); // 조건 검사

* sc.close(); // 
* 
* System.out.println("*** 수고 하셨습니다 ***");
* 
* // 네트워크 프로그램에서는 sc객체가 항상 열려있어야 대화가 지속적으로 유지될 수 있다.
* 
* 
*/
