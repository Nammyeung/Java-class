package test17;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public void setStudent(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public int getTotal() {
		return kor + eng + mat ;
	}
	public double getAvg() {
		return getTotal() / 3.0;
	}
	public char getGrade() {
		int cal = (int)(getAvg() / 10);
		switch(cal) {
		case 9 : return 'A';
		case 8 : return 'B';
		case 7 : return 'C';
		case 6 : return 'D';
		case 5 : return 'E';
		default : return 'F';
		}
	}
	public String getResult() {
		if(getGrade() <= 'B') {
			return "�հ�";
		} else {
			return "���հ�";
		}
		
	}
	
	public String getView() {
		return "���� �̸��� " + name + "�̰� ������ " + getTotal() + "���̰� ����� " + getAvg() + "�̰� ������ "
				+ getGrade() + "�����̸� ����� " + getResult() + "�Դϴ�";
	}
}
