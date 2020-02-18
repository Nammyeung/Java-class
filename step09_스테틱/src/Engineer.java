package employee;
/* --Emp 상속
 * -salary:long
 * -bonus:long
 * +Engineer()
 * +Engineer(eno, ename, phone)
 * +toString():String
 * 
*/
public class Engineer extends Emp{
	long salary;
	long bonus;
	
	public Engineer() {
		super();
	}
	
	public Engineer(int eno, String ename, String phone) {
		super(eno, ename, phone);
	}
	
	@Override
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public void setBonus(long bonus) {
		this.bonus = bonus + 150000;
		// this.bonus += bonus or 150000 => 값을 정상적으로 대입할 수 없는 구조.
	}
	public String toString() {
		return "사원번호 : " + getEno()
		+ "\n사원이름 : " +  getEname()
		+ "\n내선번호 : " +  getPhone()
		+ "\n기본급여 : " +  salary
		+ "\n보너스 + 수당 : " + bonus		
		+ "\n지급금액 : " +  (salary+bonus)+"원\n"
		;
	}
}
// 상속을 받아서 사용하면 비슷한 코드를 같이 사용 가능