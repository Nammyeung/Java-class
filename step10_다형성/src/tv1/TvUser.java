package tv1;
//���յ��� ���� �ڵ�
public class TvUser {

	public static void main(String[] args) {
		String com=args[0];
		
		if(com.equals("LG") || com.equals("lg")) { // ����(com == "LG") => ��ġ�� ���� �� �� �ϳ��� �����ؼ� ���
			LgTv tv = new LgTv();
			tv.powerOn();
			tv.volumeUp();
			tv.volumeDown();
			tv.powerOff();
		} else if(com.equals("SAMSUNG")) {
			SamsungTv tv = new SamsungTv();
			tv.turnOn();
			tv.soundUp();
			tv.soundDown();
			tv.turnOff();
		} else {
			System.out.println("error");
		}

	}

}
