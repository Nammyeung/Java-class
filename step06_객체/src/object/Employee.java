package object;

/* -name : String
 * -dept : String
 * -pay : int
 * -score : double
 * 
 * +setName(name:String):void
 * +setDept(dept:String):void
 * +setPay(pay:int):void
 * +setScore(score:String):void
 * 
 * +getName():String
 * +getDept():String
 * +getPay():int
 * +getScore():double
 * 
 *  
*/

public class Employee {
	private String name; // ������ �����ϴ� ��� 1. ���� ����(setter) 2. ������ ���� �ҷ��� ��(getter).
	private String dept; // ������ �ܺο��� ���� ������ ���� ������ ���� ��ȿ�� �˻�� �����ϰ� ����.(��ü����?), ��������, ������ ����
	private int pay; // �����ͺ��̽����� �Ѿ�� ���� ���ͼ�Ʈ�� �ϴµ� getter, setter(��ȿ�� �˻� ����)�� ����ϸ�(��� : �Ű������� �ϳ� �� ����)
	private double score;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getPay() {
		return pay;
	}
	public double getScore() {
		return score;
	}
	
	@Override // ����� �޾Ƽ� ����Ѵ�.
	public String toString() {
		return "�̸��� " + name + "�̰�, " + dept + "�� �ٹ��ϸ�," + 
	"�޿���  " + pay + "��, �Ի缺���� " + score + "���Դϴ�";
	}
	
	public void setEmployee(String name, String dept, int pay, double score) {
		this.name = name;
		this.dept = dept;
		this.pay = pay;
		this.score = score;
	}
}



//Source => Generate Getters and Setters => 