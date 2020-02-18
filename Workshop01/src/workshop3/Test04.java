package workshop3;

public class Test04 {

	public static void main(String[] args) {
		for(int k=0 ; k<50 ; k++) {
		int i = (int)(Math.random()*5+1);
		System.out.print(i);
		k++;
		}
		System.out.println();
		for(int k=0 ; k<50 ; k++) {
		int t = (int)(Math.random()*10+1);
		if(t >= 1 && t <= 6) {
			System.out.print(t);
			}
		}
	}
}
