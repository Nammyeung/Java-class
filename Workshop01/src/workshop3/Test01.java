package workshop3;

public class Test01 {

	public static void main(String[] args) {
		int sum = 0;
		for(int j = 1 ; j <= 20 ; j++) {
			if(j % 2 != 0 && j % 3 != 0) {
				sum += j;
			}
		}
		System.out.println(sum);
	}

}
