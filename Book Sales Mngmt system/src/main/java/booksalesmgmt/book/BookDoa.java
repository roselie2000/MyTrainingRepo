package booksalesmgmt.book;

import java.util.List;

import booksalesmgmt.orders.Orders;
import booksalesmgmt.user.User;

public interface BookDoa {

	public void addBooks(Books bk);
	
	public void minusQuantity(String id, int quant);
	
	public void addQuantity(String id, int quant);
	
	public void getOrders();
	
	public List<Books> getBookDetails();
	
	public List<User> getUserDetails();

}
