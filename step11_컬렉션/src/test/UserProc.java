package test;
//비즈니스 로직(데이터 베이스 연동 처리) => DAO의 앞단계(DAO 정의 =  Data Access Object)
import java.util.ArrayList;
import java.util.List;

import emp.EmpVO;

// 사용자 처리 = User Processor
public class UserProc {

//	public UserProc() {
//		super();
//		list = new ArrayList<User>(); // 생성자 호출
//		list.add(new User("pororo", "1234", "뽀로로", 89.97));
//	}

	public User getLoginUser(String id, String pw) {
		/*
			매개변수로 들어온 pororo, 1234를 비교하여 
			맞으면 entity 객체를 만들어서
			setter를 통해 id, pw, "뽀로로", 89.97을 대입하세요. 
			// 데이터베이스와 연결이 되어있지 않기 때문에 각각의 값을 대입
		*/
		User entity = null; // 분리하면 안된다, 값이 없는 상태일때를 하나 만들어줘야 한다, else로 null을 표출하는 것과 똑같은 개념?
		if(id.equals("pororo") && pw.equals("1234")) { // 해당 조건을 만족하면
			entity = new User();
			entity.setId(id); // 데이터베이스가 없으므로 값을 대입
			entity.setPw(pw);
			entity.setName("뽀로로");
			entity.setPoint(89.97);
		
		}
		return entity;
	}
}

