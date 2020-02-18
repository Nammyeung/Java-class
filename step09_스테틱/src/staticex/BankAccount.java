package staticex;

public class BankAccount {
	private int year;
	private String name;
	private int money;
	private static double rate;// static 변수
	public BankAccount(int year, String name, int money, double r) {
		super();
		this.year = year;
		this.name = name;
		this.money = money;
		rate = r;
	}
	
	public static void setRate(double r) { // static 변수를 제어하는 함수
		//유효성 검사
		if(r < 0.02 || r > 0.12) {
			System.out.println("금리를 확인하고 입력하세요~");
			System.exit(0);
		}
		rate = r;
		
	}
	public void view() {
		System.out.println(year+"\t"+name+"\t"+money+"\t"+rate);
		
	}
}

// [] year [] year but [] rate => 오직 하나(static)