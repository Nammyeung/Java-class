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
class Emp {
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	
	public void printEmp() {
		System.out.println(this.name + " ����� " + this.dept + 
				"�� �ٹ��ϸ� " + this.salary + "���� �޿��� �޾ƿ�"); // ��� �ڷ����� void�� ��쿡 ���ϰ��� �����Ƿ� �̷���~
	}
	
	
}



public class objectTest1 {
	
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setEmp("ȫ�浿","���ߺ�",15200000);
		emp.printEmp();
		
	}

}
