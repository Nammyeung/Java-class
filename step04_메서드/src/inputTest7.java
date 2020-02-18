package inputex;

public class inputTest7 {

	public static void main(String[] args) {
		int eno = Integer.parseInt(args[0]); // argument를 받음 / parsing을 해줘야함.
		String ename = args[1];
		char dept = args[2].charAt(0); //[ | |A \r \n| | ]
									   //   [0] [1] [2]
		double score = Double.parseDouble(args[3]);
		
		System.out.printf(
				"사원번호 : %d\n사원이름 : %s\n부서코드 : %c\n입사성적 : %.1f\n"
				,eno, ename, dept, score); // argument로 전달 : 1. run 2. Run configuration 3. argument 4. variable 5. 쉼표 없이 값 입력
	
	}

}
