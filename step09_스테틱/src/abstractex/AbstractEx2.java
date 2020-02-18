package abstractex;

abstract class Shape{
	abstract public void onDraw();
	abstract public void onDelete();
}
//------------------------------------------
class Rectangle extends Shape{

	@Override
	public void onDraw() {
		System.out.println("�簢���� �׸���");
	}

	@Override
	public void onDelete() {
		System.out.println("�簢���� �����");
	}
	
}
//------------------------------------------
class Circle extends Shape{

	@Override
	public void onDraw() {
		System.out.println("���� �׸���");
	}

	@Override
	public void onDelete() {
		System.out.println("���� �����");
	}
	
}


public class AbstractEx2 {

	public static void main(String[] args) {
		//���� ���ε�
		Rectangle rt = new Rectangle();
		rt.onDelete();
		rt.onDraw();
		Circle cc = new Circle();
		cc.onDelete();
		cc.onDraw();
		
		
		//���� ���ε�
		Shape sp = null;
		sp = new Rectangle();
		sp.onDelete();
		sp.onDraw();
		sp = new Circle();
		sp.onDelete();
		sp.onDraw();

	}

}
