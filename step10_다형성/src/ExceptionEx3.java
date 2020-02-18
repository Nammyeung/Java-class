package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//checked exception, Source�ڵ忡�� üũ�� ������ ����
public class ExceptionEx3 {
	String str;
	public ExceptionEx3() {
		input();
	}
	public void input()  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		try {
		str = br.readLine();
	    } catch (IOException e) {
//	    	try {
//	    		str = br.readLine();
//	    	    } catch (IOException el) {
//	    	    	el.printStackTrace(); // br.close();
//	    	    }
	    	e.printStackTrace(); // br.close();
	    	}
	    }

	public void output() {
		System.out.println("��� : " + str);
		}
	
	public static void main(String[] args) {
		new ExceptionEx3().output();

	}
	}


// Error�� ���� �߻��ߴ��� �˾ƺ� ��.

/*Checked Exception

Checked Exception�� 

Exceptionó���ڵ� ���θ� compiler�� check

 - ������ ������ ����!!

=> ���α׷� ���� �帧�� ���� �߻� ���ɼ��ִ� ��Ȳ�� ǥ��.(������ ���� �� �ִ� ��Ȳ)

=> Code���� ������ �ƴ϶�, �����Ȳ�� ���� �߻����ɼ� �ִ� ����.

=> ���α׷� ���� �帧�� �߻��� �� �ִ� ����.


 */
