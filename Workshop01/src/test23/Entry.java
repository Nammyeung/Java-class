package test23;

public class Entry {
	private String word;
	public Entry() {
		super();
		System.out.println("***** 약어사전 *******"); // ** 약어사전 ** 출력
	}
	public Entry(String word) {
		this();
		this.word = word;
	}
	public String toString() {
		return "약어 : " + word;
	}
}
