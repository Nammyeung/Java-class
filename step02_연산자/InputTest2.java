package step02_������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * A���� �Է��ϼ��� : 15
 * B���� �Է��ϼ��� : 10
 * 
 * 15 + 10 = 25
 * 
 * 
 */
public class InputTest2 {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		System.out.print("A���� �Է��ϼ��� : ");
		float a = Float.parseFloat(br.readLine());
		System.out.print("B���� �Է��ϼ��� : ");
		float b = Float.parseFloat(br.readLine());
		System.out.printf("%.0f + %.0f = %.0f", a, b, a+b);
	}

}
