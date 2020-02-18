package emp;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		System.out.println("**** 모든 사원 출력하기 ****");
		
		List<EmpVO> list = dao.getEmpList(); // 파일이 갈라지는 경우 통일시켜 주는 것이 필요, <Object>도 가능
		for(EmpVO ob: list) {
			System.out.println("이름 : " + ob.getName() + "\t");
			System.out.println("부서 : " + ob.getDept() + "\t");
			System.out.println("급여 : " + ob.getSalary() + "\t");
		}
		//----------------------------------------------------------------------------
		System.out.println("***** lee 사원 출력하기 *****");
		EmpVO vo = dao.getEmp("lee");
		
		if(vo==null) {
			System.out.println("찾는 사원이 없어요...");
		} else {
			System.out.println(vo.getName() + "	" +
					vo.getDept() + "	" + vo.getSalary());
		}
		

	}

}
