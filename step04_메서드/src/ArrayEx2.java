package array;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		String [] car = {"소나타", "코란도", "포르테", "티코", "모닝"}; // {} => 값을 한 번에 대입하기 위해 brace사용
		// 다섯개의 기억 공간이 할당(변경 불가)
		car[3] = "마티즈"; // 저장값 변경 방법
		
		for(String st : car)
			System.out.println(st);
		
		
	}

}
