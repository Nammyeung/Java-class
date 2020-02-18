package interfaceex;
/* class �� interface�� �̿��Ͽ� ����ó��
 * Ŭ���� : User
 * -name : String
 * +User()
 * +User(name:String)
 * +toString():String
 * 
 * �������̽� Score
 * +sol:int	(�ʱⰪ:20) // ����
 * +getScore():int // ���� �� * sol(3)�� ���� / �������̽������� �޼ҵ带 ���Ǹ� �ϰ� ���� �ϸ� �ȵȴ�.
 * 
 * �������̽� Print
 * +toPaint():String
 * 
 * --���ȭ��
 * �̸� : ȫ�浿
 * ���� : 60�� // �ʱⰪ : 20 �������� main�Լ��� �����ڸ� ���� super�� ���� ����.
 * 
 */
// interface => ������ ���̰� ���յ� ���߰�
// [] ȸ���� �μ��� ��������, Ư���� �μ����ο� ������� ������ ���� 
// if �������� ������ => ���ΰ��� ������ �ȵǴ� �������� ����(������ �ȵǴ�?)
// ���յ� �μ��ȿ��� ���������� ���� ó���� �Ұ����ϸ� �ܺο� ���� ���� ���Ǹ� �ؾ� �ϴ� ���� => ������ ó���ϱ� ���ؼ� ������ ���� ������ ��� => �������(�޼ҵ带 ��� ����� ���ΰ�, ���������� �۵��ϴ°�)


class User {
	private String name; // �������� ������ִ� ����
	
	public User() {
		super();
	}
	
	public User(String name) {
		super();
		this.name = name;
	}

	public String toString() {
		return "�̸� : " + name;
	}
	
}
interface Score{
	public int sol = 20;
	public int getScore() ; // ���� ���� �޾ƾ� �ϹǷ� ���߿� �������̵带 ���� ���� ���ְ� ��, ������ * sol�� ����
}

interface Print{
	public String toPaint();
}
//[user]	  o    o(���)
//			->	->
//[]		

public class InterfaceEx4 extends User implements Score, Print { // unimplement �޼ҵ� ����
	int s;
	public InterfaceEx4(String name, int s) { // �� �κ��� ���� ����, s�� �����ϱ� ���� �޼ҵ� ����?
		super();
		this.s = s;
	}
	public int getScore() {
		return s*sol; // ����� �޾ұ� ������ ���� ������ �״�� ��� ����.
	}
	public String toPaint() {
		return "���� " + getScore();// ������ ����(��)�� ����
	}
	public static void main(String[] args) {
		InterfaceEx4 ob = new InterfaceEx4("ȫ�浿", 3);
		System.out.println(ob.toPaint());
	}
}	
	
/*interface Print{
	public String toPaint(); // �������̽��̹Ƿ� ���� �ϰ� ���� ����.
}	
	
	public class InterfaceEx4 {
	class User implements Score, Paint {
		private String name;
		
		public User() {
			super();
		}

		public User(String name) {
			this.name = name;
		}
				
		@Override
		public int getScore() {
			return sol;
		};
		@Override
		public String toPaint() {
			return "�̸� : " + name + "���� : " +  + "��";
			
		};
		
		public String toString() {
			return name;
		};
	}
	interface Score{
		final public int sol = 20;
		public int getScore();
		
		}
		
	}
	interface Paint{
		public String toPaint();
		}

	public static void main(String[] args) {
		InterfaceEx4 ob = new InterfaceEx4("ȫ�浿",3);
		System.out.println(ob.toString());
	}	
}	

336 page ~ 
*/


