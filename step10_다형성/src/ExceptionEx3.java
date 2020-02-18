package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//checked exception, Source코드에서 체크가 가능한 상태
public class ExceptionEx3 {
	String str;
	public ExceptionEx3() {
		input();
	}
	public void input()  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열을 입력하세요 : ");
		try {
		str = br.readLine();
	    } catch (IOException e) {
//	    	try {
//	    		str = br.readLine();
//	    	    } catch (IOException el) {
//	    	    	el.printStackTrace(); // br.close();
//	    	    }
	    	e.printStackTrace(); // br.close();
	    	}
	    }

	public void output() {
		System.out.println("결과 : " + str);
		}
	
	public static void main(String[] args) {
		new ExceptionEx3().output();

	}
	}


// Error가 뭐가 발생했는지 알아볼 것.

/*Checked Exception

Checked Exception은 

Exception처리코드 여부를 compiler가 check

 - 없으면 컴파일 에러!!

=> 프로그램 실행 흐름상 예외 발생 가능성있는 상황을 표현.(로직상 나올 수 있는 상황)

=> Code상의 문제가 아니라, 실행상황에 따라 발생가능성 있는 예외.

=> 프로그램 구현 흐름상 발생할 수 있는 예외.


 */
