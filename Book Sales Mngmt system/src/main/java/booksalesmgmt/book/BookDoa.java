package booksalesmgmt.book;

import java.util.List;
import booksalesmgmt.user.User;

public interface BookDoa {

	public void addBooks(Books bk);//adding books
	
	public void minusQuantity(String id, int quant);//reduce the quantity of the books
	
	public void addQuantity(String id, int quant);//add the quantity of the books
	
	public void getOrders();//get the orders details
	
	public void getOrderedUser();//get the ordered users details
	
	public List<Books> getBookDetails();//get the book details
	
	public List<User> getUserDetails();//get the user details
}
