package exception;
// 사용자 정의 예외처리
class MyException extends Exception{
	/*
	
	*/
	private static final long serialVersionUTD = 1L;
	
	public MyException() { // 1
		System.out.println("애들은 가라~");
	}
}	
public class ExceptionEx4 {

	public static void main(String[] args) throws MyException{
		int age = Integer.parseInt(args[0]);
		
		if(age<19)
		throw new MyException(); // 자동으로 만드는 경우 throws, 생성자를 호출 // 1
		else 
		System.out.println("어섭셔~");
	}

	}

/*3. try-catch -finally & throws & throw

try catch finally	  - 직접처리
1. 다음메소드에 던져줄 때, 명시해줘야한다. 나는 처리를 안하고 던져줄거다. 
    	 
throws	       - 간접처리 	
2. 이걸 명시해주지않으면, 예외가 있는지 없는지 모르니까 명시해 준다.

throw		        - 예외생성	 
Checked Exception에서 던져주는것 상위 메소드에다가 예외를 만들어서.

*/

