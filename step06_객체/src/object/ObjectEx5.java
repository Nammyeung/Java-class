package object;

/* Ŭ������ : Sales
 * -item : String
 * -qty : int
 * -cost : int
 * +getter & setter
 * 
 * +toString():String ==> ��¹��� �����
 * +getPrice():int ==> ���� * �ܰ��� ����
 * 
 * --���
 * ǰ�� : apple
 * ���� : 5
 * �ܰ� : 1200
 * �ݾ� : 6000�� //6000�� �ش��ϴ� ���� get���� �ۼ�
 * (�ش� ������ toString����)
 * 
 * apple	1200��¥�� 5�� �����Ϸ��� 6000���� �ʿ��� ==> main���� ��� getter�̿�
*/
class Sales{
	private String item;
	private int qty;
	private int cost;
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getPrice() {
		return qty*cost;
	}
	
	@Override
	public String toString() {
		return "ǰ�� : " + item + "\n���� : " + qty + "\n�ܰ� : " + cost + "\n�ݾ� : " + getPrice() + "��";
	}
		
	public void setSales(String item, int qty, int cost) {
		this.item = item;
		this.qty = qty;
		this.cost = cost;
	}
}

	public class ObjectEx5 {
		
	public static void main(String[] args) {
		Sales ss = new Sales();
		ss.setSales("apple",5,1200);
		System.out.println(ss.toString());

	}

}

/* ********���*********
 * class Sales{
 * 	private String item;
	private int qty;
	private int cost;
 * 	getter & setter (Source Ȱ��)
 * 	toString()
 * 	return 
 *	public int getPrice() {
		return qty*cost;
	}
	ss.setItem("apple");
	ss.setQty(5);
	ss.setCost(1200);
	System.out.println(ss.getItem() + "	" + ss.getCost() + "�� ¥��" + ss.getQty() + "�� �����Ϸ��� " + ss.getPrice() + "���� �ʿ���)
 */