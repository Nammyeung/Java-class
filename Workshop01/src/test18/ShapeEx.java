package test18;

public class ShapeEx {
	
	public static void main(String[] args) {
		Shape circle = new Shape();
		Shape rectangle = new Shape();
		Shape Trapezoid = new Shape();
		
		System.out.printf("���� ���� : %.6f\n", circle.Shape(3));
		System.out.printf("�簢���� ���� : %.1f\n", rectangle.Shape(4,5));
		System.out.println("��ٸ����� ���� : " + circle.Shape(3,4,7));
		
		

	}

}
