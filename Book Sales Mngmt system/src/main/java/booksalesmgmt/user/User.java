package booksalesmgmt.user;

public class User {

	//data members for user
	private int userId;
	private String userName;
	private String password;
	private String email;
	private int bookRev;
	private int bookCan;
	private String doorNo;
	private String city;
	private String district;
	private String state;
	private String name;
	
	//setter for user id
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	//getter for user id
	public int getUserId() {
		return userId;
	}
	
	//setter for user name
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//getter for user name
	public String getUserName() {
		return userName;
	}
	
	//setter for user password
	public void setPassword(String password) {
		this.password = password;
	}
	
	//getter for user password
	public String getPassword() {
		return password;
	}
	
	//setter for user email
	public void setEmail(String email) {
		this.email = email;
	}
	
	//getter for user email
	public String getEmail() {
		return email;
	}
	
	//setter for user book received
	public void setBookRev(int bookRev) {
		this.bookRev = bookRev;
	}
	
	//getter for user book received
	public int getBookRev() {
		return bookRev;
	}
	
	//setter for user book canceled
	public void setBookCan(int bookCan) {
		this.bookCan = bookCan;
	}
	
	//getter for user book canceled
	public int getBookCan() {
		return bookCan;
	}
	
	//setter for user door no
	public void setDoorno(String doorNo) {
		this.doorNo = doorNo;
	}
	
	//getter for user door no
	public String getDoorno() {
		return doorNo;
	}
	
	//setter for user city
	public void setCity(String city) {
		this.city = city;
	}
	
	//getter for user city
	public String getCity() {
		return city;
	}
	
	//setter for user district
	public void setDistrict(String district) {
		this.district = district;
	}
	
	//getter for user district
	public String getDistrict() {
		return district;
	}
	
	//setter for user state
	public void setState(String state) {
		this.state = state;
	}
	
	//getter for user state
	public String getState() {
		return state;
	}
	
	//setter for user name
	public void setName(String name) {
		this.name = name;
	}
	
	//getter for user name
	public String getName() {
		return name;
	}
}
