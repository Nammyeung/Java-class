package test;

import java.util.ArrayList;
import java.util.Scanner;

/* ID�� �Է��ϼ��� : pororo
 * PW�� �Է��ϼ��� : 1234
 * 
 * �Ƿηδ��� �����ϼ̽��ϴ�.
 * ���� ����Ʈ�� 89.97�Դϴ�.
 * 
 * [[BOOK�� ��������]]
 * å�̸� : java å���� : kim ������ : 100
 * å�̸� : oracle å���� :lee ������ : 200
 * å�̸� : html å���� : aprk ������ : 300
 * 
 * -------------------------------------
 * ID�� �Է��ϼ��� : pororo
 * PW�� �Է��ϼ��� : 1235

ID �Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID�Դϴ�.
*/

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id; // ���������� �ʿ���� <= ������ �����Լ� �ȿ��� �����ϰ� ������
		String pw;
		
		//�Է� ó��
		System.out.println("ID�� �Է��ϼ��� : ");
		id=sc.next();
		System.out.println("PW�� �Է��ϼ��� : ");
		pw=sc.next();
		
		//�Է°��� ���� �˻�
		UserProc up = new UserProc(); // �޼ҵ忡 ��Ƽ� �Ű������� ����
		// up.getLoginUser(id, pw); =>
		User entity = up.getLoginUser(id, pw);
		
		//��� ���
		if(entity!=null) {
			//�����Ͱ� �ִ� ���
			System.out.println(entity.getName() + "���� �����ϼ̽��ϴ�");
			System.out.println("���� ����Ʈ�� " + entity.getPoint() + "�Դϴ�.");
			System.out.println();
			System.out.println("[[BOOK�� ��������]]");
			
			BookProc book = new BookProc(); // 3 x 3 �ϳ��� �ϳ��� �� ����Ʈ�� ��´�. [<Book>][][]
			ArrayList<Book> list = book.getList();	// ��ü �ϳ��� �ϳ��� ����Ʈ�� ���ٰ� ����, <�ϳ��� ��ü�� ���>
			// for(:)
			for(Book ob : list) // ���� : list���� �̾Ƴ��� ������ 
				System.out.println("å�̸� : " + ob.getTitle() + "\tå���� : " 
				+ ob.getAuthor() + "\t������ : " + ob.getPage());

		} else {
			//�����Ͱ� ���� ���
			System.out.println("ID �Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID�Դϴ�.");
		}
	}

}

// rs : �����ͺ��̽� ����� �����ϴ� �� => re.getString(���ڿ��� �����ͺ��̽����� ������ �̾Ƴ�)
// http://falkhausen.de/
