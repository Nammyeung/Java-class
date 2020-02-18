package interfaceex;

interface Shape{ // �渳�� ������ �ƴϹǷ� public�� ����
	//-------------------------------------------------
			/* final */int r = 10; // final, abstract ������ ������ ū �ǹ̸� ������ ����
			/* abstract */public void draw() ; // ������ ������ �� ������ ���ָ� �ȴ�.
			/* abstract */public void erase() ; // 
	//-------------------------------------------------
		}
	// �Ʒ��� �� �ٸ� Ŭ������ ���� ��������� ��츦 ����� ��.
		class Circle implements Shape{
			@Override
			public void draw() {	// ���� ������
				System.out.println("�������� " + r + "�� ���� �׸��� ");
			}
			@Override
			public void erase() {	// ���� ������
				System.out.println("���� �����");
			}
		}

		public class InterfaceEx1 {

			public static void main(String[] args) {
				Circle cir = new Circle();
				cir.draw();
				cir.erase();
				
			}
		}
			
// ��� ���� �κе� ������ ��
				
//-------------------------------------------------�߻�(�̿ϼ�) Ŭ����
//abstract class Shape{
////-------------------------------------------------
//		final int r = 10;
//		abstract public void draw() ; // �̿ϼ� ����
//		abstract public void erase() ; // ���Ǹ� ��Ÿ���� brace({}) ����.
////-------------------------------------------------
//	}
//// �Ʒ��� �� �ٸ� Ŭ������ ���� ��������� ��츦 ����� ��.
//	class Circle extends Shape{
//		@Override
//		public void draw() {	// ���� ������
//			System.out.println("�������� " + r + "�� ���� �׸��� ");
//		}
//		@Override
//		public void erase() {	// ���� ������
//			System.out.println("���� �����");
//		}
//	}
//
//	public class InterfaceEx1 {
//
//		public static void main(String[] args) {
//			Circle cir = new Circle();
//			cir.draw();
//			cir.erase();
//
//		}
//
//	}

//------------------------------------------------�Ϲ� Ŭ����
//class Shape{
////-------------------------------------
//	final int r = 10;
//	public void draw() {};
//	public void erase() {};
////-------------------------------------
//}
//// �Ʒ��� �� �ٸ� Ŭ������ ���� ��������� ��츦 ����� ��.
//class Circle extends Shape{
//	@Override
//	public void draw() {
//		System.out.println("�������� " + r + "�� ���� �׸��� ");
//	}
//	@Override
//	public void erase() {
//		System.out.println("���� �����");
//	}
//}
//
//public class InterfaceEx1 {
//
//	public static void main(String[] args) {
//		Circle cir = new Circle();
//		cir.draw();
//		cir.erase();
//
//	}
//
//}

// java.lang.Object - �ڹ� �ֻ��� Ŭ����
//		http://blog.daum.net/question0921/231
		