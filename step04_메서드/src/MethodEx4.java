package methodex;

/* -- ���
  ���� : 253��:
  ��� : 84.33��
  ���� : B
  ��� : �հ�
----------------
 ���� : switch �̿��Ͽ� ���ϱ� a b c d e f
 ��� : if ~ else		F�� ���հ� �ƴϸ� �հ��� ���� 

*/

public class MethodEx4 {

	public static int total(int k, int e, int m) { // return�� �ϰ��� �ϴ� ���� ����
		
		return k + e + m; // ȣ���� ������ ���� ������ �ǵ��ư�(return��), void�� ���� ��������, ������ �̵�(brace�� ������ ������ �ɷ� ���)
	}
	
	public static double avg(int tot) { // total�� ������� ���� ���� �Լ��� ȣ���� ����.
				
		// avg(total(10, 10, 10)); / total(10,10,10) => �ϳ��� ��(�Ű�����)
		return tot / 3.0;
		
	}
	
	public static char grade(double av) {
		//switch�� ����ϱ�
		char gd; // return�ϰ��� �ϴ� ������ �����ϴ� ���� ����.
		switch((int)((av / 10))) { // /�� ��, %�� ������ ��.
		case 10 : gd = 'A' ; // case�� ���࿡ return�� ������ �ȵȴ�. case 9 : return (x)
		break;
		case 9 : gd = 'B' ;
		break;
		case 8 : gd = 'C' ; 
		break;
		case 7 : gd = 'D' ; 
		break;
		case 6 : gd = 'E' ; 
		break;
		default : gd = 'F' ;
		
		}
	return gd;
	}
		
	/*	switch((int)((av / 10))) {
	 * case 10 : return 'A'; / break�� �ʿ���� ���� : break�� switch���� ���������� ���� ����ϴµ� return�ϸ� �� �Լ� ��ü�� ���������� �����Դϴ�.
	 * case 9 : return 'B';
	 * case 8 : return 'C';
	 * case 7 : return 'D';
	 * case 6 : return 'E';
	 * default : return 'F'; }
			
	*/	
	
	public static String result(char gr) {
		//�հ�,���հ� �����ϱ�
		if (gr == 'F') { // ���ڿ� ���Ͽ� ������ ���ϴ� ���� ���������� ����, ���ڰ� �ƽ�Ű�ڵ�� �Ǿ��־� ������ ��.
			return "���հ�";
		} else {
			return "�հ�";
		}
	}
	
	public static void main(String[] args) {
		int k = 95, e = 85, m = 73;
		System.out.println("���� : " + total(k, e, m)); // �������� ���� �������� �Լ��� ���� ��������� ������ ���� ���ο��� ó�� / ���������� ���Ǹ� ����
		System.out.printf("��� : %.2f\n", avg(total(k, e, m))); // total�� �� �� �� �� ������ ������ �ϳ� �� ������ִ� ���� ���ɿ� ����.(�ִ��� ������ ���� �ʰ� �� �� �� ������ ��������� �־�ε���)
		System.out.println("���� : " + grade(avg(total(k, e, m))));
		System.out.println("��� : " + result(grade(avg(total(k, e, m)))));
		
		
	}

}




