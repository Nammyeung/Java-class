package exception;
// unchecked exception
public class ExceptionEx2 {

	public static void main(String[] args) {
		int[] num = {10, 20, 30};
		
		try {
		for(int i = 0; i < 5; i++) {
			System.out.println(num[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ������ ���� ���� ");
		}
	}

}

/*Unchecked Exception

����, RuntimeException�� ���캸��. 

RuntimeException�� �ٽø��ϸ�, Unchecked Exception�̶�� ���� �� �ִµ�, �߻��� �� ���� ���ܸ� üũ������ �ʾƼ� 

(��, ���α׷����� �Ǽ������ؼ�) �߻��ϴ� �Ǽ��̱� �����̴�.

  => Code�� �߸� ���� ����� ����. 

=> ������ �帧���ٴ� core(�⺻)���� �κ��� ����. 

//�⺻�� �ȵ��ִ� �ڵ�. 

=> ������ �ϴµ��� ������ ����. �����ϸ� ������ �߻���. 

*/
