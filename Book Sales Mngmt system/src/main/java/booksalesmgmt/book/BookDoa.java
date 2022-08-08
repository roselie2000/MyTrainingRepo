package booksalesmgmt.book;

import java.util.List;
import booksalesmgmt.user.User;

public interface BookDoa {

	public void addBookDetails(Books bk);//adding books
	
	public void minusBookQuantity(String id, int quant);//reduce the quantity of the books
	
	public void addBookQuantity(String id, int quant);//add the quantity of the books
	
	public void getBookOrders();//get the orders details
	
	public void getOrderedUser();//get the ordered users details
	
	public List<Books> getBookDetails();//get the book details
	
	public List<User> getUserDetails();//get the user details
}
