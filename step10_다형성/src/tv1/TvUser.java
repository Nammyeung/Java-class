package tv1;
//결합도가 높은 코드
public class TvUser {

	public static void main(String[] args) {
		String com=args[0];
		
		if(com.equals("LG") || com.equals("lg")) { // 동일(com == "LG") => 겹치지 말고 둘 중 하나만 통일해서 사용
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
