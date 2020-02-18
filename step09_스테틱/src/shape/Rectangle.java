package shape;

/* +Rectangle()
 * +Rectangle(x:int, y:int)
 * +getSize():double
*/
public class Rectangle extends Shape{
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(int x, int y) {
		super(x, y);
	
	}
	@Override
	public double getSize() {
		return super.getX()*super.getY();
	}
	
}

