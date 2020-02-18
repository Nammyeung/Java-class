package test18;

public class Shape {
	int x;
	int y;
	int z;
	
	public double Shape(double x) {
		return (double)(x*x*Math.PI);
	}
	public float Shape(float x, float y) {
		return (float)(x*y);
	}
	public double Shape(double x, double y, double z) {
		return (double)((x + y) * z / 2);
	}
}
