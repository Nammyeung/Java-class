package test14;

public class EmpEx {
	
	public static void main(String[] args) {
		Emp ob = new Emp();
		ob.setEmp("이순신", 25, 175.3);
		ob.viewEmp();
		System.out.println("나의 이름은 " + ob.name + "이며, " + 
		ob.age + "살이고 키는 " + ob.tall + "cm입니다");
	}
}
