package object;

/* 클래스명 : Sales
 * -item : String
 * -qty : int
 * -cost : int
 * +getter & setter
 * 
 * +toString():String ==> 출력문장 만들기
 * +getPrice():int ==> 수량 * 단가를 리턴
 * 
 * --결과
 * 품목 : apple
 * 수량 : 5
 * 단가 : 1200
 * 금액 : 6000원 //6000에 해당하는 값만 get으로 작성
 * (해당 문장을 toString으로)
 * 
 * apple	1200원짜리 5개 구입하려면 6000원이 필요함 ==> main에서 출력 getter이용
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
		return "품목 : " + item + "\n수량 : " + qty + "\n단가 : " + cost + "\n금액 : " + getPrice() + "원";
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

/* ********답안*********
 * class Sales{
 * 	private String item;
	private int qty;
	private int cost;
 * 	getter & setter (Source 활용)
 * 	toString()
 * 	return 
 *	public int getPrice() {
		return qty*cost;
	}
	ss.setItem("apple");
	ss.setQty(5);
	ss.setCost(1200);
	System.out.println(ss.getItem() + "	" + ss.getCost() + "원 짜리" + ss.getQty() + "개 구입하려면 " + ss.getPrice() + "원이 필요함)
 */