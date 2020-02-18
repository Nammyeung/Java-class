package constructor;
// 웹의 VO의 형태 / VO : value object : 값을 가지는 용도, 메모리에 있는 내용이 어딘가에 엑세스, 
// 데이터 베이스를 사용, 데이터베이스 정의어 사용(DBMS 하드디스크를 메모리로 불러온다, 메모리 상에서 동작) OR PPO
public class Student {
	private String name;
	private int kor;
	private int mat;
	private int eng;
	public Student() { // 디폴트 생성자 반드시 처음에 구현.
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
	
	@Override // Overrode : 함수를 같이 사용 / Override : 부모클래스가 있다. []Object <- []
	public String toString() { // 이름 자료형 동일
		return name + "의 점수는 " + getTotal() + "점이며 평균은 " + 
			String.format("%.2f", getAvg()) + "점이고 학점은 " + getGrade() + "입니다.";
		
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
	
	//  CPU -  RAM <-> 저장장치, 데이터를 불러오거나 쓰거나
	//			|
	//			[]
	
	
	
	
}
