package test27;

interface Calculation{
	abstract public void compute();
	abstract public void output();
}

class Circle {
	protected int r;
	protected double size;
	final protected double PI = 3.141592;
	public Circle(int r) {
		super();
		this.r = r;
	}
	public void compute() {};
	public void output() {};
}

class CircleArea extends Circle implements Calculation{
	public CircleArea(int r) {
		super(r);
		this.r = r;
	}
	@Override
	public void compute() {
			System.out.println(this.r*this.r*PI);
	}
	@Override
	public void output() {
		System.out.print("원의 넓이 : ");
		compute();
	}
	
}
class CircleRound extends Circle implements Calculation{
	public CircleRound(int r) {
		super(r);
		this.r = r;
	}
	@Override
	public void compute() {
		System.out.println(this.r*2*PI);
	}
	@Override
	public void output() {
		System.out.print("원의 둘레 : ");
		compute();
	}
}


public class Test27 {
	
	public static void main(String[] args) {
		CircleArea ob1 = new CircleArea(10);
		CircleRound ob2 = new CircleRound(10);
		ob1.compute();
		ob1.output();
		ob2.compute();
		ob2.output();

	}

}
