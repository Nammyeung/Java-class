package objectArray;

public class UserEx2 {

	public static void main(String[] args) {
		User[] ob = new User[3]; // 배열이므로 생성자 호출 x
		int[] num = new int[3];
		ob[0] = new User("kim", "010-123-4567");
		ob[1] = new User("lee", "010-456-7890");
		ob[2] = new User("park", "010-777-8080"); // 객체 3개 생성
		
		for(int i = 0 ; i < ob.length;i++) {
			System.out.println(ob[i].getName() + "\t" + ob[i].getPhone());
		}
		
	}

}

// ob [] => [] 0 [] 1 [] 2 => [][] 0 [][] 1 [][] 2
//							  0 1    0 1    0 1
// ob.length = 3