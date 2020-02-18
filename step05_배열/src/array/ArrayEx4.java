package array;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		int[] num = new int[3]; // int형 배열 선언
		num[0] = Integer.parseInt(args[0]); // 숫자로 args의 0번째 값을 받아서 num의 첫번째 공간에 저장.
		num[1] = Integer.parseInt(args[1]); // args를 곧바로 받지 않는 이유는 곧바로 연산을 하지 않기 때문.(ex - 생년월일 입력 => 년,도,월,일 분리 => 나이 입력, 회원가입) or calender class 이용.
		num[2] = Integer.parseInt(args[2]);
	
		// 최대값 최소값
		int max = num[0];
		int min = num[0];
		
		for(int i = 1 ; i < num.length ; i++) {
			if(num[i] > max) {
				max = num[i];					
			}
			if(num[i] < min) {
				min = num[i];
			}
			System.out.println("최대값 : " + max);
			System.out.println("최소값 : " + min); // 에러 => 바이트 코드를 만들어내는 과정. / .class => java byte 코드
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min); // 에러 => 바이트 코드를 만들어내는 과정. / .class => java byte 코드
	}

}

// [ 10 ][ 15 ][ 5 ]
//   |
// 15 => 大[ 10 ] => 小[ 10 ]
// argument의 length를 잡는다?
// 컴퓨터의 기억공간 처리 방식 => 첫번째방 = 0번째방 / num int[3] => 기억공간 3개
// 메모리 8GB, 16GB, 32GB 변수 / 이름 / 크기 /주소 = 위치(메모리에 해당 내용이 모두 들어감) / 기본자료형 => char - 1byte 정수, byte - 1byte 정수 / byte 선언, 기억공간에 이름, 주소를 할당
// 단순하게 메모리상에 8칸의 기억공간을 가짐(2^8) <-> 객체의 경우 기억공간이 매우 많아짐(class로 선언), 파일을 객체라고 보면 된다. / 객체 class - 변수(1. 기본자료형, 2. 사용자 정의 자료형(ex - 클래스)), 함수
// new => 기억공간을 할당하는 역할 = +를 선언하는 것과 동일 / class에서 파생되는 변수나 함수를 기억공간에 할당.
// Java는 90년대 중 후반에 탄생한 언어
// short int char 4, char보다는 크고 2byte보다는 작고 / c 언어의 경우 short = int
// main함수는 운영체제가 호출 (ex - hwp프로그램은 타이핑 or 더블클릭으로 호출) // return 운영체제가 호출하는 것 동일