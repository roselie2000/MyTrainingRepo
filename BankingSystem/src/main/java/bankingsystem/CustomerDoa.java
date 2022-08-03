package bankingsystem;

import java.util.List;

public interface CustomerDoa {

	public void insertCustDetails(Customer cust);//method for insert data
	 
	public void removeCustDetails(Customer cust);//method for remove data
	
	public void changeAddrOfCust(Customer cust);//method for update data
	
	public List<Customer> displayCustDetails();//method for display data
}
