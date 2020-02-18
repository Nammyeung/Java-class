package staticex;

class Test { // static 변수 / static 메소드
	int x;
	int y;
	static int z; // 이탤릭체로 표현
	
	/*
	 * static { System.out.println("static 초기화 영역"); }
	 */
	
	public Test(int x, int y, int z1) {
		this.x=x;
		this.y=y;
		z=z1;
		System.out.println("객체 초기화 영역");
	}
	public void view() {
		System.out.println(x+"  " + y + "  " + z);
	}
	
	static { System.out.println("static 초기화 영역"); } // 가장 먼저 나옴.
}

public class StaticEx1 {

	public static void main(String[] args) {
		Test ob1 = new Test(1, 2, 3);
		
		
		ob1.view();
		Test ob2 = new Test(4, 5, 6);
		ob2.view();
	}

}

// 비중값이 되는 경우 static