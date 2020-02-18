package test16;

class Login {
		
		public String id;
		public String pw;
				
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
		
		public String viewLogin() {
			return "아이디는 " + id + "이고 비밀번호는 " + pw + "입니다";
		}
				
		public void setLogin(String id, String pw) {
			this.id = id;
			this.pw = pw;
		}
}
public class LoginEx {	

public static void main(String[] args) {
		Login ob = new Login();
		ob.setLogin("pororo","1234");
		System.out.println(ob.viewLogin());
	
	}
}



