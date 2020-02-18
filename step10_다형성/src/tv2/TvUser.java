package tv2;
//결합도가 낮은 코드, 다형성 이용
public class TvUser {

	public static void main(String[] args) {
		String com=args[0];
		Tv tv = null;
		if(com.equals("LG") || com.equals("lg")) { // 동일(com == "LG") => 겹치지 말고 둘 중 하나만 통일해서 사용
			tv = new LgTv();
			
		} else if(com.equals("SAMSUNG")) {
			tv = new SamsungTv();
			
		} else {
			System.out.println("error");
		}
		tv.powerOn();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
// 메소드가 어느 한쪽에 종속되는 것이 아닌 독립적으로 동작.
	}

}
