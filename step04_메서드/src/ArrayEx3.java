package array;	//	  0      1      2     3
// $ java ArrayEx3 | abcd | ������ | 123 | 12345 / args�� 0��° �濡 abcd�� �ִ�. / [0]�� 0��° �濡�� a�� �ִ� => 2���� �迭
public class ArrayEx3 {

	public static void main(String[] args) { // args / �迭 �Ű����� / ping | 168.126.63.1 | -t
		System.out.println("args�� ���� : " +args.length); // ��ȣ��(1), 104(2) / ��������� �����ΰ�? / ������ �������� �з�
		
		for(int i = 0 ; i < args.length ; i++) {// 2���� �迭�� ������ �����ϰ� ��.
			
			System.out.println("args[" + i + "] : " + args[i]); // length : ��ü / length() : �Լ�
			System.out.println("args[" + i + "]�� ũ�� : " + args[i].length()); // length : ��ü / length() : �Լ�
			
		}
		// ----------- ���� for������ ����� ������.
		for(String st : args) {
			System.out.println(st + "\n");
			System.out.println(st.length() + "\n");
		}
	}

}
