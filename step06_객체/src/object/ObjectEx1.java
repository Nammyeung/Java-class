package object;

/*	- (private)		+ (public)		#(protected)
	------------------------------------------------------------
	Ŭ���� �� : Person
	------------------------------------------------------------
	+name : String
	+age : int
	+score : float
	------------------------------------------------------------
	+setPerson(name:String, a:int, s:float) : void(Return Ÿ��)
	+viewPerson():void
	------------------------------------------------------------
	(ǥ�� ���� �� ������ �̷��� ǥ��)
*/
// �Լ��� ���� : ������ ���¸� ��ȭ, ������ ��Ÿ��
//class Person{
//	public String name; // ������ + Name �ڷ����� ǥ��ȵǾ� �־ ���������� ����, ���輭������ ��ø� �س��°��� ���ʷ�
//	public int age;
//	public float score;
//	// �������(field) ����, ��ü����
//	public void setPerson(String n, int a, float s) { // set�̶�� ���� ���Ƿ� ������ ������ ���� ���̴� �뵵
//			//��� �Լ�����, method
//	{
//		name = n; // name ������ ���� ����
//		age = a;
//		score = s;
//		}
//	}
//}

class Person{
	public String name; // public ��������
	public int age;		// public ��������
	public float score;	// public ��������
	
	public void setPerson(String name, int age, float score) { // �ʵ�?
		this.name = name ; // name = n "������" => String n => name => public String name // ��ü ������ ��ǥ : ���� �Է�(���� �Է�)
		this.age = age; // ������? / age = a
		this.score = score; // �ڱ��ڽ��� ��ü�ȿ� �ִ� ���� / score = s
	} // ����� �ϰ� ������ ����� �� �� �ִ� �޼ҵ带 �����ؾ�(public String name���� �ٷ� ����)
	public void viewPerson() {
		// String name = "";
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + score);
	}
}

public class ObjectEx1 {
	
	public static void main(String[] args) { // Entry point
		Person ps = new Person(); // new Person : �� ������ �޸𸮸� �Ҵ��ϴ� �ν��Ͻ� 
		ps.setPerson("������", 23, 73.5f); // ps.setPerson("������", 23, 73.5f);, �ּ��� �� �� Ȯ���� �� �� /  ps : ��ü(�ʵ�� �޼ҵ��� ����)
		ps.viewPerson();
		System.out.println(ps.hashCode()); // hashCode�� ������ üũ? / hash : ���� �ּ�, �������� �ν��Ͻ��� ���� �������� �ִ� ��� / hash = page, �ؽ���ũ(�±� �� ���� ��� ã�Ƴ�, ������)
		
	    ps = new Person();
	    ps.setPerson("�ε鷹",  25,  90.5f);
	    ps.viewPerson();
	    System.out.println(ps);
	    
	    
	}
}

//public class ObjectEx1 {
//
//	public static void main(String[] args) {
//		// String name;
//		// String name = "ȫ�浿";
//		// String name = new Sting("ȫ�浿"); => ������, ���� Ŭ�������� ���� �������� �ʴ´�.
//		Person ps = new Person(); // name, age, score, setPerson() ��밡��.
//		ps.setPerson("������", 23, 73.5f); // ����� �ȳ��� => ��¾��� ps[]��ü -> [name : ������, age : 23��, score : 73.5]�� ������ ��ü ���� -> ps[] �Ҹ�
//
//	}
//
//}
// +, - ���������ڸ� ��ȣ�� ��Ÿ��(+ : public,- : private)
// stack : ������ ���� vs �� : ��Ÿ�� ����
// �������ε� : ȣ���ϱ����� �̸� �ƴ°�.

// Person ob = new Person();
// ob.setPerson("������", 23, 73.5f);

// 
