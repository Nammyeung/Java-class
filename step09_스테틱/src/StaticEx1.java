package staticex;

class Test { // static ���� / static �޼ҵ�
	int x;
	int y;
	static int z; // ���Ÿ�ü�� ǥ��
	
	/*
	 * static { System.out.println("static �ʱ�ȭ ����"); }
	 */
	
	public Test(int x, int y, int z1) {
		this.x=x;
		this.y=y;
		z=z1;
		System.out.println("��ü �ʱ�ȭ ����");
	}
	public void view() {
		System.out.println(x+"  " + y + "  " + z);
	}
	
	static { System.out.println("static �ʱ�ȭ ����"); } // ���� ���� ����.
}

public class StaticEx1 {

	public static void main(String[] args) {
		Test ob1 = new Test(1, 2, 3);
		
		
		ob1.view();
		Test ob2 = new Test(4, 5, 6);
		ob2.view();
	}

}

// ���߰��� �Ǵ� ��� static