package test14;

public class EmpEx {
	
	public static void main(String[] args) {
		Emp ob = new Emp();
		ob.setEmp("�̼���", 25, 175.3);
		ob.viewEmp();
		System.out.println("���� �̸��� " + ob.name + "�̸�, " + 
		ob.age + "���̰� Ű�� " + ob.tall + "cm�Դϴ�");
	}
}
