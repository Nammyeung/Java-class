package test23;

public class SubEntry extends Entry{
	private String definition;
	private int year;
	public SubEntry() {
		super();
	}
	public SubEntry(String definition, int year) {
		super();
		this.definition = definition;
		this.year = year;
	}
	public SubEntry(String word, String definition, int year) {
		super(word);
		this.definition = definition;
		this.year = year;
	}
	@Override
	public String toString() {
		return super.toString() + "\n원어 : " + definition + "\n시기 : " + year;
	}
}
