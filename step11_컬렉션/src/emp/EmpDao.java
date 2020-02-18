package emp;
// dao (data access object) : 데이터베이스에서 자원을 가져올 용도로 사용하는 클래스

import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	// 값을 저장하는 구간을 만들기
	List<EmpVO> list = null;
			// database에 뭐가 있다고 가정, 데이터 객체가 들어감
	public EmpDao() {
		list = new ArrayList<EmpVO>(); // 생성자 호출
		list.add(new EmpVO("kim",  "영업부",  1000000));
		list.add(new EmpVO("lee",  "개발부",  1500000));
		list.add(new EmpVO("park",  "관리부",  2000000));
	}
	// INSERT 역할
	// 데이터베이스에 데이터가 저장되어 있는 상태, 데이터베이스 접속에 대한 처리
	public List<EmpVO> getEmpList() { // <Object>도 가능, 최상위 슈퍼클래스이기 때문에..
		
		return list;
	}
	public EmpVO getEmp(String name) {
		
		for(EmpVO vo:list) {
			if(vo.getName().equals(name))
				return vo;		// name : 넘어온 값
		}
		return null;
	}
// getEmp => SELECT의 역할, getEmpList => List를 SELECT
}


/* vo []  <=> do [] <=> []
사원정보의 SELECT, INSERT 작업을 담당


*/