package emp;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		System.out.println("**** ��� ��� ����ϱ� ****");
		
		List<EmpVO> list = dao.getEmpList(); // ������ �������� ��� ���Ͻ��� �ִ� ���� �ʿ�, <Object>�� ����
		for(EmpVO ob: list) {
			System.out.println("�̸� : " + ob.getName() + "\t");
			System.out.println("�μ� : " + ob.getDept() + "\t");
			System.out.println("�޿� : " + ob.getSalary() + "\t");
		}
		//----------------------------------------------------------------------------
		System.out.println("***** lee ��� ����ϱ� *****");
		EmpVO vo = dao.getEmp("lee");
		
		if(vo==null) {
			System.out.println("ã�� ����� �����...");
		} else {
			System.out.println(vo.getName() + "	" +
					vo.getDept() + "	" + vo.getSalary());
		}
		

	}

}
