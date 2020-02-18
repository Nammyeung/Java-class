package test20;

class Circle {
	int r;
	
	public int Circle(int r) {
		return r;
	}
	
	public double getSize(int r) {
		return Circle(r) * Circle(r) * Math.PI;
	}
}
public class CircleEx {

	public static void main(String[] args) {
		Circle ob = new Circle();
		System.out.printf("원의넓이 : %.2f", ob.getSize(10));

	}
}

// 2월 11일 생성자 및 상속에 대해 배움