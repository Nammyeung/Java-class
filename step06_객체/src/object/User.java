package object;

/* - (private)	+(public)	#(protected)
 * +name : String
 * +k : int
 * +e : int
 * +m : int

	+setUser(name : String, k : int, e : int, m : int) : void
	+getUser() :int
	+getUser() : String // �������� ����Ż ȣ��
*/
public class User {
	public String name;
	public int k;
	public int e;
	public int m;
	
	public void setUser(String name, int k, int e, int m) {
		this.name = name;
		this.k = k;
		this.e = e;
		this.m = m;
		
	}
	public int getTotal(int k, int e, int m) {
		int total = k + e + m;
		return total;
		
		}
	public String getUser() {
		return "�̸��� " + name + "�̰�, ������ " + getTotal(k, e, m) + "���Դϴ�.";
		// getTotal(k, e, m) => k+e+m�� ������ ��Ÿ���� ������ �Լ��� �и��� ���ش�.
		// getter : ���� ����

	}
}
/*
 * ******************���***************** 
 * public class User { 
 * public
 * String name; 
 * public int k; 
 * public int e; 
 * public int m;
 * public void setUser(String name, int k, int e, int m) {
 * 		/ this.name = name; (���� �Ѱ��ش�, �����Լ��� ������ �� �Լ��� ���ؼ� ���� ������ �Ѿ��)
 * 		  this.k = k;
 * 		  this.e = e;
 * 		  this.m = m;
 * }
 * public int getTotal() {
 * 		return 0; / k+e+m;
 * }
 * public String getUser() {
 * 		return ""; // ���ڿ� ���� / "�̸��� " + name + "�̰�, ������ " + getTotal() + "���Դϴ�"
 * }
 // �⺻����    */