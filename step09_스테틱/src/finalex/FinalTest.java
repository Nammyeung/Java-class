package finalex;

class A{
	final int n=100; // final ������ ����� ���� ����̴�. => ���� ������ �� ����.
	final public void view() { // 
//		n=200; --final ������ ���� ������ �� ����.
		System.out.println("A class");
	}
	
}
class B extends A{
//	@Override
//	public void view() { // final �޼���� �������̵� �Ұ� => ���⼭ �������̵� ������ �����Ҽ� ���� ��.(������ �Ұ�)
//		
//	}
}


public class FinalTest {

	public static void main(String[] args) {
		

	}

}
