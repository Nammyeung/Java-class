package object;
// setter & getter : 멤버변수 하나당 하나씩 값을 대입하는 setter와
// 					 그 값을 리턴하는 getter

class Member{
	
	private String name; // private : 클래스 내부가 아닌 외부(메인함수)에서 접근을 할 수 없음
    private int age;
    private double tall;
    
    public void setName(String name) { // setter 함수를 외부에서 접근 가능 / set 함수의 name으로 접근
    	this.name = name; // 클래스 내부에 있기 때문에 name에 접근 가능.
    }
    // 매개변수는 멤버변수와 동일한 자료형을 지정
    public void setAge(int age) { // setter 함수를 외부에서 접근 가능 / set 함수의 name으로 접근
    	this.age = age; // 클래스 내부에 있기 때문에 name에 접근 가능.
    }
    
    public void setTall(double tall) { // setter 함수를 외부에서 접근 가능 / set 함수의 name으로 접근
    	this.tall = tall; // 클래스 내부에 있기 때문에 name에 접근 가능.
    }
    
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
    public double getTall() {
    	return tall;
    }
}

public class objectEx3 {

	public static void main(String[] args) {
		Member ob = new Member();
		ob.setName("강호동");
		ob.setAge(25);
		ob.setTall(178.8);
		System.out.println("이름 : " + ob.getName());
		System.out.println("나이 : "  + ob.getAge());
		System.out.println("신장: " + ob.getTall());

	}

}
