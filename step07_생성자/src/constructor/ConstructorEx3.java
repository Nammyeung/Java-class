package constructor;
//클래스명 : UserInfo
//-name : String
//-addr : String
//+UserInfo()
//+UserInfo(name:String, addr:String)\
//+getter
//---출력
// **** 주소록 ****	<-- 디폴트 생성자에서 출력
//이름 : 도라에몽	<-- main()에서 getter를 이용해서 출력
//주소 : 서울시 강남구	<-- main()에서 getter를 이용해서 출력

class UserInfo {
	private String name; // 3
	private String addr; // 4
	
	public UserInfo() {
		System.out.println("**** 주소록 ****"); // 6
	
	}
	public UserInfo(String name, String addr) { // 2
		this(); // 생성자 형성, 5
		this.name = name; // main함수에 출력, 2
		this.addr = addr; // 2
	}
	// generate Constructor using field.
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}

public class ConstructorEx3 {
			
	public static void main(String[] args) {
		UserInfo ob = new UserInfo("도라에몽","서울시 강남구"); // 1
		System.out.println("이름 : " + ob.getName()); // 7
		System.out.println("주소 : " + ob.getAddr()); // 메인함수 수정 x, 8

	}

}

/* public UserInfo() {
 * 	super(); // super클래스를 호출(상속) => 의미가 없다? object class
 * public UserInfo(String name, String addr) {
 * 
 * 
 * 
 */

