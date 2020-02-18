package object;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				
		/*
		 * System.out.print("문자 : "); char c = sc.nextLine().charAt(0); // 버퍼를 안비워서 그렇다?
		 */			
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			
			System.out.print("정수 : ");
			int a = sc.nextInt();
			
			System.out.print("실수 : ");
			double b = sc.nextDouble();
			sc.nextLine(); // 버퍼 비우기  \r\n 
			// 버퍼를 비우는 역할(Scanner의 경우)
			
			System.out.print("문자 : ");
			char c = sc.next().charAt(0); // 버퍼를 안비워서 그렇다?, 단어 단위로 판단(next()) => 버퍼 신경쓰지 않아도 됌.
			// 12.3\r\n - 버퍼(뒤의 \r\n을 물고 들어감) 입력
			System.out.println(str);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			sc.close();
	}

}
