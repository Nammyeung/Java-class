package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 크기가 5개인 정수형 배열을 잡고 배열에 데이터를
 * 입력받아서 출력하고 최대, 최소값을 구하세요.
 * 
 * -결과
 * ar[0]의 값을 입력 : 25
 * ar[1]의 값을 입력 : -34
 * ar[2]의 값을 입력 : 10
 * ar[3]의 값을 입력 : 16
 * ar[4]의 값을 입력 : 8
 * 
How
배열 초기화 => 입력은 반복문으로 처리 => 출력
*/

public class ArrayEx5 {

	public static void main(String[] args) throws IOException, NumberFormatException{
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 계산
		int[] ar = new int[5];
		for(int i = 0 ; i < ar.length ; i++ ) {
			System.out.println("ar[" + i +"]값을 입력 : ");
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
		//출력
		for(int data:ar ) {
			 System.out.print(data + "  ");
		}
		System.out.println("\n");
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}

// 변수 선언
/*
 * BufferedReader br = new BufferedReader(System.in); InputStreamReader isr =
 * new InputStreamReader(br);
 * 
// 입력
 * for(int i = 0 ; i < ar.length ; i++) {
 * 	System.out.println("ar[0]의 값을 입력 : "); / 초기에는 특정 상수를 집어넣고 입력이 잘되면 반복문을 넣어준다.
 * 	ar[0] = Integer.parseInt(br.readLine());
 *  
 * ->
 * for(int i = 0 ; i < ar.length ; i++) {
 * System.out.println("ar[" + i +"]값을 입력 : ");
 * ar[i] = Integer.parseInt(br.readLine()); * 
// 출력
 * for(int data:ar ) {
 * System.out.print(data + "  ");
 * System.out.println("최대값 : " + max);
 * System.out.println("최소값 : " + min);
 *}
 */