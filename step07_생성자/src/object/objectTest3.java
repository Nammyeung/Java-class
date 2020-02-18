package object;

/* 클래스명 : Emp
 * -name : String
 * -dept : String
 * -salary : int
 * 
 * +setEmp(name:String,dept:String,salary:int):void
 * +printEmp():void
 *	--홍길동 사원은 개발부에 근무하여 1520000원의 급여를 받아요

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
		return name + "은 " + dept + "에 근무하며 " + salary + "원의 급여를 받습니다"; 
	}
	
}



public class objectTest3 {
	
	public static void main(String[] args) {
		Emp3 emp = new Emp3(); // 생성자(객체 생성) = constructor, 만들어지는 것과 선언하는 것은 개념이 다르다.
		emp.setName("홍길동");
		emp.setDept("개발부");
		emp.setSalary(1520000);
		System.out.println(emp.toString());
		
		System.out.println("이름 : " + emp.getName());
		System.out.println("부서 : " + emp.getDept());
		System.out.println("급여 : " + emp.getSalary());
		
		
		
		
	
		
	}

}
