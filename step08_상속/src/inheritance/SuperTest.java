package inheritance;

public class SuperTest {
	
	private String name;
	private String addr;
	
	public SuperTest() {
			super();
	}
	public SuperTest(String name, String addr) {
			super();
			this.name = name;
			this.addr = addr;

	}
	
	@Override
	public String toString() {
		return "이름은 " + name + "이고 사는 곳은 " + addr + "입니다";
	}

}
