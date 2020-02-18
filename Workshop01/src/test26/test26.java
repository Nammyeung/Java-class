package test26;

	class BaseTest {
		String name = "¹Îµé·¡";
		int salary = 12000000;
		
		public BaseTest() {
			super();
		}
		
		public BaseTest(String name, int salary) {
			super();
			this.name = name;
			this.salary = salary;
		}

		public void getDisplay() {
		}
	}
	class DerivedTest extends BaseTest{
		String department = "È«º¸ºÎ";
		
	public DerivedTest() {
		super();
		}
	
	public DerivedTest(String department) {
		super();
		this.department = department;
	}
	@Override
	public void getDisplay() {
		System.out.println(("ÀÌ¸§ : " + name +"\n¿¬ºÀ : " + salary + "\nºÎ¼­ : " + department));
	}
	}
	
	public class test26 {
	public static void main(String[] args) {
		BaseTest bt = new DerivedTest();
		bt.getDisplay();
		

	}

}
