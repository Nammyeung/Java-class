package constructor;
//������ : Ŭ���� �̸��� ������ �޼����� ����, ���� �ڷ����� ����
//		��ü ���� ���
public class ConstructorEx1 {
	public ConstructorEx1() {  // public : ����������(�����ڿ����� �� ���� ����), ConstructorEx1() : �Լ�
		System.out.println("default constructor");
	} // ����� �̵��� �Ѵ�.
	public ConstructorEx1(String str) { // �����ڴ� return ��ü�� ����.(void) (2) => �Ű����� �ϳ�¥�� ������
		System.out.println(str + " constructor"); // (3)
	}
	public ConstructorEx1(String str, int n) {
		System.out.println(str + " " + n + " constructor");
	}

	public static void main(String[] args) {
		ConstructorEx1 ob = new ConstructorEx1(); // new ConstructorEx1() => �ش� �����ڸ� ���������� ������� ���� ��� ���� ������ ���� x 
		new ConstructorEx1("������"); // �����ڿ� �Ű������� ���� ��� (1)
		new ConstructorEx1("������", 10);
	}

}
