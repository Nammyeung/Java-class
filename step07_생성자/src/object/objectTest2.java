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
class Emp2 {
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	
	public String printEmp() {
		return (name + " ����� " + dept + "�� �ٹ��ϸ� " + salary + "���� �޿��� �޾ƿ�"); // ��� �ڷ����� void�� ��쿡 ���ϰ��� �����Ƿ� �̷���~
	}
	
	
}



public class objectTest2 {
	
	public static void main(String[] args) {
		Emp2 emp = new Emp2();
		emp.setEmp("ȫ�浿","���ߺ�",15200000);
		System.out.println(emp.printEmp()); // return���� ����ϸ� ����� �����Լ�����
		
	}

}
