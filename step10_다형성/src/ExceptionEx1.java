package exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		/* $ java ExceptionEx1 2 ==> 2
		 * $ java ExceptionEx1 0 ==> 2	// ���� = java.lang.ArithmeticException
		 * $ java ExceptionEx1 p ==> 2	// ���� = NumberFormatException
		*/
		
		int var = 5;
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(var/n);
		}catch(Exception e) {
			System.out.println("�Էµ� ���� ������ �־��..");
			// exception�� ��Ӱ��迡 �����Ƿ� �ֻ������� ��Ƽ� �� ���� �ϱ⵵ �Ѵ�.
		}
// ���̽�, ���ڸ����̴� ��Ʈ�� �� �ȶ��� ������ ��찡 ����. but API�� ���� Ȱ���ϵ��� �Ѵ�.		
//		int var = 5;
//		try {
//			int n = Integer.parseInt(args[0]);
//			System.out.println(var/n);
//		}catch(ArithmeticException e) {
//			System.out.println("0���� ������ �����");
//		}catch(NumberFormatException e) {
//			System.out.println("���ڷ� �ٲܼ� �����ϴ�");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("�Էµ� ���� �����");
//		}finally {
//			System.out.println("������ ����");
//		}
	
		
		int n = Integer.parseInt(args[0]);
		System.out.println(var/n);

	}
}
///////////// ���� Ŭ���� ���� ����(���۸� �̹��� ����)
// NullPointerException : Ŭ������ ���� ���

/*
 * ���� ó�� Exception try-catch-finally, throws, ����� ���� ����
 * 
 * 
 * 
 * �ڹٴ� ���α׷� �����߿� �߻��� �� �ִ� ���� ó������ �����Ѵ�.
 * 
 * �ڹ��� ���� ó���� ���ܰ� �߻��� �޼��� ������ ���� ó���ϴ� ����� ���ܰ� �߻��� �޼ҵ带 ȣ���� ������ ���� ��ü�� �Ѱ��ִ� ���,
 * �׸��� ����� ���� ���ܸ� �����Ͽ� ó���ϴ� ����� �ִ�.
 * 
 * try{
 *
 *  ���� �߻� ���ɼ��� �ִ� �����;

 * }catch(���� Ÿ��1 �Ű�������){

 *  ����Ÿ��1�� ���ܰ� �߻��� ��� ó�� �����;

 * }catch(���� Ÿ�� n �Ű�������){

 * ����Ÿ�� n�� ���ܰ� �߻��� ��� ó�� �����;

 * }finally{
   }
 * 
 */