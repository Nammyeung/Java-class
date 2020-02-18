package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * A값을 입력하세요 : 15
 * B값을 입력하세요 : 10
 * 
 * 15 + 10 = 25
 * 
 * 
 */
public class InputTest2 {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		System.out.print("A값을 입력하세요 : ");
		float a = Float.parseFloat(br.readLine());
		System.out.print("B값을 입력하세요 : ");
		float b = Float.parseFloat(br.readLine());
		System.out.printf("%.0f + %.0f = %.0f", a, b, a+b);
	}

}
