package object;

import java.util.Scanner;

/* *** ��ٸ� ���� ���� ���ϱ� ***
 * �غ��� �Է��ϼ��� : 5
 * ������ �Է��ϼ��� : 4
 * ������ �Է��ϼ��� : 3
 * 
 * ���� : 13.5
 * 
 * �� �� �� ����ұ��?(Y/y) n
 * *** �����ϼ̽��ϴ�. ***
 * 
*/

public class ObjectEx7 {

	public static void main(String[] args) {
		Trapezoid tz = new Trapezoid();
		char ans;
		// ��ĳ��
		Scanner sr = new Scanner(System.in);
		do {
			//�Է�ó��
			System.out.println("*** ��ٸ����� ���� ���ϱ� ***");
			System.out.print("�غ��� �Է��ϼ��� : ");
			int base = sr.nextInt();
			System.out.print("������ �Է��ϼ��� : ");
			int top = sr.nextInt();
			System.out.print("������ �Է��ϼ��� : ");
			int height = sr.nextInt();
			//do-while
			tz.setTrapezoid(base, top, height);
			System.out.println("\n");
			//���ó��
			System.out.println(tz.toString());
			System.out.println("\n");
			System.out.println("�� �� �� ����ұ��?(Y/y) ");
			//�����?
			ans = sr.next().charAt(0);
			//���ǰ˻�
//			if(ans == 'y' || ans == 'Y') {
//					continue;			
//			} else if(ans == 'n') {
//					break;
//			}
		} while(ans == 'y' || ans == 'Y');
		System.out.println("\n*** �����ϼ̽��ϴ� ***");
		sr.close();
	}
}

// ���� : ���۰� ����
// *************���**************
/*// ��ĳ��, ��������
 * int base, top, height;
 * char yn;
 * Scanner sc = new Scanner(System.in);
 * Trapezoid tz = new Trapezoid();
 * 
 * 
*//*// do-while
 * do {
 * 	// �Է�ó��
 * System.out.println("*** ��ٸ����� ���� ���ϱ� ***");
 * System.out.print("�غ��� �Է��ϼ��� : ");
 * base = sc.nextInt();
 * System.out.print("������ �Է��ϼ��� : ");
 * top = sc.nextInt();
 * System.out.print("���̸� �Է��ϼ��� : ");
 * height = sc.nextInt();
 * 
 * tz.setTrapezoid(base, top, height); // ���� ���� ������ ����
 * System.out.println(tz.toString());  // toString => ���, ���� ���ϱ�
 * 
 * System.out.print("�� �� �� ����ұ��?(Y/y) ");
 * //�ݺ�ó��
 * yn = sc.next().charAt(0);
 * } while(yn == 'Y' || yn == "y"); // ���� �˻�

* sc.close(); // 
* 
* System.out.println("*** ���� �ϼ̽��ϴ� ***");
* 
* // ��Ʈ��ũ ���α׷������� sc��ü�� �׻� �����־�� ��ȭ�� ���������� ������ �� �ִ�.
* 
* 
*/
