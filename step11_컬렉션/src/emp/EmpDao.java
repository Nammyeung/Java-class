package emp;
// dao (data access object) : �����ͺ��̽����� �ڿ��� ������ �뵵�� ����ϴ� Ŭ����

import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	// ���� �����ϴ� ������ �����
	List<EmpVO> list = null;
			// database�� ���� �ִٰ� ����, ������ ��ü�� ��
	public EmpDao() {
		list = new ArrayList<EmpVO>(); // ������ ȣ��
		list.add(new EmpVO("kim",  "������",  1000000));
		list.add(new EmpVO("lee",  "���ߺ�",  1500000));
		list.add(new EmpVO("park",  "������",  2000000));
	}
	// INSERT ����
	// �����ͺ��̽��� �����Ͱ� ����Ǿ� �ִ� ����, �����ͺ��̽� ���ӿ� ���� ó��
	public List<EmpVO> getEmpList() { // <Object>�� ����, �ֻ��� ����Ŭ�����̱� ������..
		
		return list;
	}
	public EmpVO getEmp(String name) {
		
		for(EmpVO vo:list) {
			if(vo.getName().equals(name))
				return vo;		// name : �Ѿ�� ��
		}
		return null;
	}
// getEmp => SELECT�� ����, getEmpList => List�� SELECT
}


/* vo []  <=> do [] <=> []
��������� SELECT, INSERT �۾��� ���


*/