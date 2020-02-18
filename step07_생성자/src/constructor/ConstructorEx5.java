package constructor;

public class ConstructorEx5 {

	public static void main(String[] args) {
		Student st = new Student();
		st.setName("뽀로로");
		st.setKor(95);
		st.setEng(85);
		st.setMat(73);
		//뽀로로의 점수는 253점이며 평균은 84.33점이고 학점은 B입니다.
		System.out.println(st.toString());
		Student ss = new Student("진달래", 95, 85, 73);
		System.out.println("이름 : " + ss.getName());
		System.out.println("국어 : " + ss.getKor());
		System.out.println("영어 : " + ss.getEng());
		System.out.println("수학 : " + ss.getMat());
		System.out.println("총점 : " + ss.getTotal());
		System.out.printf("평균 : %.2f\n", ss.getAvg()); // 콤마 주의
		System.out.println("학점 : " + ss.getGrade());

	}

	
}
