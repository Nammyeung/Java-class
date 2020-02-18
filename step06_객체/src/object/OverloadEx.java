package object;
// Overload : �ߺ�
/* overload method(�ߺ��Լ�) : ���� �̸��� �Լ��� ������ ���� 
 * Ư��
 * 1. �Լ� �̸��� �ݵ�� ����
 * 2. �Ű������� Ÿ���� �ٸ��ų� ������ �޶�� ��.
 * 
 * 
*/

public class OverloadEx {
	int x = 17; // ��������
	int y = 15; // private�� �������� default ���� ������(�⺻ ���� �������ٴ� ��), public < default < private
	
	public int max() {
		return (x > y) ? x : y; // return�� ����� x �Ǵ� y => �ڷ����� ��Ʈ, ���� �����ڴ� �׻� ������ ��������(������ �����ʺ��� ū�� or ������ �����ʺ��� ������)
	
	}
	public float max(float x, float y) {// �Ű������� x, y�� ����ϸ鼭 ������ ������(Overload�� ���� ����)
		return (x > y) ? x : y; // return�� ����� x �Ǵ� y => �ڷ����� ��Ʈ, ���� �����ڴ� �׻� ������ ��������(������ �����ʺ��� ū�� or ������ �����ʺ��� ������)
	
	}
// ���� �޼ҵ嵵 �����ϰ� ���� �޼ҵ嵵 �����ϰ�(2�ڷ����� ��� �ް� ���� ��)		
	public static void main(String[] args) {
		OverloadEx ob = new OverloadEx();
		System.out.println("ū �� : " + ob.max());
		System.out.println("ū �� : " + ob.max(75,100));
		System.out.println("ū �� : " + ob.max(75.5f, 100.4f));

	}

}
