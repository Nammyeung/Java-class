package workshop3;

public class Test03 {

	public static void main(String[] args) {
		for(int i=1 ; i<7 ; i++) {
			for(int j=6 ; j>0 ; j--) {
				if(i+j == 6) {
					System.out.printf("%d + %d = %d\n",i,j,i+j);
				}
			}
		}
	}
}