package test24;

public class CircleSize extends Circle{
	public CircleSize() {
		super();
	}
	public CircleSize(int r) {
		super(r);
	}
	@Override
	public double getCalc() {
		return super.getR()*super.getR()*Math.PI;
	}
	@Override
	public String toString() {
		return super.toString() + "���� ���̴� " + getCalc() + "�Դϴ�";
	}
}
