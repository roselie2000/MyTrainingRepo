package bankingsystem.test;

import java.util.ArrayList;
import java.util.Scanner;

import bankingsystem.Bank;
import bankingsystem.Bankdb;

public class BankTest {

	public static void main(String[] args) {
		Bank bk = new Bank();//object creation for Bank
		Bankdb bkd = new Bankdb();//object creation for Bankdb
		Scanner sn = new Scanner(System.in);

		System.out.println("Enter 'i' for insert");
		System.out.println("Enter 'd' for display the records");
		System.out.println("Enter 'r' for remove the records");
		System.out.println("Enter 'u' for update the records" );
		String msg = sn.next();
		if(msg.equals("i")) {
			System.out.println("Enter the branch id :");
			String branchId = sn.next();
			bk.setBranchId(branchId);
			
			System.out.println("Enter the branch name :");
			String branchName = sn.next();
			bk.setBranchName(branchName);
			
			System.out.println("Enter the Address of the branch :");
			String address = sn.next();
			bk.setAddress(address);
	
			bkd.insertBranchDetails(bk);
		}
		else if(msg.equals("d")){
			ArrayList<Bank> data = new ArrayList<Bank>();
			data = (ArrayList<Bank>) bkd.displayBankDetails();
			for(int i=0; i<data.size(); i++) {
				System.out.println(data.get(i).getBranchId() + " " +data.get(i).getBranchName() + " " + data.get(i).getAddress());
			}
		}
		else if(msg.equals("r")) {
			System.out.println("Enter the branch id which is want to remove :");
			String id = sn.next();
			bk.setBranchId(id);
			bkd.removeBranchDetails(bk);
		}
		else if(msg.equals("u")) {
			System.out.println("Enter the branch id which is want to change :");
			String id = sn.next();
			bk.setBranchId(id);
			System.out.println("Enter the new address of the" + id + ":");
			String addr = sn.next();
			bk.setAddress(addr);
			bkd.changeAddrOfBranch(addr, id);
		}	
		else {
			System.out.println("Please!, enter valid option");
		}
	}


}
