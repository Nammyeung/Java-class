package object;

/* -name : String
 * -dept : String
 * -pay : int
 * -score : double
 * 
 * +setName(name:String):void
 * +setDept(dept:String):void
 * +setPay(pay:int):void
 * +setScore(score:String):void
 * 
 * +getName():String
 * +getDept():String
 * +getPay():int
 * +getScore():double
 * 
 *  
*/

public class Employee {
	private String name; // 변수에 접근하는 경우 1. 값을 저장(setter) 2. 저장한 값을 불러올 때(getter).
	private String dept; // 변수의 외부에서 직접 접근을 막기 때문에 값의 유효성 검사는 가능하게 만듬.(객체지향?), 유지보수, 보안의 목적
	private int pay; // 데이터베이스에서 넘어가는 갑을 인터셉트를 하는데 getter, setter(유효성 검사 수행)를 사용하면(방법 : 매개변수를 하나 더 던짐)
	private double score;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getPay() {
		return pay;
	}
	public double getScore() {
		return score;
	}
	
	@Override // 상속을 받아서 사용한다.
	public String toString() {
		return "이름은 " + name + "이고, " + dept + "에 근무하며," + 
	"급여는  " + pay + "원, 입사성적은 " + score + "점입니다";
	}
	
	public void setEmployee(String name, String dept, int pay, double score) {
		this.name = name;
		this.dept = dept;
		this.pay = pay;
		this.score = score;
	}
}



//Source => Generate Getters and Setters => 