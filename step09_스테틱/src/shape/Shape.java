package shape;

/* -x:int
 * -y:int
 * +Shape()
 * +Shape(x:int, y:int)
 * +setter & getter
 * +getSize():double
 * 
*/

public class Shape {
	
	protected int x;
	protected int y;
	
	public Shape() {
		
	}
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double getSize() { // Override 시킬 메소드의 리턴값은 초기값으로 지정. / abstract public double getSize();
		return 0.0; // 무난하게 넘어갈 수 있어서 그냥 넣는 것.
	}
	

}
