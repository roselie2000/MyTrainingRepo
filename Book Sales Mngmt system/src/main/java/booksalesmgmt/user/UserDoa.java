package booksalesmgmt.user;

public interface UserDoa {

	public void signUp(User us);//add the user to the database
	
	public void login(String name, String pwd);//check the availability of the user
	
	public void logout(int userId);//delete the user from the database
	
	public void orderBook(User us);//get the order from the user
	
	public void searchBook(User us);//display the book details
	
	public void cancelOrder(User us);//cancel the order
}
