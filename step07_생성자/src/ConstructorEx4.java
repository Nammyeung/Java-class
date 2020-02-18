package constructor;

import java.util.Scanner;

/* Ŭ������ : ConstructorEx4
 * x:int
 * y:int
 * 
 * +ConstructorEx4()	--�Է�ó�� (��ĳ��)
 * +clac():int			--x*y ����
 * +display():void		--����ϱ�
 */
/* ****** ��� ******
 * ���θ� �Է� : 5
 * ���θ� �Է� : 4
 * 
 * �簢���� ���� : 20
 */
public class ConstructorEx4 {
	int x;
	int y;	
	public ConstructorEx4() { // return ���� ���� �ϴ��� ���ϴ��Ŀ� ���� �����ڰ� �����ǹǷ� void�� �־����� ����� ����.
		Scanner sr = new Scanner(System.in);
		System.out.println("���θ� �Է� : ");
		x = sr.nextInt();
		this.x = x;
		System.out.println("���θ� �Է� : ");
		y = sr.nextInt();
		this.y = y;
		sr.close();
	}
	// �� ������ ������� ��쿡 ������ �ϴ� ������ �����ڸ� ���� �����͸� �����Ű�� ������ ��������� ���������� ������ ������
	public int clac() {
		return x*y;
	}
	public void display() {
		System.out.println("���θ� �Է� : " + x + "\n���θ� �Է� : "
	+ y + "\n\n�簢���� ���� : " + clac());
	}


	public static void main(String[] args) {
		new ConstructorEx4().display();
		
	}

}

/*
 * public ConstructorEx4() { // ������ �ڵ� ���� ����Ű Alt + Shift + s
 * 	Scanner sc = new Scanner(System.in);
 *  System.out.print("���θ� �Է� : ");
 *  sc.nextInt();
 *  System.out.print("���θ� �Է�: " );
 *  sc.nextint();
 *  
 *  ������� - class(Ŭ����) => ���¿� ������ ��ȭ�ϴ� ����
 *  (sell() - �Ĵ� ������ ó��) => ����(�Լ�) ���� => ����� ����(�Լ�)�� �������� ���
 *  ---------------------------------------
 *  ��ü �������   |	����
 *  	����    |	����
 * 		��¡��    |	�а�
 *  	�öѱ�    |	(buy() - ������ ó��)
 *  	���� : ������
 *  ---------------------------------------
 *     �������	sell()
 *     ���		-10
 *     �а�
 *     ������
 *  ---------------------------------------
 *  new ������� ����
 */  
