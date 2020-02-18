package test;
//vo 용도
// -id : String
// -pw : String
// -name : String
// -point : double
// +생성자, 게터, 세터
public class User {
	private String id;
	private String pw;
	private String name;
	private double point;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String id, String pw, String name, double point) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	
	
}
// 사이트 접속, 로그인(***님이 접속하셨습니다.), 로그데이터가 축적되겠지