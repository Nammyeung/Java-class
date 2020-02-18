package constructor;

public class ConstructorEx8 {

	public static void main(String[] args) {
		Book bk1 = new Book();
		bk1.setTitle("자바의 정석");
		bk1.setAuthor("김자바");
		bk1.setPage(500);
		System.out.println(bk1.toString());
		
		Book bk2 = new Book("jsp일주일만하면 전유성만큼 한다", "전유성", 200); // 매개변수 전달
		System.out.println("페이지 : " + bk2.getTitle());
		System.out.println("책저자 : " + bk2.getAuthor());
		System.out.println("페이지 : " + bk2.getPage());
		
		
	}

}

// int num [ 10 ][ 20 ][ 30 ] 