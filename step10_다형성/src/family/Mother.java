package family;

public class Mother extends Family implements Job{
	public Mother() {
		super();
	}
	public Mother (String name) {
		super(name);
	}
	@Override
	public String work() {
		return "엄마는 집안일을 한다.\n";
	}
	@Override
	public String toString() {
		return super.toString() + work();
	}
}
