package test21;

public class EmpEx {
	public static void main(String[] args) {
		
	
	Emp em = new Emp();
	em.setName("��ȣ��");
	em.setDept("������");
	em.setSalary(1200000);
	System.out.println(em.toString());
	System.out.println();
	System.out.println("�̸� : " + em.getName());
	System.out.println("�μ� : " + em.getDept());
	System.out.println("�޿� : " + em.getSalary() + "��");
	
	}
}
