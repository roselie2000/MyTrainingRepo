package booksalesmgmt.book;

public class Books {

	//data members of books
	String bookId;
	String bookName;
	String authorName;
	int versionNo;
	String publisher;
	String subject;
	int price;
	int quantity;
	
	//setter for book id
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	//getter for book id
	public String getBookId() {
		return bookId;
	}
	
	//setter for book name
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	//getter for book name
	public String getBookName() {
		return bookName;
	}
	
	//setter for book author name
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	//getter for book author name
	public String getAuthorName() {
		return authorName;
	}
	
	//setter for book version
	public void setVersion(int versionNo) {
		this.versionNo = versionNo;
	}
	
	//getter for book version
	public int getVersion() {
		return versionNo;
	}
	
	//setter for book publisher
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//getter for book publisher
	public String getPublisher() {
		return publisher;
	}
	
	//setter for book subject
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	//getter for book subject
	public String getSubject() {
		return subject;
	}
	
	//setter for book price
	public void setPrice(int price) {
		this.price = price;
	}
	
	//getter for book price
	public int getPrice() {
		return price;
	}
	
	//setter for book quantity
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//getter for book quantity
	public int getQuantity() {
		return quantity;
	}
}
