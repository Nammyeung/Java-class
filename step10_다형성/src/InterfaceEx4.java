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


