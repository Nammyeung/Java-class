package shape;

public class Triangle extends Shape implements Resize{
	public Triangle() {
		super();
	}
	public Triangle(int width, int height, String colors) {
		super(width,height,colors);
	}
	@Override
	public double getArea() {
		return width*height;
	}
	public void setResize(int size) {
		System.out.println(height + size);
	}
}
