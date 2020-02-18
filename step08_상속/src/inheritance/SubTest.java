package inheritance;

public class SubTest extends SuperTest{
	private int age;
	private double score;
		
	public SubTest() {
		super();
		
	}

	public SubTest(String name, String addr, int age, double score) {
		super(name, addr);
		this.age = age;
		this.score = score;
		
	}

	//toString()완성해주세요
	public String toString() {
		// Overriding을 했기 때문에 출력이 되지 않는다.
		return super.toString() + "\n나이는 " + age + "세이고 점수는 " + score + "점입니다.";
	}
	public static void main(String[] args) {
		SubTest ob = new SubTest("크롬", "강남", 23, 85.4);
		System.out.println(ob.toString());
		//이름은 크롬이고 사는 곳은 강남입니다.
		//나이는 23세이고 점수는 85.4점입니다.
	
	}

}
