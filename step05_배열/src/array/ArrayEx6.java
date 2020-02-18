package array;
// 2차원 배열
public class ArrayEx6 {

	public static void main(String[] args) {

		int[][] num = new int[][] {
								  {10, 40, 70, 100}, // 10 | 40  | 70 | 100         리스트로 많이 넘어가지만 데이터의 사이즈가 결정되어 있으면 배열 사용
								  {20, 50, 80, 110}, // -  | -   | -  | -
								  {30, 60, 90, 120}  //	-  | -   | -  | -
								  };                 //    |     |    |
								  // 3행 4열, 마지막에는 ','를 적지 않음
		for(int i = 0; i<num.length; i++) { // 행의 갯수 계산, 외부의 for문이 행 순회
			for(int j = 0; j<num[i].length ; j++) { // 시작 주소 리턴, 배열의 전체가 넘어옴, 참조 자료형(참조 주소 = 시작 주소) / **배열의 이름 = 배열의 전체의 값을 의미(향상된 for문 참조?), 내부의 for문은 열 순회
				// num[0].length : num의 0의 행 길이	
				System.out.print(num[i][j] + "\t"); // \t : tab 간격만큼 띄움.
								  }
			 System.out.println();
			}
		}
}
