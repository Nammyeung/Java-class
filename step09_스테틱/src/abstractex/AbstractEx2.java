package abstractex;

abstract class Shape{
	abstract public void onDraw();
	abstract public void onDelete();
}
//------------------------------------------
class Rectangle extends Shape{

	@Override
	public void onDraw() {
		System.out.println("사각형을 그린다");
	}

	@Override
	public void onDelete() {
		System.out.println("사각형을 지운다");
	}
	
}
//------------------------------------------
class Circle extends Shape{

	@Override
	public void onDraw() {
		System.out.println("원을 그린다");
	}

	@Override
	public void onDelete() {
		System.out.println("원을 지운다");
	}
	
}


public class AbstractEx2 {

	public static void main(String[] args) {
		//정적 바인딩
		Rectangle rt = new Rectangle();
		rt.onDelete();
		rt.onDraw();
		Circle cc = new Circle();
		cc.onDelete();
		cc.onDraw();
		
		
		//동적 바인딩
		Shape sp = null;
		sp = new Rectangle();
		sp.onDelete();
		sp.onDraw();
		sp = new Circle();
		sp.onDelete();
		sp.onDraw();

	}

}
