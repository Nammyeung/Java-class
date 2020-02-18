package constructor;

public class ConstructorEx7 {

	public static void main(String[] args) {
		Member ob1 = new Member("뽀로로",22);
		ob1.view();
	
		Member ob2 = new Member(); //에러 - 찾지를 못함(디폴트 생성자를 만들지 않는 경우)
		ob2.view();
	}

	

}
