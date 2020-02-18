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
			return "합격";
		} else {
			return "불합격";
		}
		
	}
	
	public String getView() {
		return "나의 이름은 " + name + "이고 총점은 " + getTotal() + "점이고 평균은 " + getAvg() + "이고 학점은 "
				+ getGrade() + "학점이며 결과는 " + getResult() + "입니다";
	}
}
