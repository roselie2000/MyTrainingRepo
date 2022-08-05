package booksalesmgmt.book;

import java.util.List;

public interface BookDoa {

	public void addBooks(Books bk);
	
	public void updateQuantity(String id, int quant);
	
	public List<Books> getBookDetails();
}
