package test22;

public class SalarySub extends Salary{
	private String dept;
	public SalarySub() {
		
	}
	public SalarySub(String dept) {
		super();
	}
	public SalarySub(String name, int salary, String dept) {
		super(name,salary);
		this.dept = dept;
	}
	@Override
	public String toString() {
		return super.toString() + "ºÎ¼­ : " + dept;
	}
}
