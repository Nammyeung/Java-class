package object;
// Overload : 중복
/* overload method(중복함수) : 같은 이름의 함수를 여러번 구현 
 * 특성
 * 1. 함수 이름이 반드시 동일
 * 2. 매개변수의 타입이 다르거나 개수가 달라야 함.
 * 
 * 
*/

public class OverloadEx {
	int x = 17; // 전역변수
	int y = 15; // private을 안적으면 default 접근 지정자(기본 값이 정해진다는 뜻), public < default < private
	
	public int max() {
		return (x > y) ? x : y; // return의 결과는 x 또는 y => 자료형은 힌트, 관계 연산자는 항상 왼쪽을 기준으로(왼쪽이 오른쪽보다 큰가 or 왼쪽이 오른쪽보다 작은가)
	
	}
	public float max(float x, float y) {// 매개변수의 x, y를 사용하면서 위에는 가려짐(Overload와 같은 역할)
		return (x > y) ? x : y; // return의 결과는 x 또는 y => 자료형은 힌트, 관계 연산자는 항상 왼쪽을 기준으로(왼쪽이 오른쪽보다 큰가 or 왼쪽이 오른쪽보다 작은가)
	
	}
// 위의 메소드도 반응하고 밑의 메소드도 반응하고(2자료형을 모두 받고 싶을 때)		
	public static void main(String[] args) {
		OverloadEx ob = new OverloadEx();
		System.out.println("큰 수 : " + ob.max());
		System.out.println("큰 수 : " + ob.max(75,100));
		System.out.println("큰 수 : " + ob.max(75.5f, 100.4f));

	}

}
