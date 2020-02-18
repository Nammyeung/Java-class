package finalex;

//import java.lang.Object; // 생략가능?
import java.lang.String;
import java.lang.System;

class Test{
	String name = "강호동";
	/*
	 * public Test() { 
	 * super(); 
	 * }
	 */
	
	public void view() {
		System.out.println("이름 : " + this.name.toString());// toString이 비공식적으로 생략이 되어 있음.
	}
	
	public String toString() {
		return name;
	}
}

public class ObjectEx {

	public static void main(String[] args) { // String[] args => 안쓰려면 생략가능.
		new Test().view();
		
		Test ob = new Test();
		ob.view();
	}

}
