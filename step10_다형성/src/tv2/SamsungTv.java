package tv2;

public class SamsungTv implements Tv{
	@Override
	public void powerOn() {
		System.out.println("Samsung TV-������ �Ҵ�");
	}
	@Override
	public void powerOff() {
		System.out.println("Samsung TV-������ ����");
	}
	@Override
	public void soundUp() {
		System.out.println("Samsung TV-�Ҹ��� ���δ�");
	}
	@Override
	public void soundDown() {
		System.out.println("Samsung TV-�Ҹ��� ���δ�");
	}
}
