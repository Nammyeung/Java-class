package inputex;
//BufferedReader - �о���̴� �뵵, �ӵ��� ������ ó�����ִ� ������ �Ѵ�.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BufferedReader, InputStreamReader - ���ӿ��� �������� �Դ´ٴ��� ��ɾ �޾Ƶ��϶�
public class inputTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		InputStreamReader isr = new InputStreamReader(System.in);// ��ü like isr : ����� ���� �ڷ���
		BufferedReader br = new BufferedReader(isr); // isr => �Ű����� ����. / Ű���忡�� �Է��� ��ü�� bufferedReader�� ����.
		int eno; // �ʱ�ȭ - �ڷ����� �����ϴ� ��?
		String ename;
		char dept;
		double score;
		
		System.out.print("�����ȣ�� �Է��ϼ��� : "); // ����Ʈ����, ��׶��� �����غ��� �ٹٲ� ����� ���� �͵��� ���� ����ϹǷ� print������ �ٲٴ� ���� ����.
		eno = Integer.parseInt(br.readLine()); // parsing ���� / �Ű����� o
		
		System.out.print("����̸��� �Է��ϼ��� : ");
		ename = br.readLine(); // bufferedReader���� readLine �޼���, �ش� �޼ҵ带 �������� �� ����� ���������� ���´�.
	    
		System.out.print("�μ��ڵ带 �Է��ϼ��� : ");
		dept = br.readLine().charAt(0); // �μ��ڵ� �Է��ϸ� A\r\n �����ǵ�(�ٹٲ�)�� �����, �ƽ�Ű�ڵ忡 �ΰ��� �и��Ǿ�����.
				
		System.out.print("�Ի缺���� �Է��ϼ��� : ");
		score = Double.parseDouble(br.readLine());	
		
		System.out.println("�����ȣ : " + eno);
		System.out.println("����̸� : " + ename);
		System.out.println("�μ��ڵ� : " + dept);
		System.out.printf("�Ի缺�� : %.2f��\n", score);
		
	}

}

/* �����ǵ�(LF : Line Feed) => ���� ��ġ���� �ٷ� �Ʒ��� �̵�

ĳ��������(CR: Carriage return) => Ŀ���� ��ġ�� ������ �̵�

printf("Line Feed \n");

printf("Carriage Return \r");

*/


