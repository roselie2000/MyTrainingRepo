package booksalesmgmt;

public class Orders {

	String userId;
	String bookId;
	int quantity;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	public String getBookId() {
		return bookId;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
}
