package methodex;
// call by name
public class MethodEx1 {
	
	public static void view() {
		System.out.println("hello");
		return;  // �Լ��� ������ �׻� ����(return)�� �ְ� ��������(void Ÿ���϶���)
		
	}
	
	public static void star() { // void�� �����ϴ� ������� ���� / star(), ��ȣ[()]�� �ȳ����� �Լ��� �ƴϴ�.
		System.out.println("*****");
	}
	
	public static void main(String[] args) {
		// �Լ� = function = ���ν���  => �޼ҵ�  
		view(); // �Լ� ȣ��(�޼ҵ�)  view() => view �޼ҵ�� �̵� => �޼ҵ� ������ ����� ����
		star(); // star() ȣ�� => �� ���� �ٺ�
		view();
	
	}

}

// void : return Ÿ���� ����. string readline()
// Ű, ���콺 �̵� : event = �޼����� �����Ѵ�. => eventless 
// ��øŬ���� : Ŭ������ �� �� �̻� ���? => ���α׷� ���ۿ� ���� ���� ������ ��ħ.