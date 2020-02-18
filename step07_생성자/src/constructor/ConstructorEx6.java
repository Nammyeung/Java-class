package constructor;

import java.util.Scanner;

/* 생성자에서 두 수를 입력받아 큰 수 작은 수를 출력하세요
* show() 메서드에서  maxValue(), minValue()를 호출할 것.
*
* 클래스 : Max
* -a : int
* -b : int
* +Max()
* +MinValue():int
* +minValue():int
* +show():void
* --출력
* Input a : 5
* Input b : 3
* 
* 큰 수 : 5
* 작은 수 : 3
* 
* 
*/ 
//생성자 : 객체 생성 (값대입, 입력처리)ㅡ 생성자에 코드를 전부다 넣기도 한다. / 메모리상에 구조 실체화
class Max {
	private int a;
	private int b;
	
	public Max() {
		Scanner sr = new Scanner(System.in);
		System.out.println("a를 입력 : ");
		a = sr.nextInt();
		this.a = a;
		System.out.println("b를 입력 : ");
		b = sr.nextInt();
		this.b = b;
		sr.close();
	}
	public int MaxValue() {
		return a >= b ? a : b;
	}

	public int MinValue() {
		return a <= b ? a : b;
	}
	public void show() {
		System.out.println("큰수 : " + MaxValue() + "\n작은수 : " + MinValue());
	}
	
}

public class ConstructorEx6 {
	
	public static void main(String[] args) {
		Max max = new Max(); // or new Max().show();
				
		max.show();

	}

}

/* ----------답안-------------
 * class Max {
 * 	private int a;
 *  private int b;
 *  public Max() {
 *  	Scanner sc = new Scanner(System.in);
 *  	System.out.print("Input a : ");
 *  	a = sc.nextInt();
 *  	System.out.print("Input b : ");
 *  	b = sc.nextInt();
 *  sc.close()
 *  }
 *  public int maxValue() {
 *  	return (a>b)?a:b;
 *  }
 *  public int minValue() {
 *  	return (a<b)?a:b;
 *  }
 *  public void show() {
 *  	System.out.println("큰수 : " + maxValue());
 *  	System.out.println("작은수 : " + minValue());
 *  
 *  public class ConstructorEx6 {
 *  
 *  	public static void main(String[] args) {
 *  		new Max().show();
 *  }
 */

