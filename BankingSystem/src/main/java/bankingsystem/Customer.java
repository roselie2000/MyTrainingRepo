package bankingsystem;

import java.sql.Date;

public class Customer {

	private int custId;
	private String custName;
	private Date dob;
	private String address;
	private long phoneno;
	private String branchId;
	
	public void setCustId(int custid) {
		this.custId = custid;
	}
	
	public int getCustId() {
		return custId;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	
	public long getPhoneno() {
		return phoneno;
	}
	
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	
	public String getBranchId() {
		return branchId;
	}
}
