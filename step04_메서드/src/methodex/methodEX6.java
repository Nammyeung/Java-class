package methodex;

public class methodEX6 {
	
	public static int total (int toeic, int it) { // ��������, total �Լ��� ����(�ش� �Լ��� �����ȿ����� toeic�� it�� ����� ���, �ν�), local variable
		toeic = 800; // call by back ***
		return toeic + it;
	}
	public static String rs (int total) { // return���� ���ڿ��� ���´�, �Ű������� �������� ������(int tot ����) / tot = 815
				if(total >= 800) {
			return "�հ�";
		} else {
			return "���հ�";
		}
	}
// �Լ� ���� / �ٸ� ��� �Լ� ������ ����, java������ �Լ� ���� >(���Եȴ�) �Լ� ����		
	public static void main(String[] args) {
		int toeic = 750, it = 65;
		
		System.out.println("�Խ����� : " + total(toeic, it) + "��");
		System.out.println("�Խð�� : " + rs(total(toeic, it)) + "�Դϴ�");
		//�Ի����� : 815��
		//�Ի��� : �հ��Դϴ�		--> 800�̻� �հ�, �̸� ���հ�
		System.out.println(toeic); // �����ڷ����� �������� �ϴ� ������ �ƴϴ�.
	}

}

// �Լ� ���� : ����������, ����Ÿ��(void or int...), �Լ��� (�Ű�����)
//			(1) �������� �ڷ��� ��ġ	(2) ������ �Ű����� �ڷ��� ��ġ�ؾ�
// �Լ� ȣ�� : �Լ��̸�(�Ű�����), �Ű������� �� or ������ ��
//
// ��
// public static int total (int toeic, int it) { / main�Լ��� �������� ����� ���� Ȯ��
// [     ] => total �Լ� ����   [      ] => main �Լ� ����
// 5��, ����, �� ����
