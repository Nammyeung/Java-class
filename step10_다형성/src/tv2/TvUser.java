package tv2;
//���յ��� ���� �ڵ�, ������ �̿�
public class TvUser {

	public static void main(String[] args) {
		String com=args[0];
		Tv tv = null;
		if(com.equals("LG") || com.equals("lg")) { // ����(com == "LG") => ��ġ�� ���� �� �� �ϳ��� �����ؼ� ���
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
// �޼ҵ尡 ��� ���ʿ� ���ӵǴ� ���� �ƴ� ���������� ����.
	}

}
