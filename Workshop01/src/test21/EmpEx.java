package test21;

public class EmpEx {
	public static void main(String[] args) {
		
	
	Emp em = new Emp();
	em.setName("강호동");
	em.setDept("영업부");
	em.setSalary(1200000);
	System.out.println(em.toString());
	System.out.println();
	System.out.println("이름 : " + em.getName());
	System.out.println("부서 : " + em.getDept());
	System.out.println("급여 : " + em.getSalary() + "원");
	
	}
}
