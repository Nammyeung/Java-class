package constructor;

public class Book {
	private String title;
	private String author;
	private int page;
	
	public Book() { // �����ڿ��� ������ ǥ������ ����(�����ڵ� ��������)
		super();
		this.title = title;
		this.author = author;
		this.page = page;
	}
	public Book(String title, String author, int page) { // �����ڿ��� ������ ǥ������ ����
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
		return title + "�� ���ڴ� " + author + "�̰� " + page + "�������� ������";
	}
	
}
