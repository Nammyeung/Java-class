package interfaceex;
/* class 와 interface를 이용하여 성적처리
 * 클래스 : User
 * -name : String
 * +User()
 * +User(name:String)
 * +toString():String
 * 
 * 인터페이스 Score
 * +sol:int	(초기값:20) // 배점
 * +getScore():int // 맞은 수 * sol(3)을 리턴 / 인터페이스에서는 메소드를 정의만 하고 선언만 하면 안된다.
 * 
 * 인터페이스 Print
 * +toPaint():String
 * 
 * --출력화면
 * 이름 : 홍길동
 * 점수 : 60점 // 초기값 : 20 점수에서 main함수에 생성자를 만들어서 super를 통해 전달.
 * 
 */
// interface => 응집도 높이고 결합도 낮추고
// [] 회사의 부서가 여러군데, 특정한 부서내부에 사람들이 정보를 공유 
// if 응집도가 낮으면 => 서로간에 연결이 안되는 각개전투 구조(공유가 안되는?)
// 결합도 부서안에서 내부적으로 업무 처리가 불가능하면 외부에 가서 업무 협의를 해야 하는 상태 => 업무를 처리하기 위해서 복잡한 결재 라인을 사용 => 응고결정(메소드를 어떻게 사용할 것인가, 독립적으로 작동하는가)


class User {
	private String name; // 변수값을 만들어주는 역할
	
	public User() {
		super();
	}
	
	public User(String name) {
		super();
		this.name = name;
	}

	public String toString() {
		return "이름 : " + name;
	}
	
}
interface Score{
	public int sol = 20;
	public int getScore() ; // 맞은 수를 받아야 하므로 나중에 오버라이드를 위해 선언만 해주고 끝, 맞은수 * sol을 리턴
}

interface Print{
	public String toPaint();
}
//[user]	  o    o(상속)
//			->	->
//[]		

public class InterfaceEx4 extends User implements Score, Print { // unimplement 메소드 구현
	int s;
	public InterfaceEx4(String name, int s) { // 이 부분을 생각 못함, s를 참조하기 위한 메소드 선언?
		super();
		this.s = s;
	}
	public int getScore() {
		return s*sol; // 상속을 받았기 때문에 위의 변수를 그대로 사용 가능.
	}
	public String toPaint() {
		return "점수 " + getScore();// 변수의 상태(값)을 리턴
	}
	public static void main(String[] args) {
		InterfaceEx4 ob = new InterfaceEx4("홍길동", 3);
		System.out.println(ob.toPaint());
	}
}	
	
/*interface Print{
	public String toPaint(); // 인터페이스이므로 선언만 하고 끝을 낸다.
}	
	
	public class InterfaceEx4 {
	class User implements Score, Paint {
		private String name;
		
		public User() {
			super();
		}

		public User(String name) {
			this.name = name;
		}
				
		@Override
		public int getScore() {
			return sol;
		};
		@Override
		public String toPaint() {
			return "이름 : " + name + "점수 : " +  + "점";
			
		};
		
		public String toString() {
			return name;
		};
	}
	interface Score{
		final public int sol = 20;
		public int getScore();
		
		}
		
	}
	interface Paint{
		public String toPaint();
		}

	public static void main(String[] args) {
		InterfaceEx4 ob = new InterfaceEx4("홍길동",3);
		System.out.println(ob.toString());
	}	
}	

336 page ~ 
*/


