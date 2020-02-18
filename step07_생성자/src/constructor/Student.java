package constructor;
// ���� VO�� ���� / VO : value object : ���� ������ �뵵, �޸𸮿� �ִ� ������ ��򰡿� ������, 
// ������ ���̽��� ���, �����ͺ��̽� ���Ǿ� ���(DBMS �ϵ��ũ�� �޸𸮷� �ҷ��´�, �޸� �󿡼� ����) OR PPO
public class Student {
	private String name;
	private int kor;
	private int mat;
	private int eng;
	public Student() { // ����Ʈ ������ �ݵ�� ó���� ����.
		super();
	}
	public Student(String name, int kor, int mat, int eng) { // Constructor
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
	@Override // Overrode : �Լ��� ���� ��� / Override : �θ�Ŭ������ �ִ�. []Object <- []
	public String toString() { // �̸� �ڷ��� ����
		return name + "�� ������ " + getTotal() + "���̸� ����� " + 
			String.format("%.2f", getAvg()) + "���̰� ������ " + getGrade() + "�Դϴ�.";
		
	}
	public int getTotal() {
		return kor + eng + mat ;
	}
	
	public double getAvg() {
		return getTotal() / 3.0;
	}
	
	public char getGrade() {
		switch((int)getAvg()/10) {
		case 10 : return 'A';
		case 9 : return 'B';
		case 8 : return 'C';
		case 7 : return 'D';
		case 6 : return 'E';
		// default: return 'F';
		
		}
		return 'F';
	}
	
	//  CPU -  RAM <-> ������ġ, �����͸� �ҷ����ų� ���ų�
	//			|
	//			[]
	
	
	
	
}
