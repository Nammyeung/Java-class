package tv2;

public class LgTv implements Tv{
	@Override
	public void powerOn() {
		System.out.println("LG TV-������ �Ҵ�");
	}
	@Override
	public void powerOff() {
		System.out.println("LG TV-������ ����");
	}
	@Override
	public void soundUp() {
		System.out.println("LG TV-�Ҹ��� ���δ�");
	}
	@Override
	public void soundDown() {
		System.out.println("LG TV-�Ҹ��� ���δ�");
	}
	
	
}

/* �濵���� �Ǵܹ̽�
 * �������� ����, ���ϰ������б�, ���� ���� �迭, ��ǻ�� ����Ʈ���� => �����ʰ� ������ ����(with LG) <- LG�� �����ϱ� ������ �ο��� ������?(�������� GOOD)
 * ��� ���ϴ��� 
 * => ������ ����
 * �������� �̱����� ������ ������ ����Ʈ���� �ַ����� ��ƾ� �Ѵ�.(2�� ���� ���� => �濵���� ����), ����ü�谡 �����ϴ� ��Ÿ��, ����ȭ�� �� �ȵ�
 * �ݵ�ü�� ����.
 * ���� -> �����Ͼ�(���� �׻� ô�� ��)
 * FLAG�� ���� �ٲ���
 * �ϵ���� VS ����Ʈ���� // �ڵ��� ����(�� - ������), ������ ����
 * C�� ���ؾ� ������ �� �� �ִ�.
 * 

 
*/
