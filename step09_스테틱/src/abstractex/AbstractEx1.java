package abstractex;

//---------------------------------------------------------------- 3 // ���� ����� Ctrl + Shift
abstract class AA{ // �߻�(�̿ϼ�)Ŭ����, *������ ����*���� �����ϸ� ������ �� abstract���� ������ ������ �ش� Ŭ���������� ��ü�� �������� �ʴ´�.
	public void view1() {}; // ����
	
	public void view2() {System.out.println("view2 method");}
}
class BB extends AA{ // Ŭ���� �̸����� �ǹ̸� �ο��� ��
	@Override
	public void view1() {System.out.println("view11 method");}
	//AAŬ������ view1() ������- �������� ����.
}

public class AbstractEx1 {

	public static void main(String[] args) {
		//AA ob = new AA(); // ��ü ���� �Ұ���
		
		
		AA ob2 = new BB(); // ob2�� ���������� ����� �ļհ�ü ����
		ob2.view1();
		ob2.view2();

	}

}

//----------------------------------------------------------------- 2

//abstract class AA{ // �߻�(�̿ϼ�)Ŭ����
//	abstract public void view1(); // ����
//	public void view2() {System.out.println("view1 method");}
//}
//class BB extends AA{ // Ŭ���� �̸����� �ǹ̸� �ο��� ��
//	@Override
//	public void view1() {System.out.println("view11 method");}
//	//AAŬ������ view1() ������- �������� ����.
//}
//
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
//		//AA ob = new AA(); // ��ü ���� �Ұ���
//		
//		
//		AA ob2 = new BB(); // ob2�� ���������� ����� �ļհ�ü ����
//		ob2.view1();
//		ob2.view2();
//
//	}
//
//}

//------------------------------------------------------------------ 1
//class AA{ // �Ϲ� Ŭ����
//	public void view1() {System.out.println("view1 method");}
//	public void view2() {System.out.println("view1 method");}
//}
//class BB extends AA{ // Ŭ���� �̸����� �ǹ̸� �ο��� ��
//	@Override
//	public void view1() {System.out.println("view11 method");}
//	//AAŬ������ view1() ������- �������� ���� 
//}
//
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
//		AA ob = new AA(); // ��ü ���� ����
//		ob.view1();	// 1
//		ob.view2();	// 2
//		
//		AA ob2 = new BB(); // ob2�� ���������� ����� �ļհ�ü ����
//		ob2.view1();
//		ob2.view2();
//
//	}
//
//}

/* �߻� Ŭ������ ����ϴ� ����
 
�߻� Ŭ������ ����� �����ϱ� ���� ���̴�. �� �θ� Ŭ�������� �޼ҵ��� �ñ״�ó�� �����س��� �� �޼ҵ��� ���� ���� ����� �� �޼ҵ带 ��� ���� ���� Ŭ������ å������ �����ϰ� �ִ�. 
��� �ڵ带 �̷� ������ �ۼ��ϴ� ���� ���� �Ը��� ������Ʈ������ ���� ����. ������ ���ؼ� �߻� Ŭ������ �뵵�� �����غ���.
*/


