package step02_������;
/* �ƽ�Ű�ڵ� = 7��Ʈ ������ȯ�� �ڵ� 2**7 ���� �ڷ�ǥ��
 * A : 65, a : 97   \n : 13
 */


public class AsciiCode {

	public static void main(String[] args) {
		System.out.println("A : " + (int)'A'); // (int)'A' : ���� A�� ���ڷ� ���� �� �ְ� �ٲپ� �޶�.
		System.out.println("a : " + (int)'a'); // (int)'A' : ���� A�� ���ڷ� ���� �� �ְ� �ٲپ� �޶�. / ��ȣ�ȿ� �ڷ��� => ĳ����(casting) / �ڷ��� => ����, ���ڰ� ����� �� �ִ� ������ (ex : class => �ڷ���)
		System.out.println("\\n : " + (int)'\n'); // (int)'A' : ���� A�� ���ڷ� ���� �� �ְ� �ٲپ� �޶�. => �ڷ��� ����ȯ 
		
		System.out.println(65 + " : " + (char)65);
		System.out.println(65 + " : " + (char)97); // �ڹٿ��� ������ ����ϴ� ���̰ų� �����ϰų� ����� �� ���� ���ǵ� �ڷ����� ��ȯ�ؼ� ó���ϴ� ���� �ǹ��ϴ� ������ ĳ���� �����ڶ� �Ѵ�.(�ڷ��� ����ȯ)
	
		System.out.println("------------------------");
		
		System.out.println('A'+1); // char + int = int // Ctrl + Shift + x => ��ҹ��� ��ȯ
		System.out.println((char)('A'+1)); // ��ҹ��� ��ȯ�� �� ���
		
		System.out.println(('a'-32));
		System.out.println((char)('a'-32));
		
		System.out.println('A'+'B'); // char + char = int;
	}

}
