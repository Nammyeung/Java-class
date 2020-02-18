package exception;
// unchecked exception
public class ExceptionEx2 {

	public static void main(String[] args) {
		int[] num = {10, 20, 30};
		
		try {
		for(int i = 0; i < 5; i++) {
			System.out.println(num[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 개수가 맞지 않음 ");
		}
	}

}

/*Unchecked Exception

먼저, RuntimeException을 살펴보자. 

RuntimeException은 다시말하면, Unchecked Exception이라고 말할 수 있는데, 발생할 것 같은 예외를 체크해주지 않아서 

(즉, 프로그래머의 실수로인해서) 발생하는 실수이기 때문이다.

  => Code를 잘못 만들어서 생기는 문제. 

=> 업무의 흐름보다는 core(기본)적인 부분의 에러. 

//기본이 안되있는 코드. 

=> 컴파일 하는데는 문제가 없다. 실행하면 문제가 발생함. 

*/
