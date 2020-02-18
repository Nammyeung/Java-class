package constructor;

public class Member {
	
	private String name = "패티";
	private int age = 22;
	public Member() {
		// name = "패티"; / 상위 선언과 같은 역할을 수행
		// age = 22;
	}
	
	public Member(String name, int age) { // 매개변수가 있는 생성자를 만들면 매개변수가 없는 생성자를 오류가 나므로 디폴트 생성자를 필수로 만들어야 함.
		this.name = name;
		this.age = age;
	}
	
	public void view() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
