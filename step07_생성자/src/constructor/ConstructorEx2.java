package constructor;

public class ConstructorEx2 {
	public ConstructorEx2() { // ����Ʈ ������
		System.out.println("default constructor"); // 4
	}
///////////////////////////////	
	public ConstructorEx2(String str) {
		this(str, 10); // 2
		System.out.println(str + " constructor"); // 6
	}
////////////////////////////// 2������ �Ѿ(2�� �ּ� ����) => 2���� �ش� �ϴ� ������ ��� ó��	
	public ConstructorEx2(String str, int n) { // �������̹Ƿ� Ŭ������ �̸��� ����
		this();	// 3 ����Ʈ ������ ȣ��
		System.out.println(str+" "+ n + " constructor"); // 5
	}
		
	public static void main(String[] args) { // ���� �ּ� ���� ���� : ����
		new ConstructorEx2("������", 10); // 1 �׻� ������ ����
		System.out.println("ooo"); // 7
	}

}

// ----------------------------------------------------------1
//public class ConstructorEx2 {
//	public ConstructorEx2() {
//		this("������", 10); //2 ����Ʈ ������
//		System.out.println("default constructor"); // 6
//	}
//	public ConstructorEx2(String str) {
//		System.out.println(str + " constructor"); // 4
//	}
//	
//	public ConstructorEx2(String str, int n) { // �������̹Ƿ� Ŭ������ �̸��� ����
//		this(str);	// 3 this�� ����� ������ ��� �ذ��ϰ� �Ʒ��� ó�� 3~5(�����ߴٰ� �ٽ� ���ƿ��� ���ؼ��� ����(������ ��ġ) �ּҸ� �����س��� ��)
//		// this ������ ȣ��, Ŭ���� �ȿ��� �ڱ� �ڽ��� �����ڸ� ȣ���ϰڴ�.
//		// �߰������� this(x) this �����ڴ� �� ���� ȣ��.
//		System.out.println(str+" "+ n + " constructor"); // 5
//	}
//		
//	public static void main(String[] args) { // ���� �ּ� ���� ���� : ����
//		new ConstructorEx2("������", 10); // 1 �׻� ������ ����
//		System.out.println("ooo"); // 6
//	}
//
//}

//���� �ּ� ���� ���� : ���� (���� [_]�� �о������ ���� ����, �������� ���� ���� ���� Ƣ�� ������ ����

// ----------------------------------------------------------2
//  public class ConstructorEx2 {
//	public ConstructorEx2() {
//		System.out.println("default constructor"); // 4
//	}
//	public ConstructorEx2(String str) {
//		this(); // 3
//		System.out.println(str + " constructor"); // 5
//	}
//	
//	public ConstructorEx2(String str, int n) { // �������̹Ƿ� Ŭ������ �̸��� ����
//		this(str);	// 2
//		// this ������ ȣ��, Ŭ���� �ȿ��� �ڱ� �ڽ��� �����ڸ� ȣ���ϰڴ�.
//		// �߰������� this(x) this �����ڴ� �� ���� ȣ��.
//		System.out.println(str+" " + n + " constructor"); // 6
//	}
//		
//	public static void main(String[] args) {
//		new ConstructorEx2("������", 10); // 1, 
//		System.out.println("ooo"); // 7
//	}
//
//}

// [] -> []  -> [] -> [] => ���δ� �Լ�(4��) / �ٽ� ȣ��
//	  <-	 <-	   <-    (�ٽ� ȣ��)
