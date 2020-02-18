package constructor;

public class Book {
	private String title;
	private String author;
	private int page;
	
	public Book() { // 생성자에는 리턴을 표시하지 않음(접근자도 생략가능)
		super();
		this.title = title;
		this.author = author;
		this.page = page;
	}
	public Book(String title, String author, int page) { // 생성자에는 리턴을 표시하지 않음
		super();
		this.title = title;
		this.author = author;
		this.page = page;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public String toString() {
		return title + "의 저자는 " + author + "이고 " + page + "페이지로 구성됨";
	}
	
}
