package employee;
/* --Emp 상속
 * -eno:int
 * -ename:String
 * -phone:String
 * 
 * +Emp()
 * +Emp(eno:int, ename:String, phone:String)
 * +getter
 * +setSalary(salary:long):void	--abstract
 * +setBonus(bonus:long):void	--abstract
 * 

*/
abstract public class Emp {
	private int eno;
	private String ename;
	private String phone;
	
	public Emp() {
		super();
	}
	public Emp(int eno, String ename, String phone) {
		this.eno = eno;
		this.ename = ename;
		this.phone = phone;
		
	}
	
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public String getPhone() {
		return phone;
	}
	
	abstract void setSalary(long salary);
	abstract void setBonus(long bonus);
	
}

// [][][][][][][][][][]<- 1byte * 8
// 기가, 페타

