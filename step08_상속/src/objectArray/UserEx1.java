package objectArray;

public class UserEx1 {

	public static void main(String[] args) {
		User ob1 = new User("kim", "010-123-4567");
		User ob2 = new User("lee", "010-456-7890");
		User ob3 = new User("park", "010-777-8080"); // °´Ã¼ 3°³ »ý¼º
		System.out.println(ob1.getName() + "\t" + ob1.getPhone()); // getter¸¦ ÀÌ¿ëÇØ¼­ Ãâ·Â
		System.out.println(ob2.getName() + "\t" + ob2.getPhone()); 
		System.out.println(ob3.getName() + "\t" + ob3.getPhone()); 
	
		
		
		
		
	}
	
}
// ob1 [] = ["kim"]["010~"] => °´Ã¼
// ob2 [] = ["kim"]["010~"] => °´Ã¼
// ob3 [] = ["kim"]["010~"] => °´Ã¼