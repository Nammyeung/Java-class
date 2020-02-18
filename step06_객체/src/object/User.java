package object;

/* - (private)	+(public)	#(protected)
 * +name : String
 * +k : int
 * +e : int
 * +m : int

	+setUser(name : String, k : int, e : int, m : int) : void
	+getUser() :int
	+getUser() : String // 겟유저는 겟토탈 호출
*/
public class User {
	public String name;
	public int k;
	public int e;
	public int m;
	
	public void setUser(String name, int k, int e, int m) {
		this.name = name;
		this.k = k;
		this.e = e;
		this.m = m;
		
	}
	public int getTotal(int k, int e, int m) {
		int total = k + e + m;
		return total;
		
		}
	public String getUser() {
		return "이름은 " + name + "이고, 총점은 " + getTotal(k, e, m) + "점입니다.";
		// getTotal(k, e, m) => k+e+m은 동작을 나타내기 때문에 함수로 분리를 해준다.
		// getter : 값을 리턴

	}
}
/*
 * ******************답안***************** 
 * public class User { 
 * public
 * String name; 
 * public int k; 
 * public int e; 
 * public int m;
 * public void setUser(String name, int k, int e, int m) {
 * 		/ this.name = name; (값을 넘겨준다, 메인함수의 값들이 이 함수를 통해서 위의 변수로 넘어간다)
 * 		  this.k = k;
 * 		  this.e = e;
 * 		  this.m = m;
 * }
 * public int getTotal() {
 * 		return 0; / k+e+m;
 * }
 * public String getUser() {
 * 		return ""; // 문자열 리턴 / "이름은 " + name + "이고, 총점은 " + getTotal() + "점입니다"
 * }
 // 기본구조    */