package methodex;
// call by reference => ������ ���� ����, ���� �ּ� ����(mapping�� �Ǿ��ִ� ����), ��ü �ڷ���
// ��ü �ڷ������� ���, Ŭ����, ������(����), �迭, �������̽�(Ŭ������ ������ ����)
public class MethodEx7 {
		// �Ű������� �����Ҷ�(like String[] args)
	
	public static void view1(String str) { // String str : ��ü �ڷ��� => ���� �����Ϳ� ������ ����
		System.out.println("view1�� ������ str:" + str); // [ str ] => "happy"
		System.out.println(str);
		str = "������";								// [ str ] => "������" ����, ���ο� ������ ����
		System.out.println("view1�� ������ str:" + str);
		
	}
	
	public static void view2(int[] num) {
		for (int n:num) {
			System.out.println("������ view2�� num: " + n); // ���� �ڷ���, ��� ��ġ�� ���� ������ ��Ű�� ��ü ������ ���� vs ���� �ڷ���
		}
		//System.out.println();
		num[2] = 300;
		for (int n:num) {
			System.out.println("������ view2�� num: " + n);
		}
		
	}
	//c��� �迭 --> ������, ������ --> �迭
	//	char* test[] --> �迭 ������ / ��������� �Ȱ���.
	// char** test --> 2���� �迭 / c���� �ݴ�� �����ϸ� �ȴ�.
	// (1) ������ �迭
	// �����͵��� �迭, �迭�� ��Ұ� �����͵�� �̷���� �ִ�.
	// ������ : char* arr[3];
	// �迭 ����� �ڷ����� char* (������)�� �迭
	
	public static void main(String[] args) {
		String str = "happy";
		System.out.println("ȣ�� �� str: " + str);
		view1(str); // �Լ� ȣ��, happy ���� �Ѿ�°� �ƴϰ� str �ּҰ� �Ѿ?
		System.out.println("ȣ�� �� str: " + str);  // [ str ] => "happy", ��ü �ڷ����� ��� ���������Ϳ� ���������� ���ϴ� ��찡 �ִ�. ������?
		System.out.println("---------------------------");
		int [] num = {10, 20, 30, 40, 50};
		for(int i : num) {
		System.out.println("ȣ�� �� ������ num: " + i);
		
		view2(num);
		
		}
		for(int i : num) {
		System.out.println("ȣ�� �� ������ num: " + i);
		}
	}
}
