package objectArray;

public class UserEx3 {

	public static void main(String[] args) {
		User[] ob = new User[] {new User("kim", "010-123-4567"),
				new User("lee", "010-456-7890"), new User("park", "010-777-8080")
		}; // 선언과 함께 값을 초기화
		// 기억공간의 갯수가 명확하게 나온 경우에만 사용함.
		
		// int[] num = new int[] {1,2,3,4,5};
		
		for(User m:ob) {
			System.out.println(m.getName() + "\t" + m.getPhone());// 앞의 변수의 자료형을 일치 시켜야
		} // 주석공간의 자료형이 아닌 기억공간의 데이터가 들어가므로 User의 자료형이 선언되어야 함.
		
//		for(int i = 0 ; i < ob.length;i++) {
//			System.out.println(ob[i].getName() + "\t" + ob[i].getPhone());
//		}
		
	}

}

// ob [] => [] 0 [] 1 [] 2 => [][] 0 [][] 1 [][] 2
//							  0 1    0 1    0 1
// ob.length = 3 (각각의 기억공간을 가리킴)