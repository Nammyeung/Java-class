package animal;

import java.util.Scanner;

//정적 바인딩 : 컴파일 시점에 호출 함수 결정
public class AnimalMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Dog dd = null; Cat cc = null; Fish ff = null; Duck dk = null;
		while(true) {
			System.out.println("1.Dog 2.Cat 3.Fish 4.Duck 5.Exit\n선택 : ");
			n = sc.nextInt();
			switch(n) {
			case 1: dd = new Dog(); dd.speak(); dd.walk(); break; 
			// 매번 객체가 만들어짐, 객체가 많아지면 더 많이 생성.
			case 2: cc = new Cat(); cc.speak(); cc.walk(); break; 
			// 이런식으로 만들면 메모리를 많이 잡아먹음.
			case 3: ff = new Fish(); ff.speak(); ff.walk(); break; 
			// 장점 : 항상 메모리에 있으니까 빠름.
			case 4: dk = new Duck(); dk.speak(); dk.walk(); break;
			default: System.out.println("*** 종료합니다 ***");
			sc.close();
			System.exit(0);
			// 정적 바인딩
			}
		}

	}

}

// Cat	Dog		Duck	Fish
// 야옹	멍멍		꽥꽥		소리가없다
// 네발	네발		두발		헤엄쳐다닌다
