package test23;

public class Entry {
	private String word;
	public Entry() {
		super();
		System.out.println("***** ������ *******"); // ** ������ ** ���
	}
	public Entry(String word) {
		this();
		this.word = word;
	}
	public String toString() {
		return "��� : " + word;
	}
}
