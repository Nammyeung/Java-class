package family;
/*
 * �̸� : ȫ�浿
 * �ƺ��� ������ ���� �Ѵ�
 * 
 * �̸� : ����
 * ������ �������� �Ѵ�
 * 
 * �̸� : ȫ��ǥ
 * �Ƶ��� ���θ� �Ѵ�
 * 
*/

public class MainEx {

	public static void main(String[] args) {
		Father ft = new Father("ȫ�浿");
		Mother mt = new Mother("��õ");
		Son sn = new Son("ȫ��ǥ");
		System.out.println(ft.toString());
		System.out.println(mt.toString());
		System.out.println(sn.toString());
		
		Family [] family= new Family[] {
				new Father("ȫ�浿"),
				new Mother("��õ"),
				new Son("ȫ��ǥ")
		};
		for (Family ob :family)
			System.out.println(ob);
		
		Family fal = new Family("ȫ�浿");
		System.out.println(fal);
		}
	}

