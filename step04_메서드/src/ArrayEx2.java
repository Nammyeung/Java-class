package array;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		String [] car = {"�ҳ�Ÿ", "�ڶ���", "������", "Ƽ��", "���"}; // {} => ���� �� ���� �����ϱ� ���� brace���
		// �ټ����� ��� ������ �Ҵ�(���� �Ұ�)
		car[3] = "��Ƽ��"; // ���尪 ���� ���
		
		for(String st : car)
			System.out.println(st);
		
		
	}

}
