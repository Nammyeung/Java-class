package inheritance;

class ParentEx{
	public ParentEx() {
		System.out.println("parent class"); // 3
	}
	
}
class ChildEx extends ParentEx {
	public ChildEx() {
		// super();	//��������, 2
		System.out.println("child class"); // 4
	}
	
}




public class InheritanceEx2 {

	public static void main(String[] args) {
		new ChildEx(); // 1

	}

}

/* this.����
 * this.�޼���()
 * this()
 * this(����, ����,...) --- �ڱ��ڽ��� ������ ȣ��
 * 
 * super.����
 * super.�޼���()
 * super() => super�� ������ ȣ��
 * super(����, ����, ...) => => �θ��� ������ ȣ��
 * 
 * 
 */
