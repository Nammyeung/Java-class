package step02_������;

import java.io.BufferedReader; // �Է��� �� �Ϸ��� �ϸ� �ʹ� �����ϴ� �ڵ��ϼ��� �ݵ�� ���.
import java.io.IOException;
import java.io.InputStreamReader;

//�ܼ� : ǥ�� ����� ��ġ / ǥ�� �Է� ��ġ : Ű����(���콺 x, ���콺�� �Է� ��ġ) / 
public class inputTest1 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in); // control + space(�ڵ� �ϼ� ���)
		BufferedReader br = new BufferedReader(isr); // �Է��� �޴� ����� �������� ������ �̰� ���� ����. / br�̶�� �������� ���� �� �־���´�
		
		String name;
		char gender;
		int age;
		float weight;
		double tall;
		
		
		System.out.print("�̸��� �Է��ϼ��� : "); // out�̶�� Ŭ������ �ִ�. , output�� �߻� / println�� ����ϸ� \r\n�� ����� �� ���� �� �� �ִ�.(�Է� ����?)
		name = br.readLine();
		
		System.out.print("������ �Է��ϼ��� : ");
		gender = br.readLine().charAt(0); // 1. ���� 2. �Է� / �Լ��� �Է����� ����ϴ°� ��Ʈ, / �Լ��� ��� ���� ���´�.
		// charAt(i) : ���� 1�� ����
		// i�� �����ϰ��� �ϴ� ���� �ε���
		// �Է��� charAt(i) �տ� ��� :
		
		System.out.println("�ѱ۰� ��ǻ��".charAt(2));
		
		System.out.print("���̸� �Է��ϼ��� : ");
		age = Integer.parseInt(br.readLine()); // 1. ���� 2. �Է� / �Լ��� �Է����� ����ϴ°� ��Ʈ / �Ű�����, �Է�
		
		System.out.print("ü���� �Է��ϼ��� : ");
		weight = Float.parseFloat(br.readLine()); // 1. ���� 2. �Է� / �Լ��� �Է����� ����ϴ°� ��Ʈ / �Ű�����, �Է�
		
		System.out.print("������ �Է��ϼ��� : ");
		tall = Double.parseDouble(br.readLine()); // 1. ���� 2. �Է� / �Լ��� �Է����� ����ϴ°� ��Ʈ / �Ű�����, �Է�
		
		// br.readLine().Integer.parseInt(); (x) / Ŭ���� �Լ��� ����ϱ� ���� ���̶� ���������� ���� ����.
		
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("ü�� : " + weight);
		System.out.println("���� : " + tall);
	}

}
