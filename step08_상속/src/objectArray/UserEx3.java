package objectArray;

public class UserEx3 {

	public static void main(String[] args) {
		User[] ob = new User[] {new User("kim", "010-123-4567"),
				new User("lee", "010-456-7890"), new User("park", "010-777-8080")
		}; // ����� �Բ� ���� �ʱ�ȭ
		// �������� ������ ��Ȯ�ϰ� ���� ��쿡�� �����.
		
		// int[] num = new int[] {1,2,3,4,5};
		
		for(User m:ob) {
			System.out.println(m.getName() + "\t" + m.getPhone());// ���� ������ �ڷ����� ��ġ ���Ѿ�
		} // �ּ������� �ڷ����� �ƴ� �������� �����Ͱ� ���Ƿ� User�� �ڷ����� ����Ǿ�� ��.
		
//		for(int i = 0 ; i < ob.length;i++) {
//			System.out.println(ob[i].getName() + "\t" + ob[i].getPhone());
//		}
		
	}

}

// ob [] => [] 0 [] 1 [] 2 => [][] 0 [][] 1 [][] 2
//							  0 1    0 1    0 1
// ob.length = 3 (������ �������� ����Ŵ)