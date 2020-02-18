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
		return (name + " 사원은 " + dept + "에 근무하며 " + salary + "원의 급여를 받아요"); // 출력 자료형이 void인 경우에 리턴값이 없으므로 이렇게~
	}
	
	
}



public class objectTest2 {
	
	public static void main(String[] args) {
		Emp2 emp = new Emp2();
		emp.setEmp("홍길동","개발부",15200000);
		System.out.println(emp.printEmp()); // return문을 사용하면 출력을 메인함수에서
		
	}

}
