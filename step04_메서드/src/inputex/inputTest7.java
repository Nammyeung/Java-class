package inputex;

public class inputTest7 {

	public static void main(String[] args) {
		int eno = Integer.parseInt(args[0]); // argument�� ���� / parsing�� �������.
		String ename = args[1];
		char dept = args[2].charAt(0); //[ | |A \r \n| | ]
									   //   [0] [1] [2]
		double score = Double.parseDouble(args[3]);
		
		System.out.printf(
				"�����ȣ : %d\n����̸� : %s\n�μ��ڵ� : %c\n�Ի缺�� : %.1f\n"
				,eno, ename, dept, score); // argument�� ���� : 1. run 2. Run configuration 3. argument 4. variable 5. ��ǥ ���� �� �Է�
	
	}

}
