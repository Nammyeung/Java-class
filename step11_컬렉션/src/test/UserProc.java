package test;
//����Ͻ� ����(������ ���̽� ���� ó��) => DAO�� �մܰ�(DAO ���� =  Data Access Object)
import java.util.ArrayList;
import java.util.List;

import emp.EmpVO;

// ����� ó�� = User Processor
public class UserProc {

//	public UserProc() {
//		super();
//		list = new ArrayList<User>(); // ������ ȣ��
//		list.add(new User("pororo", "1234", "�Ƿη�", 89.97));
//	}

	public User getLoginUser(String id, String pw) {
		/*
			�Ű������� ���� pororo, 1234�� ���Ͽ� 
			������ entity ��ü�� ����
			setter�� ���� id, pw, "�Ƿη�", 89.97�� �����ϼ���. 
			// �����ͺ��̽��� ������ �Ǿ����� �ʱ� ������ ������ ���� ����
		*/
		User entity = null; // �и��ϸ� �ȵȴ�, ���� ���� �����϶��� �ϳ� �������� �Ѵ�, else�� null�� ǥ���ϴ� �Ͱ� �Ȱ��� ����?
		if(id.equals("pororo") && pw.equals("1234")) { // �ش� ������ �����ϸ�
			entity = new User();
			entity.setId(id); // �����ͺ��̽��� �����Ƿ� ���� ����
			entity.setPw(pw);
			entity.setName("�Ƿη�");
			entity.setPoint(89.97);
		
		}
		return entity;
	}
}

