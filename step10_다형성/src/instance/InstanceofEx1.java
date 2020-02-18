package instance;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}

public class InstanceofEx1 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B(); // b������ �����ϰ� �ִ� �ν��Ͻ�
		D d = new D();
		// ���������� �����Ѵ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ���� ������(boolean ������ ���)
		System.out.println(b instanceof A); // b�� AŬ������ ���� �ִ°�?
		System.out.println(a instanceof C); // false(�����ִ����� �����̹Ƿ� ���� ���� ���� ���ӿ��ΰ� �ƴ� �� ���̰� ����)
		// System.out.println(b instanceof C); // error, b�� c�� �ƹ� ���谡 ���� ����ȯ �����̱� ������ error
		System.out.println(d instanceof A); // ����, ���ϴ°� OR �Ҽ��� �Ǵ°�?
	}

}
