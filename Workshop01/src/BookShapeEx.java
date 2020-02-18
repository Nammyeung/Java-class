package test19;

class BookShop {
	String bname;
	String author;
	int price;

	public void setBook(String bname, String author, int price) {
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	
	public void viewBook() {
		
	}

	
	
	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "책이름 : " + bname + "\n 저  자 : " + author + "\n 가  격 : " + price + "원";
	}
}


public class BookShapeEx {

	public static void main(String[] args) {
		BookShop ob = new BookShop();
		ob.setBook("자바완성", "황완성", 25000);
		System.out.println(ob.toString());
		System.out.println();
		ob.setBname("JSP잡기");
		ob.setAuthor("송JP");
		ob.setPrice(3500);
		System.out.println(ob.toString());

	}

}
