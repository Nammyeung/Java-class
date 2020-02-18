package step02_연산자;

import java.io.BufferedReader; // 입력을 다 하려고 하면 너무 불편하니 자동완성을 반드시 사용.
import java.io.IOException;
import java.io.InputStreamReader;

//콘솔 : 표준 입출력 장치 / 표준 입력 장치 : 키보드(마우스 x, 마우스는 입력 장치) / 
public class inputTest1 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in); // control + space(자동 완성 기능)
		BufferedReader br = new BufferedReader(isr); // 입력을 받는 방법은 여러가지 이지만 이게 가장 좋다. / br이라는 기억공간에 따로 더 넣어놓는다
		
		String name;
		char gender;
		int age;
		float weight;
		double tall;
		
		
		System.out.print("이름을 입력하세요 : "); // out이라는 클래스가 있다. , output이 발생 / println을 사용하면 \r\n을 사용할 떄 물고 들어갈 수 있다.(입력 값이?)
		name = br.readLine();
		
		System.out.print("성별을 입력하세요 : ");
		gender = br.readLine().charAt(0); // 1. 포함 2. 입력 / 함수의 입력으로 사용하는게 도트, / 함수의 결과 값이 나온다.
		// charAt(i) : 문자 1개 추출
		// i는 추출하고자 하는 값의 인덱스
		// 입력은 charAt(i) 앞에 기술 :
		
		System.out.println("한글과 컴퓨터".charAt(2));
		
		System.out.print("나이를 입력하세요 : ");
		age = Integer.parseInt(br.readLine()); // 1. 포함 2. 입력 / 함수의 입력으로 사용하는게 도트 / 매개변수, 입력
		
		System.out.print("체중을 입력하세요 : ");
		weight = Float.parseFloat(br.readLine()); // 1. 포함 2. 입력 / 함수의 입력으로 사용하는게 도트 / 매개변수, 입력
		
		System.out.print("신장을 입력하세요 : ");
		tall = Double.parseDouble(br.readLine()); // 1. 포함 2. 입력 / 함수의 입력으로 사용하는게 도트 / 매개변수, 입력
		
		// br.readLine().Integer.parseInt(); (x) / 클래스 함수를 사용하기 위한 것이라 문법적으로 맞지 않음.
		
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("체중 : " + weight);
		System.out.println("신장 : " + tall);
	}

}
