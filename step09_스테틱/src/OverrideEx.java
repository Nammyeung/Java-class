package ovverride;

class Test1{
	public void view1() {System.out.println("view11 method");} // ��µ��� ����.
	public void view3() {System.out.println("view3 method");}
}

class Test2 extends Test1 {
	// @Override // ������̼�
	public void view1() {System.out.println("view133 method");} // Override�� ���� ���
	public void view2() {System.out.println("view2 method");}
}

public class OverrideEx {

	public static void main(String[] args) {
		Test1 ob = new Test2(); //�θ�Ŭ������ ���������� �ڽ� ��ü ���� => ** ���� ���ε� **
		ob.view1();
		ob.view3();		//ob.view2(); // Override�� �������� ���ٰ� �ν�
		
		
		//		Test2 ob = new Test2();
//		ob.view1(); // view1, 2, 3 ���δ� ����
//		ob.view2();
//		ob.view3();

	}

}

// �������̵� : �θ�� �ڽ� ���� �Ȱ��� ���·� �����ϴ� ��
// ���� ���ε� : �θ� �ڽ��� �����ϴ� ���
// ���� ����� ������ ���ư��� ���� ������ �ٸ���.

// ���� ���ε� vs ���� ���ε� (****************�ſ� ����******************
