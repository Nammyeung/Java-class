package methodex;

public class MathodEx2 {
	public static int view1() { // void ��ſ� int ������ ó���ؾ� �ؼ� => ������ ������ �� �ִ� ������ ����.(���̽� ���� x)  (2)
		return 10; // (3)
	}
	
	public static char view2() {
		return 'A' ;
	}
	
	public static float view3() {
		return 50.3f ; // float �ڷ��� => f ���̱� ���ŷο� double�� ���� ��.
	}
	
	public static String view4() {
		return "hello";
	}
	
	public static double view5() { // ��κ��� �Լ��� ����µ��� ����
		return 100.4;
	}
	public static boolean view6() { // boolean => �Ǵ��� �ؾ��ϴ� ���, �ϳ��� �Լ� �ȿ� �и�, Ư���� flag�� ����
		return false;
	}
	
	
	public static void main(String[] args) {
		int a = view1(); // ����� �ȵ����� 10�� ���� ������ ����
	//     (4)      (1)
		System.out.println(a); // (5) / �Լ� �������
		char b = view2(); System.out.println(b);
		float c = view3(); System.out.println(c);
		System.out.println(view3());
		System.out.println(view4()); // �Լ��� ������ ������ �и� "hello" => view4() (����)
		System.out.println(view5());
		System.out.println(view6());

	}
}
