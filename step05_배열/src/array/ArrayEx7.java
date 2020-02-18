package array;
// 가변 배열 : 행이나 열이 가변적인 배열, in Java, 수시로 바뀌는게 가변(x), 사이즈가 서로 다를 수 있다. 
public class ArrayEx7 {

	public static void main(String[] args) {

		int[][] num = new int[3][4]; { // int의 배열 이름, 변수명, []의 갯수(n) = n 차원
			// 비어있는 공간에 값을 넣으면서 크기도 결정
		num[0]  = new int[] {10,20};// 3차원인 경우(차원을 추가할 때 마다) [] 추가 // 3 x 4로 기억공간을 설정하더라도 값에 의해 기억공간이 설정
		num[1] = new int[] {30,40,50,60};
		num[2] = new int[] {70,80,90};// 확장을 해나가는 방식
		} // ** 객체 자료형으로 만들어서 생성 when 데이터베이스로 데이터를 받아들일 때
		// 3 x 4로 기억공간을 설정하더라도 값에 의해 기억공간이 설정
								  
		for(int i = 0; i<num.length; i++) { // 행의 갯수 계산, 외부의 for문이 행 순회
			for(int j = 0; j<num[i].length ; j++) { // 시작 주소 리턴, 배열의 전체가 넘어옴, 참조 자료형(참조 주소 = 시작 주소) / **배열의 이름 = 배열의 전체의 값을 의미(향상된 for문 참조?), 내부의 for문은 열 순회
				// num[0].length : num의 0의 행 길이	
				System.out.print(num[i][j] + "\t"); // \t : tab 간격만큼 띄움.
								  }
			 System.out.println();
			}
		}
}

// 차원을 몇 차원으로 할 것인가?
// ArrayEx6, ArrayEx7(더 많이 사용) : 배열의 선언방식(n차원)
