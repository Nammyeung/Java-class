package object;

/* Ŭ������ : Emp
 * -name : String
 * -dept : String
 * -salary : int
 * 
 * +setEmp(name:String,dept:String,salary:int):void
 * +printEmp():void
 *	--ȫ�浿 ����� ���ߺο� �ٹ��Ͽ� 1520000���� �޿��� �޾ƿ�

*/

class Emp3 {
	private String name;
	private String dept;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return name + "�� " + dept + "�� �ٹ��ϸ� " + salary + "���� �޿��� �޽��ϴ�"; 
	}
	
}



public class objectTest3 {
	
	public static void main(String[] args) {
		Emp3 emp = new Emp3(); // ������(��ü ����) = constructor, ��������� �Ͱ� �����ϴ� ���� ������ �ٸ���.
		emp.setName("ȫ�浿");
		emp.setDept("���ߺ�");
		emp.setSalary(1520000);
		System.out.println(emp.toString());
		
		System.out.println("�̸� : " + emp.getName());
		System.out.println("�μ� : " + emp.getDept());
		System.out.println("�޿� : " + emp.getSalary());
		
		
		
		
	
		
	}

}
