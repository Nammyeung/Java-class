package instance;

abstract class Employee{
	String name;
	int salary;
	public Employee() {
		
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	abstract public int getBonus() ;
	public String toString() {
		return name + "\t" + salary + "\t";
	}
}

//--------------------------------------------------------------------------
class Engineer extends Employee{

	public Engineer() {
		super();
	}

	public Engineer(String name, int salary) {
		super(name, salary);		
	}
	
	@Override
	public int getBonus() {
		return 150000;
	}
	@Override
	public String toString() {
		return super.toString() + getBonus();
	}
}

class Developer extends Employee{

	public Developer() {
		super();
	}

	public Developer(String name, int salary) {
		super(name, salary);		
	}
	
	@Override
	public int getBonus() {
		return 100000;
	}
	@Override
	public String toString() {
		return super.toString() + getBonus();
	}
}


public class InstanceofEx2 {

	public static void main(String[] args) {
		Employee[] em = new Employee[] {
				new Engineer("kim", 1200000),
				new Developer("lee", 1750000),
				new Engineer("park", 2500000),
				new Developer("hong", 2350000)
		};
		System.out.println("이름            급여            정규보너스   특별보너스");
		System.out.println("------------------------------------------------");
		//엔지니어는 급여의 13%, 개발자는 15%의 특별보너스를 지급
		for(Employee ob: em) {
			if(ob instanceof Engineer) {// Engineer에 소속되어 있는 ob를 추출
				System.out.println(ob.toString()+"\t"+(int)(ob.salary*0.13));
		} else if(ob instanceof Developer) // Engineer에 소속되어 있는 ob를 추출
				System.out.println(ob.toString()+"\t"+(int)(ob.salary*0.15));
		}
	}

}
