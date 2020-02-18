package family;

public class Father extends Family implements Job{
	public Father() {
		super();
	}
	public Father (String name) {
		super(name);
	}
	public String work() {
		return "아빠는 나가서 일을한다.\n";
	}
	public String toString() {
		return super.toString() + work();
	}
}
