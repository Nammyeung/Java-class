package family;

public class Son extends Family implements Job{
	public Son() {
		super();
	}
	public Son (String name) {
		super(name);
	}
	public String work() {
		return "아들은 공부를 한다.\n";
	}
	public String toString() {
		return super.toString() + work();
	}
}
