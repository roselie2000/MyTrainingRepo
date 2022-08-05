package booksalesmgmt.book;

public class Books {

	String bookId;
	String bookName;
	String authorName;
	int versionNo;
	String publisher;
	String subject;
	int price;
	int quantity;
	
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	public String getBookId() {
		return bookId;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setVersion(int versionNo) {
		this.versionNo = versionNo;
	}
	
	public int getVersion() {
		return versionNo;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
}
