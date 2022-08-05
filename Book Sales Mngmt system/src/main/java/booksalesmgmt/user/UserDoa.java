package booksalesmgmt.user;

public interface UserDoa {

	public void signUp(User us);
	public boolean login(String name, String pwd);
	public void order(User us);
	public void search(User us);
	public void cancel(User us);
}
