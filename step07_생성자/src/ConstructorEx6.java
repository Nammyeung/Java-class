package constructor;

import java.util.Scanner;

/* �����ڿ��� �� ���� �Է¹޾� ū �� ���� ���� ����ϼ���
* show() �޼��忡��  maxValue(), minValue()�� ȣ���� ��.
*
* Ŭ���� : Max
* -a : int
* -b : int
* +Max()
* +MinValue():int
* +minValue():int
* +show():void
* --���
* Input a : 5
* Input b : 3
* 
* ū �� : 5
* ���� �� : 3
* 
* 
*/ 
//������ : ��ü ���� (������, �Է�ó��)�� �����ڿ� �ڵ带 ���δ� �ֱ⵵ �Ѵ�. / �޸𸮻� ���� ��üȭ
class Max {
	private int a;
	private int b;
	
	public Max() {
		Scanner sr = new Scanner(System.in);
		System.out.println("a�� �Է� : ");
		a = sr.nextInt();
		this.a = a;
		System.out.println("b�� �Է� : ");
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
		System.out.println("ū�� : " + MaxValue() + "\n������ : " + MinValue());
	}
	
}

public class ConstructorEx6 {
	
	public static void main(String[] args) {
		Max max = new Max(); // or new Max().show();
				
		max.show();

	}

}

/* ----------���-------------
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
 *  	System.out.println("ū�� : " + maxValue());
 *  	System.out.println("������ : " + minValue());
 *  
 *  public class ConstructorEx6 {
 *  
 *  	public static void main(String[] args) {
 *  		new Max().show();
 *  }
 */

