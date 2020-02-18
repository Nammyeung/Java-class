package inheritance;

class Branch{
	public Branch() {
		System.out.println("Branch default constructor"); // 5
	}
	public Branch(String str) { // this(); 없으면 디폴트 생성자(4) 수행 안함.
		this(); // 4
		//////////////////////////////////////////////////////////////////
		System.out.println(str +" Branch constructor"); // 6
	}
}
class Leaf extends Branch{
	public Leaf() {
		super("hi~"); // 3
		/////////////////////////////////////////////////////////////////////
		System.out.println("Leaf default constructor"); // 7
	}
	public Leaf(String str, int n) {
		this(); // 2
		//////////////////////////////////////////////////////////////////////
		System.out.println(str + " " + n + " Leaf constructor"); // 8
	}
}

public class InheritanceEx3 {

	public static void main(String[] args) {
		new Leaf("가나다", 10); // 1
		System.out.println("ooo"); // 9
	}

}

// class Branch{
//	public Branch() {
//		System.out.println("Branch default constructor"); // 4
//	}
//	public Branch(String str) { // this(); 없으면 디폴트 생성자(4) 수행 안함.
//		this(); // 3
//		System.out.println(str +" Branch constructor"); // 5
//	}
//}
// class Leaf extends Branch{
//	public Leaf() {
//		super("hi~"); // 2
//		System.out.println("Leaf default constructor"); // 6
//	}
//}
//
// public class InheritanceEx3 {
//
//	public static void main(String[] args) {
//		new Leaf(); // 1
//		System.out.println("ooo"); // 7
//	}
//
//}
