package methodex;
// call by value : ���翡 ���� ���� / ���� ����, ���� ����
public class MethodEx3 {
	
	public static void show1(int a, char b, double c, float d) {// ȣ���� ������ ���� ����, �⺻�ڷ���
		System.out.println(a + " " + b + " " + c + " " + d);
	}
	public static int show2(int a, int b, int c) {
		return a + b + c;
	}
		
	public static double show3(int a, int b, int c) {
		return (a + b + c) / 3.0; // ������ 3(int), 3.0(double) ���̰� ������ ����!
	}
	
	public static String show4(int a, int b, int c) {
		String result = (((a+b+c)/3) >= 60) ? "�հ�" : "���հ�"; // 3�� ������ Ȱ��
		return result; // return�� �޼ҵ� �� �ϳ��� �ۼ� 
	}
	/*
	public static String show4(int a, int b, int c) {
		double av = (a + b + c) / 3.0 ;  //��� ���
		String rs;
		if (av >= 60) {
			rs = "�հ�";  / return "�հ�"
		}else {
			rs = "���հ�"  / return "���հ�"
		}					//��� �˻�
		return rs;	
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show1(10, 'A', 100.4, 50.3f);
		
		int sum = show2(95,85,73);
		System.out.println("�հ� :  " + sum);
		System.out.println("�հ� :  " + show2(95,85,73));
		
		double avg = show3(95, 85, 73);
		System.out.println("��� :  " + show3(95,85,73));
		System.out.printf("��� : %.2f\n", show3(95,85,73));
	
		String result = show4(95,85,73);
		System.out.println("��� : " + result);
	}

}

/*
 * [------------]
 *  show1       |
    10			|
 	A           |  ---> ������
 	100.4		|
 	50.3 		|*/

// br, isr => ��ü �ڷ��� / �迭 �ڷ��� num, color => ���� �ڷ���

/*
 * �� ���ǻ���
 *
 * 1. ���׿����ڸ� ����Ͽ� �ڵ��� ������ �پ����ٰ� ������ �ӵ��� �������� ���� �ƴմϴ�.
 * 
 * 2. ���׿����ڸ� �ߺ��ؼ� ó���� ���, �������� ������ �� �����Ƿ� �ߺ�ó���� ���ϴ°��� �����ϴ�.
 * 
 */