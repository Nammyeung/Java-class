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
		System.out.println("�̸�            �޿�            ���Ժ��ʽ�   Ư�����ʽ�");
		System.out.println("------------------------------------------------");
		//�����Ͼ�� �޿��� 13%, �����ڴ� 15%�� Ư�����ʽ��� ����
		for(Employee ob: em) {
			if(ob instanceof Engineer) {// Engineer�� �ҼӵǾ� �ִ� ob�� ����
				System.out.println(ob.toString()+"\t"+(int)(ob.salary*0.13));
		} else if(ob instanceof Developer) // Engineer�� �ҼӵǾ� �ִ� ob�� ����
				System.out.println(ob.toString()+"\t"+(int)(ob.salary*0.15));
		}
	}

}
