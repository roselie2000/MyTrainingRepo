package bankingsystem;

import java.util.List;

public interface BankDoa {

	public void insertBranchDetails(Bank bk);
	
	public void removeBranchDetails(Bank bk);
	
	public void changeAddrOfBranch(String addr, String id);
	
	public List<Bank> displayBankDetails();
	
}
