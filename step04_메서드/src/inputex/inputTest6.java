package inputex;
//BufferedReader - 읽어들이는 용도, 속도를 빠르게 처리해주는 역할을 한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BufferedReader, InputStreamReader - 게임에서 아이템을 먹는다던지 명령어를 받아들일때
public class inputTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		InputStreamReader isr = new InputStreamReader(System.in);// 객체 like isr : 사용자 정의 자료형
		BufferedReader br = new BufferedReader(isr); // isr => 매개변수 전달. / 키보드에서 입력한 개체를 bufferedReader로 만듦.
		int eno; // 초기화 - 자료형을 선언하는 것?
		String ename;
		char dept;
		double score;
		
		System.out.print("사원번호를 입력하세요 : "); // 프론트엔드, 백그라운드 구성해보면 줄바꿈 기능이 없는 것들을 많이 사용하므로 print문으로 바꾸는 것을 권장.
		eno = Integer.parseInt(br.readLine()); // parsing 과정 / 매개변수 o
		
		System.out.print("사원이름을 입력하세요 : ");
		ename = br.readLine(); // bufferedReader안의 readLine 메서드, 해당 메소드를 수행했을 때 결과가 문자형으로 나온다.
	    
		System.out.print("부서코드를 입력하세요 : ");
		dept = br.readLine().charAt(0); // 부서코드 입력하면 A\r\n 라인피드(줄바꿈)가 따라옴, 아스키코드에 두개가 분리되어있음.
				
		System.out.print("입사성적을 입력하세요 : ");
		score = Double.parseDouble(br.readLine());	
		
		System.out.println("사원번호 : " + eno);
		System.out.println("사원이름 : " + ename);
		System.out.println("부서코드 : " + dept);
		System.out.printf("입사성적 : %.2f점\n", score);
		
	}

}

/* 라인피드(LF : Line Feed) => 현재 위치에서 바로 아래로 이동

캐리지리턴(CR: Carriage return) => 커서의 위치를 앞으로 이동

printf("Line Feed \n");

printf("Carriage Return \r");

*/


