package constructor;

public class Member {
	
	private String name = "��Ƽ";
	private int age = 22;
	public Member() {
		// name = "��Ƽ"; / ���� ����� ���� ������ ����
		// age = 22;
	}
	
	public Member(String name, int age) { // �Ű������� �ִ� �����ڸ� ����� �Ű������� ���� �����ڸ� ������ ���Ƿ� ����Ʈ �����ڸ� �ʼ��� ������ ��.
		this.name = name;
		this.age = age;
	}
	
	public void view() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
