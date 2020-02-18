package test25;

import java.util.Scanner;

abstract class Height{
	
	abstract public double getInch(double cm);
	
}
class Test42 extends Height{
	
	private static final double INCH = 2.54;
	
	@Override
	public double getInch(double cm) {
		return cm/INCH;
	}
}

public class Test25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		double a = sc.nextDouble();
		
		Height hi=new Test42();
		System.out.println("결과 : " + hi.getInch(a));
		sc.close();
		
	}

}
