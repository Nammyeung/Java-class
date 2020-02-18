package workshop3;

public class Test06 {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int sum = 0;
		for(int j = 1 ; j <= 100 ; j++) {
			if(j % i == 0) {
				System.out.print(j + " ");
				sum += j;
			}
		}
		System.out.print("= " + sum);
	}

}
