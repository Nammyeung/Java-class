package object;
// setter & getter : ������� �ϳ��� �ϳ��� ���� �����ϴ� setter��
// 					 �� ���� �����ϴ� getter

class Member{
	
	private String name; // private : Ŭ���� ���ΰ� �ƴ� �ܺ�(�����Լ�)���� ������ �� �� ����
    private int age;
    private double tall;
    
    public void setName(String name) { // setter �Լ��� �ܺο��� ���� ���� / set �Լ��� name���� ����
    	this.name = name; // Ŭ���� ���ο� �ֱ� ������ name�� ���� ����.
    }
    // �Ű������� ��������� ������ �ڷ����� ����
    public void setAge(int age) { // setter �Լ��� �ܺο��� ���� ���� / set �Լ��� name���� ����
    	this.age = age; // Ŭ���� ���ο� �ֱ� ������ name�� ���� ����.
    }
    
    public void setTall(double tall) { // setter �Լ��� �ܺο��� ���� ���� / set �Լ��� name���� ����
    	this.tall = tall; // Ŭ���� ���ο� �ֱ� ������ name�� ���� ����.
    }
    
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
    public double getTall() {
    	return tall;
    }
}

public class objectEx3 {

	public static void main(String[] args) {
		Member ob = new Member();
		ob.setName("��ȣ��");
		ob.setAge(25);
		ob.setTall(178.8);
		System.out.println("�̸� : " + ob.getName());
		System.out.println("���� : "  + ob.getAge());
		System.out.println("����: " + ob.getTall());

	}

}
