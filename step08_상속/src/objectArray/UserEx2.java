package objectArray;

public class UserEx2 {

	public static void main(String[] args) {
		User[] ob = new User[3]; // �迭�̹Ƿ� ������ ȣ�� x
		int[] num = new int[3];
		ob[0] = new User("kim", "010-123-4567");
		ob[1] = new User("lee", "010-456-7890");
		ob[2] = new User("park", "010-777-8080"); // ��ü 3�� ����
		
		for(int i = 0 ; i < ob.length;i++) {
			System.out.println(ob[i].getName() + "\t" + ob[i].getPhone());
		}
		
	}

}

// ob [] => [] 0 [] 1 [] 2 => [][] 0 [][] 1 [][] 2
//							  0 1    0 1    0 1
// ob.length = 3