package step02_������;

public class ParseInt {

	public static void main(String[] args) {
		String a = "100";	// ���ڿ� 100
		String b = "200";	// ���ڿ� 200
		
		int a1 = Integer.parseInt(a); //"100" --> 100���� ��ȯ
		int b1 = Integer.parseInt(b); // parseInt => Ű���忡 �Էµ� ���� ���ڷ� ��ȯ /Python => int("15")
		
		
		
		System.out.println(a+b); // ���ڿ� �����Ϳ� ���ؼ� ���׿����ڸ� ����� �� ����.		/ + => ������ �ǹ�
		System.out.println(a1+b1); // 
		
		
	}

}
