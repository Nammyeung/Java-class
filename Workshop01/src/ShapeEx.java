package test18;

public class ShapeEx {
	
	public static void main(String[] args) {
		Shape circle = new Shape();
		Shape rectangle = new Shape();
		Shape Trapezoid = new Shape();
		
		System.out.printf("원의 넓이 : %.6f\n", circle.Shape(3));
		System.out.printf("사각형의 넓이 : %.1f\n", rectangle.Shape(4,5));
		System.out.println("사다리꼴의 넓이 : " + circle.Shape(3,4,7));
		
		

	}

}
