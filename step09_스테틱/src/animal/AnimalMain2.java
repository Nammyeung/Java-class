package animal;

import java.util.Scanner;

//동적 바인딩 : 런타임에 호출 함수를 결정, 코딩량이 줄어듬 / 단점 : 속도가 조금 느려짐
public class AnimalMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Animal ani = null;
		while(true) {
			System.out.println("1.Dog 2.Cat 3.Fish 4.Duck 5.Exit\n선택 : ");
			n = sc.nextInt();
			switch(n) {
			case 1: ani = new Dog(); break; // 부모클래스의 참조변수로 자식 객체 생성
			case 2: ani = new Cat(); break; 
			case 3: ani = new Fish(); break; 
			case 4: ani = new Duck(); break;
			default: System.out.println("*** 종료합니다 ***");
			sc.close();
			System.exit(0);
		

			}
			ani.speak();
			ani.walk(); // 메소드를 한 번만 호출해주면 객체에 따라서 필요한 메소드를 알아서 찾아감.
		}
	}
}

