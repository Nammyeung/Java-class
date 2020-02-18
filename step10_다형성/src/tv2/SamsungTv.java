package tv2;

public class SamsungTv implements Tv{
	@Override
	public void powerOn() {
		System.out.println("Samsung TV-전원을 켠다");
	}
	@Override
	public void powerOff() {
		System.out.println("Samsung TV-전원을 끈다");
	}
	@Override
	public void soundUp() {
		System.out.println("Samsung TV-소리를 높인다");
	}
	@Override
	public void soundDown() {
		System.out.println("Samsung TV-소리를 줄인다");
	}
}
