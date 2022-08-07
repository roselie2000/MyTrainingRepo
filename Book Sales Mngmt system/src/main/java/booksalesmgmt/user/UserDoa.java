package booksalesmgmt.user;

public interface UserDoa {

	public void signUp(User us);
	
	public void login(String name, String pwd);
	
	public void logout(int userId);
	
	public void order(User us);
	
	public void search(User us);
	
	public void cancel(User us);
}
