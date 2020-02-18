package object;

/* -base : int
 * -top : int
 * -height : int
 * 
 * +setTrapezoid(base:int, top:int, height:int):void
 * +calc():double	<-- 사다리꼴의 넓이를 구해서 리턴 (아랫변 + 윗변) * 높이 / 2.0
 * +toString() : String

*/

public class Trapezoid {
	private int base;
	private int top;
	private int height;
	
	public void setTrapezoid(int base, int top, int height) {
		this.base = base;
		this.top = top;
		this.height = height;
	}
	
	public double calc() {
		return (base + top) * height / 2.0;
	}

	@Override
	public String toString() {
		return "넓이 : " + calc();
	}
	
}

/* ********** 정담 *************
 * 팀 프로젝트시 class diagram을 보고 메소드로 접근(프로젝트 설계 단계에서 잘 협의해야 하는 이유)
 * public class Trapezoid {
 * private int base;
 * private int top;
 * private int height;
 * 
 * public void setTrapezoid(int base, int top, int height) {
 * 		this.base = base;
 * 		this.top = top;
 * 		this.height = height;
 *  
 * }
 * public double calc() {
 * 		return (base+top)*height / 2.0;
 * 
 * {
 * 
 * public String toString() {
 * 		return "넓이 : " + calc();
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/ 
