package object;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				
		/*
		 * System.out.print("���� : "); char c = sc.nextLine().charAt(0); // ���۸� �Ⱥ���� �׷���?
		 */			
			System.out.print("���ڿ� : ");
			String str = sc.nextLine();
			
			System.out.print("���� : ");
			int a = sc.nextInt();
			
			System.out.print("�Ǽ� : ");
			double b = sc.nextDouble();
			sc.nextLine(); // ���� ����  \r\n 
			// ���۸� ���� ����(Scanner�� ���)
			
			System.out.print("���� : ");
			char c = sc.next().charAt(0); // ���۸� �Ⱥ���� �׷���?, �ܾ� ������ �Ǵ�(next()) => ���� �Ű澲�� �ʾƵ� ��.
			// 12.3\r\n - ����(���� \r\n�� ���� ��) �Է�
			System.out.println(str);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			sc.close();
	}

}
