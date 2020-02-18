package inheritance;

//Object
//[toString] <-
// Override�� �ȵƴµ� Override�� �Է��ϸ� ������ �޼����� ����.
class SuperEx{
	public void show() {
		System.out.println("show1 method");
	}
}
// �θ�Ŭ�������� �ڽ�Ŭ������ ������ ����(���� ���ε� ���), ��Ģ�����δ� �θ� �ڽĿ��� ������ �� ����.(�ϻ� ex - �θ� �ڽĿ��� ���� ��� => �ڽ��� �԰� ´)
class SubEx extends SuperEx{
	@Override // toString���� �� ��
	public void show() {
		super.show(); // �θ�Ŭ������ ����
		System.out.println("show2 method");
	}
	
}
// �θ� : Super class, �ڽ� : Sub class

/* ���� ���̵� (Override)
 * 
���� ���̵� : ���� Ŭ������ �����ϴ� �ʵ峪 �޼ҵ带 ���� Ŭ�������� �������Ͽ� ����� �� �ִ�.

���� ���̵��� ���� ���� Ŭ������ ������ ���� super Ű���带 ����Ѵ�.

Tip. �������̵��� ���� �ʵ峪 �޼ҵ带 ������ �� �ٷ� �� ��ܿ� @Override ������ �־��ָ� ��Ÿ�� ������ �� �ִ�. 

(���� Ŭ������ �������� ���� �޼ҵ带 �������̵� �Ϸ����ϸ� ������ �������� ���� �߻�)

*/

public class InheritanceEx1 {

	public static void main(String[] args) {
		SubEx ob = new SubEx();
		ob.show(); // �ڽ����� ��ü�� ���������� �θ� ������ �޼ҵ带 ������ ����� �� �ִ�.

	}

}



//class SuperEx{
//	public void show1() {
//		System.out.println("show1 method");
//	}
//}
//
//class SubEx extends SuperEx{
//	public void show2() {
//		System.out.println("show2 method");
//	}
//	
//}
//// �θ� : Super class, �ڽ� : Sub class
//
//
//
//
//
//public class inheritanceEx1 {
//
//	public static void main(String[] args) {
//		SubEx ob = new SubEx();
//		ob.show1(); // �ڽ����� ��ü�� ���������� �θ� ������ �޼ҵ带 ������ ����� �� �ִ�.
//		ob.show2();
//	}
//
//}

// ��� - []����Ŭ������ ���� <- []
//�θ� �װ��� �ڽĵ��� �θ��� ���� ������ < ������ ����
// �θ� Ŭ������ ������ �� �ִ� ������ 
// 1. ��� - �޼ҵ带 �������̵�