package exception;
// ����� ���� ����ó��
class MyException extends Exception{
	/*
	
	*/
	private static final long serialVersionUTD = 1L;
	
	public MyException() { // 1
		System.out.println("�ֵ��� ����~");
	}
}	
public class ExceptionEx4 {

	public static void main(String[] args) throws MyException{
		int age = Integer.parseInt(args[0]);
		
		if(age<19)
		throw new MyException(); // �ڵ����� ����� ��� throws, �����ڸ� ȣ�� // 1
		else 
		System.out.println("���~");
	}

	}

/*3. try-catch -finally & throws & throw

try catch finally	  - ����ó��
1. �����޼ҵ忡 ������ ��, ���������Ѵ�. ���� ó���� ���ϰ� �����ٰŴ�. 
    	 
throws	       - ����ó�� 	
2. �̰� ���������������, ���ܰ� �ִ��� ������ �𸣴ϱ� ����� �ش�.

throw		        - ���ܻ���	 
Checked Exception���� �����ִ°� ���� �޼ҵ忡�ٰ� ���ܸ� ����.

*/

