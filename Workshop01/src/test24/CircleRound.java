package test24;

public class CircleRound extends Circle{
	public CircleRound() {
		
	}
	public CircleRound(int r) {
		super(r);
	}
	@Override
	public double getCalc() {
		return 2*super.getR()*Math.PI;
	}
	@Override
	public String toString() {
		return super.toString() + "���� �ѷ��� " + getCalc() + "�Դϴ�.";
	}
}