package step02_������;

public class CastingEx {

	public static void main(String[] args) {
		
		int pay = 857650;
		double tax = 0.033;
		//int tax = (int)1.033 / int : ���� ������ / double : ū ������ / ����ȯ�� �º��� �������� �캯�� ��ȯ
		// �º��� �캯�� ��ġ�ǵ��� ����� �� ��.
		
		int rPay = pay - (int)(pay*tax); // ���� - ����*�Ǽ� / Casting�� �⺻ : �º��� �캯�� ��ġ���Ѿ�
		
		System.out.println("�� ���ɾ� : " + rPay);
		
		/*
		int k = 87, e = 88, m = 75;
		int tot = k+e+m;
		//double avg = tot/3; // (�Ǽ�/����) => ���� / ������ �������� double������ �־ 83.0
		double avg = (double)tot/3.0;
		
		
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg );
		
		byte a = 100; // 2^8�°� ǥ�� => -128 ~ 127(0����) ǥ��
		int b = a; // 64 32 16 8 4 2 1 / �ڵ� ����ȯ
		
		double c = 73.45;
		int d = (int)c;			//���� ����ȯ
		
		System.out.println(a + "  " + b); // ������ �ڷ���(������)���� ĳ������ �Ѵ�.
		System.out.println(c + "  " + d);
	    */
	
	}

}
