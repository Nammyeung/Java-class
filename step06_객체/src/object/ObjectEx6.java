package object;

import java.util.Scanner;

class MemberPhone{ // Navigator => ������ ��Ű�� �ȿ� Ŭ������ �� ���ִµ� �ߺ��� �̸����� �ۼ��� �� ����.
	private String name;
	private String phone; // ��ȭ��ȣ�� �ڷ����� �ַ� String���� ��.
	
	public void input() {
		Scanner sc = new Scanner(System.in); // BufferedReader�� ���(���� x)
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine(); // ���ڸ� �Է� �������� nextInt();
		
		System.out.print("��ȭ�� �Է��ϼ��� : ");
		phone = sc.nextLine();
		sc.close(); // �ݾ������. / IO���� ����� �� �� �ݾ��ִ� ���� �߿�.
	}
	public void output() {
			System.out.println(name + "������ ��ȭ��ȣ�� " + phone + "�Դϴ�");
	}
}	

public class ObjectEx6 {

	public static void main(String[] args) {
		MemberPhone mp = new MemberPhone();
		mp.input(); // �Է� �޼ҵ�
		mp.output(); // ��� �޼ҵ�

	}

}
