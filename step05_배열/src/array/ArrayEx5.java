package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ũ�Ⱑ 5���� ������ �迭�� ��� �迭�� �����͸�
 * �Է¹޾Ƽ� ����ϰ� �ִ�, �ּҰ��� ���ϼ���.
 * 
 * -���
 * ar[0]�� ���� �Է� : 25
 * ar[1]�� ���� �Է� : -34
 * ar[2]�� ���� �Է� : 10
 * ar[3]�� ���� �Է� : 16
 * ar[4]�� ���� �Է� : 8
 * 
How
�迭 �ʱ�ȭ => �Է��� �ݺ������� ó�� => ���
*/

public class ArrayEx5 {

	public static void main(String[] args) throws IOException, NumberFormatException{
		// �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���
		int[] ar = new int[5];
		for(int i = 0 ; i < ar.length ; i++ ) {
			System.out.println("ar[" + i +"]���� �Է� : ");
			ar[i] = Integer.parseInt(br.readLine());
		}
		int max = ar[0];
		int min = ar[0];
		for(int i = 0 ; i < ar.length ; i++ ) {
			if(max < ar[i]) {
				 max = ar[i];
			} 
			if(min > ar[i]) {
				 min = ar[i];
			}
		}	
		//���
		for(int data:ar ) {
			 System.out.print(data + "  ");
		}
		System.out.println("\n");
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

	}

}

// ���� ����
/*
 * BufferedReader br = new BufferedReader(System.in); InputStreamReader isr =
 * new InputStreamReader(br);
 * 
// �Է�
 * for(int i = 0 ; i < ar.length ; i++) {
 * 	System.out.println("ar[0]�� ���� �Է� : "); / �ʱ⿡�� Ư�� ����� ����ְ� �Է��� �ߵǸ� �ݺ����� �־��ش�.
 * 	ar[0] = Integer.parseInt(br.readLine());
 *  
 * ->
 * for(int i = 0 ; i < ar.length ; i++) {
 * System.out.println("ar[" + i +"]���� �Է� : ");
 * ar[i] = Integer.parseInt(br.readLine()); * 
// ���
 * for(int data:ar ) {
 * System.out.print(data + "  ");
 * System.out.println("�ִ밪 : " + max);
 * System.out.println("�ּҰ� : " + min);
 *}
 */