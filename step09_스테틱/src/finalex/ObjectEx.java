package finalex;

//import java.lang.Object; // ��������?
import java.lang.String;
import java.lang.System;

class Test{
	String name = "��ȣ��";
	/*
	 * public Test() { 
	 * super(); 
	 * }
	 */
	
	public void view() {
		System.out.println("�̸� : " + this.name.toString());// toString�� ����������� ������ �Ǿ� ����.
	}
	
	public String toString() {
		return name;
	}
}

public class ObjectEx {

	public static void main(String[] args) { // String[] args => �Ⱦ����� ��������.
		new Test().view();
		
		Test ob = new Test();
		ob.view();
	}

}
