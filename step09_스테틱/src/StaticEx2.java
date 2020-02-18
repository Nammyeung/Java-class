package staticex;

public class StaticEx2 {

	public static void main(String[] args) {
		System.out.println("*** 입금 당시의 금리 ***");
		BankAccount ba1 = new BankAccount(1994, "kim", 1000, 0.07);
		ba1.view();
		BankAccount ba2 = new BankAccount(1998, "kim", 1000, 0.12);
		ba2.view();
		BankAccount ba3 = new BankAccount(2005, "kim", 1000, 0.05);
		ba3.view();
		
		System.out.println("\n\n*** 2005년 현재의 금리 ***");
		ba1.view(); // static은 전역으로 영향을 미친다. 이전의 값을 기억하지 못한다.
		ba2.view();
		ba3.view();
		
		System.out.println("\n\n*** 0.04로 변동된 금리 ***");
		BankAccount.setRate(0.13);
		ba1.view();
		ba2.view();
		ba3.view();
		// BankAccount.rate = 0.04; // 허용이 되지 않음
		// static은 전역으로 영향을 미친다. 이전의 값을 기억하지 못한다.
	}

}

/*자바에서의 초기화는 4가지가 있습니다. 

1. staic 초기화

2. 인스턴스 초기화

3. 명백한 초기화

4. 생성자 초기화 

가 존재합니다.

non-static 멤버 VS static 멤버
non-static 멤버

공간적 특성: 멤버는 객체마다 별도로 존재한다.
인스턴스 멤버 라고 부른다.
시간적 특성: 객체 생성 시에 멤버가 생성된다.
객체가 생길 때 멤버도 생성된다.
객체 생성 후 멤버 사용이 가능하다.
객체가 사라지면 멤버도 사라진다.
공유의 특성: 공유되지 않는다.
멤버는 객체 내에 각각의 공간을 유지한다.

static 멤버

공간적 특성: 멤버는 클래스당 하나가 생성된다.
멤버는 객체 내부가 아닌 별도의 공간에 생성된다.
클래스 멤버 라고 부른다.
시간적 특성: 클래스 로딩 시에 멤버가 생성된다.
객체가 생기기 전에 이미 생성된다.
객체가 생기기 전에도 사용이 가능하다. (즉, 객체를 생성하지 않고도 사용할 수 있다.)
객체가 사라져도 멤버는 사라지지 않는다.
멤버는 프로그램이 종료될 때 사라진다.
공유의 특성: 동일한 클래스의 모든 객체들에 의해 공유된다.

*/
