package animal;

import java.util.Scanner;

//���� ���ε� : ��Ÿ�ӿ� ȣ�� �Լ��� ����, �ڵ����� �پ�� / ���� : �ӵ��� ���� ������
public class AnimalMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Animal ani = null;
		while(true) {
			System.out.println("1.Dog 2.Cat 3.Fish 4.Duck 5.Exit\n���� : ");
			n = sc.nextInt();
			switch(n) {
			case 1: ani = new Dog(); break; // �θ�Ŭ������ ���������� �ڽ� ��ü ����
			case 2: ani = new Cat(); break; 
			case 3: ani = new Fish(); break; 
			case 4: ani = new Duck(); break;
			default: System.out.println("*** �����մϴ� ***");
			sc.close();
			System.exit(0);
		

			}
			ani.speak();
			ani.walk(); // �޼ҵ带 �� ���� ȣ�����ָ� ��ü�� ���� �ʿ��� �޼ҵ带 �˾Ƽ� ã�ư�.
		}
	}
}

