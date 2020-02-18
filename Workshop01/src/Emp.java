package test21;

public class Emp {
	public String name;
	public String Dept;
	public int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return name + "은 " + Dept + "사원이며 " + salary + "원의 급여를 받습니다.";
	}
	
	
	
}
