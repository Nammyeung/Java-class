package methodex;


public class MethodEx8 {
		
	
	public static void view1() { 
		System.out.println("static method");
	}
	
	public static void view2(int[] num) {
		for (int n:num) {
			System.out.println("������ view2�� num: " + n); // ���� �ڷ���, ��� ��ġ�� ���� ������ ��Ű�� ��ü ������ ���� vs ���� �ڷ���
		}
		//System.out.println();
		num[2] = 300;
		for (int n:num) {
			System.out.println("������ view2�� num: " + n);
		}
		
	}
	
	public static void main(String[] args) {
		//Ŭ���� �޼���(class method) : ��ü ���� ȣ�� ����(static�� �پ��ִ�)
		MethodEx8.view1();
		view1(); // �ڱ��ڽ��� �ż��忡 �����Ҷ��� class�� ��������.
		
		
		//Ŭ������ ������Ʈ�� �ν��Ͻ�, Ŭ������ �ν��Ͻ��� ������Ʈ
				
		Math.random(); // Ŭ���� �޼��� ex, �ܺ��� MathŬ������ �����ͼ� ����ϱ� ������ Math.~~
		
		int 	a = 5; // 
		
		String	name = new String("ȫ�浿"); // �̷��� ����°� ������.
		
		MethodEx8 ob = new MethodEx8(); // ��ü ����, �ν��Ͻ��� ��üȭ ��Ų ���� ��ü(�ν��Ͻ�ȭ), new�κ� => ���� ���� �ϴ����� ����, ��ȣ�ȿ� ���� �߰��� ����
		//ob.view2(); �ν��Ͻ� �޼ҵ� (instance method)
		// �ݵ�� ��ü�� �����ϰ� �޼��带 ȣ���ؾ� ��. // view1, view2�� ����������� ȣ���ϰ� �ʹ�.
		
		// name. => String name => String�� ������ �ִ� �Լ��� ������ �� �� ����.
	}
}
// ������Ʈ = �ν��Ͻ� = ��ü