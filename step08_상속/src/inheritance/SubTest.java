package inheritance;

public class SubTest extends SuperTest{
	private int age;
	private double score;
		
	public SubTest() {
		super();
		
	}

	public SubTest(String name, String addr, int age, double score) {
		super(name, addr);
		this.age = age;
		this.score = score;
		
	}

	//toString()�ϼ����ּ���
	public String toString() {
		// Overriding�� �߱� ������ ����� ���� �ʴ´�.
		return super.toString() + "\n���̴� " + age + "���̰� ������ " + score + "���Դϴ�.";
	}
	public static void main(String[] args) {
		SubTest ob = new SubTest("ũ��", "����", 23, 85.4);
		System.out.println(ob.toString());
		//�̸��� ũ���̰� ��� ���� �����Դϴ�.
		//���̴� 23���̰� ������ 85.4���Դϴ�.
	
	}

}
