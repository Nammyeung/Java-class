package array;	//	  0      1      2     3
// $ java ArrayEx3 | abcd | 가나다 | 123 | 12345 / args의 0번째 방에 abcd가 있다. / [0]의 0번째 방에는 a가 있다 => 2차원 배열
public class ArrayEx3 {

	public static void main(String[] args) { // args / 배열 매개변수 / ping | 168.126.63.1 | -t
		System.out.println("args의 길이 : " +args.length); // 강호동(1), 104(2) / 저장공간의 길이인가? / 공백을 기준으로 분류
		
		for(int i = 0 ; i < args.length ; i++) {// 2차원 배열의 구조가 등장하게 됨.
			
			System.out.println("args[" + i + "] : " + args[i]); // length : 객체 / length() : 함수
			System.out.println("args[" + i + "]의 크기 : " + args[i].length()); // length : 객체 / length() : 함수
			
		}
		// ----------- 향상된 for문으로 출력해 보세요.
		for(String st : args) {
			System.out.println(st + "\n");
			System.out.println(st.length() + "\n");
		}
	}

}
