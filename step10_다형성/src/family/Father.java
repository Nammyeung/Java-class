package family;

public class Father extends Family implements Job{
	public Father() {
		super();
	}
	public Father (String name) {
		super(name);
	}
	public String work() {
		return "�ƺ��� ������ �����Ѵ�.\n";
	}
	public String toString() {
		return super.toString() + work();
	}
}
