package array;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		int[] num = new int[3]; // int�� �迭 ����
		num[0] = Integer.parseInt(args[0]); // ���ڷ� args�� 0��° ���� �޾Ƽ� num�� ù��° ������ ����.
		num[1] = Integer.parseInt(args[1]); // args�� ��ٷ� ���� �ʴ� ������ ��ٷ� ������ ���� �ʱ� ����.(ex - ������� �Է� => ��,��,��,�� �и� => ���� �Է�, ȸ������) or calender class �̿�.
		num[2] = Integer.parseInt(args[2]);
	
		// �ִ밪 �ּҰ�
		int max = num[0];
		int min = num[0];
		
		for(int i = 1 ; i < num.length ; i++) {
			if(num[i] > max) {
				max = num[i];					
			}
			if(num[i] < min) {
				min = num[i];
			}
			System.out.println("�ִ밪 : " + max);
			System.out.println("�ּҰ� : " + min); // ���� => ����Ʈ �ڵ带 ������ ����. / .class => java byte �ڵ�
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min); // ���� => ����Ʈ �ڵ带 ������ ����. / .class => java byte �ڵ�
	}

}

// [ 10 ][ 15 ][ 5 ]
//   |
// 15 => ��[ 10 ] => �[ 10 ]
// argument�� length�� ��´�?
// ��ǻ���� ������ ó�� ��� => ù��°�� = 0��°�� / num int[3] => ������ 3��
// �޸� 8GB, 16GB, 32GB ���� / �̸� / ũ�� /�ּ� = ��ġ(�޸𸮿� �ش� ������ ��� ��) / �⺻�ڷ��� => char - 1byte ����, byte - 1byte ���� / byte ����, �������� �̸�, �ּҸ� �Ҵ�
// �ܼ��ϰ� �޸𸮻� 8ĭ�� �������� ����(2^8) <-> ��ü�� ��� �������� �ſ� ������(class�� ����), ������ ��ü��� ���� �ȴ�. / ��ü class - ����(1. �⺻�ڷ���, 2. ����� ���� �ڷ���(ex - Ŭ����)), �Լ�
// new => �������� �Ҵ��ϴ� ���� = +�� �����ϴ� �Ͱ� ���� / class���� �Ļ��Ǵ� ������ �Լ��� �������� �Ҵ�.
// Java�� 90��� �� �Ĺݿ� ź���� ���
// short int char 4, char���ٴ� ũ�� 2byte���ٴ� �۰� / c ����� ��� short = int
// main�Լ��� �ü���� ȣ�� (ex - hwp���α׷��� Ÿ���� or ����Ŭ������ ȣ��) // return �ü���� ȣ���ϴ� �� ����